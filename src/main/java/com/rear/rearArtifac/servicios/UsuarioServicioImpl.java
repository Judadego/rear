package com.rear.rearArtifac.servicios;

import com.rear.rearArtifac.controllers.dto.UsuarioRegistroDto;
import com.rear.rearArtifac.entities.Rol;
import com.rear.rearArtifac.entities.Usuario;
import com.rear.rearArtifac.repositories.UsuarioRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service//@Component
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired//de prueba
    private UsuarioRepository usrRepo;

    @Autowired
    private BCryptPasswordEncoder passwEncoder;

    public UsuarioServicioImpl(UsuarioRepository usrRepo) {
        super();
        this.usrRepo = usrRepo;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDto registroDto) {
        Usuario usuario = new Usuario(
        registroDto.getId(),
        registroDto.getFname(), 
        registroDto.getLname(), 
        registroDto.getTypeDni(), 
        registroDto.getPhone(),
        registroDto.getEmail(), 
        passwEncoder.encode(registroDto.getPassw()),Arrays.asList(new Rol("Role_User")));
        return usrRepo.save(usuario);
    }

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usrRepo.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario y/o password inválidos");
		}
        return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}
	
	@Override
	public List<Usuario> listarUsuarios() {
		return usrRepo.findAll();
	}
    
}

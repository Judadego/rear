package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.UsuarioRegistroDto;
import com.rear.rearArtifac.entities.Usuario;

public interface UsuarioServicio extends UserDetailsService{

    public Usuario guardar(UsuarioRegistroDto registroDto);

    public List<Usuario> listarUsuarios();
}

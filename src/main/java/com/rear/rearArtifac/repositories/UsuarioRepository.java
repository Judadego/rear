package com.rear.rearArtifac.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rear.rearArtifac.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    /*public abstract java.util.List<Usuario> findAllByUsuario(Usuario usuario);*/
    //public Usuario findByIdU(Long Id_user);
    public Usuario findByEmail(String email);

    public Optional<Usuario> findById(Long id);

    //public Usuario fingByIdU(Long id);

}

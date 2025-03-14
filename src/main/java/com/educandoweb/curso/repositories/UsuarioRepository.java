package com.educandoweb.curso.repositories;

import com.educandoweb.curso.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

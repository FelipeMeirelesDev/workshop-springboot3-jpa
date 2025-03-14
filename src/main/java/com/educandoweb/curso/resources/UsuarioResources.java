package com.educandoweb.curso.resources;

import com.educandoweb.curso.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResources {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
      Usuario u = new Usuario(1L,"Felipe","felipe@gmail.com","99999","12345");
      return ResponseEntity.ok().body(u);
    }

}

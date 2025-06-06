package com.educandoweb.curso.resources;

import com.educandoweb.curso.entities.Pedido;
import com.educandoweb.curso.entities.Usuario;
import com.educandoweb.curso.services.PedidoServices;
import com.educandoweb.curso.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoServices service;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id){
        Pedido obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

package com.educandoweb.curso.services;

import com.educandoweb.curso.entities.Pedido;
import com.educandoweb.curso.entities.Usuario;
import com.educandoweb.curso.repositories.PedidoRepository;
import com.educandoweb.curso.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServices {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Pedido não encontrado! ID: " + id));
    }

}

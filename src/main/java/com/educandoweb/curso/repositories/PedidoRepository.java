package com.educandoweb.curso.repositories;

import com.educandoweb.curso.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

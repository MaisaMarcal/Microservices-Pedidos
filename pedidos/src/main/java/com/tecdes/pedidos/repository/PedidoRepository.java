package com.tecdes.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecdes.pedidos.model.Pedido;

public interface PedidoRepository  extends  JpaRepository<Pedido, Long> {
    
}

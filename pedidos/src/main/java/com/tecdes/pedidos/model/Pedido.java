package com.tecdes.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long produtoId;
    Integer quantidadePedida;
    String status;


    public Pedido() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProdutoId() { return produtoId; }
    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }
    public Integer getQuantidadePedida() { return quantidadePedida; }
    public void setQuantidadePedida(Integer quantidadePedida) { this.quantidadePedida = quantidadePedida; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}




    


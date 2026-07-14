package com.tecdes.pedidos.dto;

import lombok.Builder;
@Builder
public record ProdutoDTO (Long id, String nome, Double preco, Integer quantidadeEstoque)  {
    
}

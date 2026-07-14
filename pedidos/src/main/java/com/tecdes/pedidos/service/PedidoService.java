package com.tecdes.pedidos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.tecdes.pedidos.dto.ProdutoDTO;
import com.tecdes.pedidos.model.Pedido;
import com.tecdes.pedidos.repository.PedidoRepository;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final RestClient restClient;

    public PedidoService(PedidoRepository pedidoRepository,
                         RestClient restClient) {

        this.pedidoRepository = pedidoRepository;
        this.restClient = restClient;
    }

    public Pedido criarPedido(Pedido pedido) {

        ProdutoDTO produto = restClient
                .get()
                .uri("http://localhost:8081/produtos/{id}", pedido.getProdutoId())
                .retrieve()
                .body(ProdutoDTO.class);

        if (produto != null &&
                produto.quantidadeEstoque() >= pedido.getQuantidadePedida()) {

            pedido.setStatus("APROVADO");

        } else {

            pedido.setStatus("REJEITADO");

        }

        return pedidoRepository.save(pedido);
    }

}
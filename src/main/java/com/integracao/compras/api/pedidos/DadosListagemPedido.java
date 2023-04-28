package com.integracao.compras.api.pedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DadosListagemPedido(
		
		BigDecimal valor,
		Status status, 
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao
		) {

	public DadosListagemPedido(Pedido pedido) {
		this(pedido.getValor(), pedido.getStatus(), 
				pedido.getDataCriacao(), 
				pedido.getDataAtualizacao());
	}
}

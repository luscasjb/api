package integracao.compras.api.pedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DadosListagemPedido(
		
		BigDecimal valor,
		Status status, 
		LocalDateTime dataAtualizacao
		) {

	public DadosListagemPedido(Pedido pedido) {
		this(pedido.getValor(), pedido.getStatus(), pedido.getDataAtualizacao());
	}
}

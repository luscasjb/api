package integracao.compras.api.pedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DadosPedido(
		Integer cd_pedido, 
		
		@NotNull
		@DecimalMin(value = "0.00", message = "O valor mínimo do pedido é 0,00")
		BigDecimal valor,
		
		@NotBlank
		Status status, 
		
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao
		) {
}

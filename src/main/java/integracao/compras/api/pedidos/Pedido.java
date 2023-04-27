package integracao.compras.api.pedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "pedidos")
@Entity(name = "Pedido")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_pedido;
	private BigDecimal vr_pedido; 
	private LocalDateTime dataCriacao = LocalDateTime.now(); 
	private LocalDateTime dataAtualizacao;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Pedido(DadosPedido dados) {
		this.vr_pedido = dados.valor();
		this.status = dados.status();
		this.dataCriacao = dados.dataCriacao();
		this.dataAtualizacao = dados.dataAtualizacao();
	}

	public BigDecimal getValor() {
		return vr_pedido;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public Status getStatus() {
		return status;
	}
	
}

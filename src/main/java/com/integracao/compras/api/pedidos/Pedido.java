package com.integracao.compras.api.pedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "pedidos")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Pedido {

	public Pedido() {
		super();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CD_PEDIDO")
	private Long cd_pedido;
	
	@Column(name = "VR_PEDIDO")
	private BigDecimal vr_pedido; 
	
	@Column(name = "DT_CRIACAO")
	private LocalDateTime dataCriacao = LocalDateTime.now(); 
	
	@Column(name = "DT_ATUALIZACAO")
	private LocalDateTime dataAtualizacao = LocalDateTime.now();
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CD_STATUS")
	private Status status;
	
	public Pedido(DadosPedido dados) {
		this.vr_pedido = dados.valor();
		this.status = dados.status();
	}

	// Getters
	
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

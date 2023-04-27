package com.integracao.compras.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integracao.compras.api.pedidos.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}

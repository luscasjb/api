package com.integracao.compras.api.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integracao.compras.api.pedidos.DadosListagemPedido;
import com.integracao.compras.api.pedidos.DadosPedido;
import com.integracao.compras.api.pedidos.Pedido;
import com.integracao.compras.api.repository.PedidoRepository;

@RestController
@RequestMapping(value="/pedidos")
public class PedidosController {
	
	private static final Logger logger = LoggerFactory.getLogger(PedidosController.class);
	
	@Autowired
	private PedidoRepository repository;
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDePedidos", allEntries = true)
	public void criar(@RequestBody @Valid DadosPedido dados) {
		repository.save(new Pedido(dados));
		logger.info("Dados salvos com sucesso!");
	}
	
	@GetMapping
	@Cacheable(value = "listaDePedidos")
	public List<DadosListagemPedido> listar() {
		return repository.findAll().stream().map(DadosListagemPedido::new).toList();
	}
	
	/*@ResponseBody
	public Pedido consultar() {
		return repository.findById(); 
	}*/
}
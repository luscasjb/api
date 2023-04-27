package integracao.compras.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import integracao.compras.api.pedidos.DadosListagemPedido;
import integracao.compras.api.pedidos.DadosPedido;
import integracao.compras.api.pedidos.Pedido;
import integracao.compras.api.pedidos.PedidoRepository;

@RestController
@RequestMapping(value="/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidoRepository repository;
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDePedidos", allEntries = true)
	public void criar(@RequestBody @Valid DadosPedido dados) {
		repository.save(new Pedido(dados));
	}
	
	@GetMapping
	@Cacheable(value = "listaDePedidos")
	public List<DadosListagemPedido> listar() {
		return repository.findAll().stream().map(DadosListagemPedido::new).toList();
	}
	
}

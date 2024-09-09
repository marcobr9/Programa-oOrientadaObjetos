/**
 *
 */
package br.edu.ifs.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.edu.ifs.designpatterns.observer.Observador;
import br.edu.ifs.designpatterns.observer.Sujeito;
import br.edu.ifs.designpatterns.observer.impl.Cliente;
import br.edu.ifs.designpatterns.observer.impl.Produto;

/**
 *
 */
class TestObserver {

	/**
	 * 
	 */
	@Test
	@DisplayName("Teste Observer")
	void test() {

		/*
		 * Instanciação dos clientes e dos produtos que serão utilizados. Por padrão, os
		 * produtos são construídos com quantidade igual a zero, logo estão todos
		 * indisponíveis para compra.
		 */
		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("Diana");
		Cliente cliente3 = new Cliente("Manoel");
		
		/*
		 * A classe Cliente devem implementar a interface Observador
		 */
		assertInstanceOf(Observador.class, cliente1);
		assertInstanceOf(Observador.class, cliente2);
		assertInstanceOf(Observador.class, cliente3);

		Produto produto1 = new Produto("iPhone 15");
		Produto produto2 = new Produto("iPad Pro");
		
		/*
		 * A classe Produto devem implementar a interface Sujeito
		 */
		assertInstanceOf(Sujeito.class, produto1);
		assertInstanceOf(Sujeito.class, produto2);

		/*
		 * Tentando comprar um produto indisponível
		 */
		assertFalse(produto1.estaDisponivel());
		Exception e = assertThrows(IllegalStateException.class, () -> cliente1.comprar(produto1));
		assertEquals(e.getMessage(), "Produto indisponível");

		/*
		 * Tentando comprar um produto indisponível
		 */
		assertFalse(produto2.estaDisponivel());
		e = assertThrows(IllegalStateException.class, () -> cliente1.comprar(produto2));
		assertEquals(e.getMessage(), "Produto indisponível");

		/*
		 * Inscrevendo os clientes para serem notificados quando o produto 1 estiver
		 * disponível
		 */
		produto1.inscrever(cliente1);
		produto1.inscrever(cliente2);
		produto1.inscrever(cliente3);

		/*
		 * Inscrevendo os clientes para serem notificados quando o produto 2 estiver
		 * disponível
		 */
		produto2.inscrever(cliente1);
		produto2.inscrever(cliente3);

		/*
		 * Adicionando produtos.
		 *
		 * Os clientes devem ser notificados sobre a chegada dos produtos. Ao serem
		 * notificados, os clientes automaticamente comprarão um item do produto.
		 */
		produto1.adicionar(10);
		produto2.adicionar(10);

		/*
		 * A quantidade de produtos deve ser atualizada após a compra
		 */
		assertEquals(produto1.getQuantidade(), 7);
		assertEquals(produto2.getQuantidade(), 8);

		/*
		 * Verificando a lista de pedidos de cada cliente
		 */
		assertTrue(cliente1.getPedidos().containsAll(List.of("iPhone 15", "iPad Pro")));
		assertTrue(cliente2.getPedidos().containsAll(List.of("iPhone 15")));
		assertTrue(cliente3.getPedidos().containsAll(List.of("iPhone 15", "iPad Pro")));
	}
}
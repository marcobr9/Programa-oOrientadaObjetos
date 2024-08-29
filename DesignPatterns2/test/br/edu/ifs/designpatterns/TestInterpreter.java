/**
 *
 */
package br.edu.ifs.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.edu.ifs.designpatterns.command.Luz;
import br.edu.ifs.designpatterns.command.Televisao;
import br.edu.ifs.designpatterns.command.impl.LigarLuz;
import br.edu.ifs.designpatterns.command.impl.LigarTV;
import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoCondicional;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoMaior;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoSequencial;
import br.edu.ifs.designpatterns.interpreter.composed.ExpressaoTermo;
import br.edu.ifs.designpatterns.interpreter.simple.ExpressaoComando;
import br.edu.ifs.designpatterns.interpreter.simple.ExpressaoConstante;
import br.edu.ifs.designpatterns.interpreter.simple.ExpressaoVariavel;

/**
 *
 */
class TestInterpreter {

	/**
	 * Test method for
	 * {@link br.edu.ifs.designpatterns.interpreter.Expressao#interpretar()}.
	 */
	@Test
	@DisplayName("Teste Interpreter")
	void test() {

		/*
		 * Definindo os itens que serão controlados
		 */
		Luz luz1 = new Luz("Luz sala");
		Luz luz2 = new Luz("Luz cozinha");
		Luz luz3 = new Luz("Luz quarto 1");
		Luz luz4 = new Luz("Luz quarto 2");
		Luz luz5 = new Luz("Luz varanda");
		Luz luz6 = new Luz("Luz garagem");

		Televisao tv1 = new Televisao("TV sala");
		Televisao tv2 = new Televisao("TV quarto 1");

		/*
		 * Definindo uma expressão sequencial para ligar todos os itens
		 */
		ExpressaoSequencial sequencia = new ExpressaoSequencial();
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz1)));
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz2)));
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz3)));
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz4)));
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz5)));
		sequencia.addExpressao(new ExpressaoComando(new LigarLuz(luz6)));
		sequencia.addExpressao(new ExpressaoComando(new LigarTV(tv1)));
		sequencia.addExpressao(new ExpressaoComando(new LigarTV(tv2)));

		/*
		 * Configurando um horário para os itens serem ativados
		 * 
		 * Os itens estão programados para serem ativados a partir das 18 horas.
		 */
		LocalTime horaProgramada = LocalTime.of(18, 0);
		LocalTime horaAtual = LocalTime.of(17, 59);

		/*
		 * Definindo uma expressão condicional para que os itens sejam ligados após o
		 * horário programado
		 */
		ExpressaoTermo variavel = new ExpressaoVariavel("hora atual", horaAtual);
		ExpressaoTermo constante = new ExpressaoConstante(horaProgramada);
		ExpressaoTermo maior = new ExpressaoMaior(variavel, constante);

		Expressao expCondicional = new ExpressaoCondicional(maior, sequencia);

		/*
		 * Executando a expressão condicional
		 */
		expCondicional.interpretar();

		/*
		 * Verificando que os itens ainda estão desligados
		 */
		assertFalse(luz1.estaLigada());
		assertFalse(luz2.estaLigada());
		assertFalse(luz3.estaLigada());
		assertFalse(luz4.estaLigada());
		assertFalse(luz5.estaLigada());
		assertFalse(luz6.estaLigada());
		assertFalse(tv1.estaLigada());
		assertFalse(tv2.estaLigada());

		/*
		 * Definindo uma expressão condicional para que os itens sejam ligados após o
		 * horário programado
		 */
		horaAtual = LocalTime.of(18, 01);

		variavel = new ExpressaoVariavel("hora atual", horaAtual);
		constante = new ExpressaoConstante(horaProgramada);

		maior = new ExpressaoMaior(variavel, constante);

		expCondicional = new ExpressaoCondicional(maior, sequencia);

		/*
		 * Executando a expressão condicional
		 */
		expCondicional.interpretar();

		/*
		 * Verificando que os itens foram ligados
		 */
		assertTrue(luz1.estaLigada());
		assertTrue(luz2.estaLigada());
		assertTrue(luz3.estaLigada());
		assertTrue(luz4.estaLigada());
		assertTrue(luz5.estaLigada());
		assertTrue(luz6.estaLigada());
		assertTrue(tv1.estaLigada());
		assertTrue(tv2.estaLigada());

		/*
		 * Verificando a representação textual da expressão construída
		 */
		StringBuilder builder = new StringBuilder();
		builder.append("se hora atual maior do que 18:00 então:\n");
		builder.append("execute:\n");
		builder.append("\tligar Luz sala\n");
		builder.append("\tligar Luz cozinha\n");
		builder.append("\tligar Luz quarto 1\n");
		builder.append("\tligar Luz quarto 2\n");
		builder.append("\tligar Luz varanda\n");
		builder.append("\tligar Luz garagem\n");
		builder.append("\tligar TV sala\n");
		builder.append("\tligar TV quarto 1\n");

		assertEquals(expCondicional.toString(), builder.toString());
	}
}

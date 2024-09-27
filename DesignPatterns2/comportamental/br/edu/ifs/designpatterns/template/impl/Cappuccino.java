package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cappuccino implements Bebida {
	ArrayList<String> cappuccino = new ArrayList<String>();

	@Override
	public ArrayList<String> obterPreparo() {
		cappuccino.add("Preparar uma xícara");
		cappuccino.add("Adicionar uma colher de café");
		cappuccino.add("Adicionar uma colher de leite em pó");
		cappuccino.add("Adicionar uma colher de chocolate em pó");
		cappuccino.add("Adicionar água quente");
		return cappuccino;
	}

}

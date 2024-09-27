package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cafe implements Bebida{
	
	ArrayList<String> cafe = new ArrayList<String>();

	@Override
	public ArrayList<String> obterPreparo() {
		cafe.add("Preparar uma xícara");
		cafe.add("Adicionar uma colher de café");
		cafe.add("Adicionar água quente");
		return cafe;
	}

}

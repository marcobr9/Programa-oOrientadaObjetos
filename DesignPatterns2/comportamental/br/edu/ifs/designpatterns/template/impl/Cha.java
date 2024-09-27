package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cha implements Bebida{
	
	ArrayList<String> cha = new ArrayList<String>();

	@Override
	public ArrayList<String> obterPreparo() {
		cha.add("Preparar uma xícara");
		cha.add("Adicionar um sachê de chá");
		cha.add("Adicionar água quente");
		return cha;
	}

}

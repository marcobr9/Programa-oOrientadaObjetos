package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;
import br.edu.ifs.designpatterns.decorator.Decorator;

public class Creme extends Decorator{

	public Creme(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return c.custo()+1;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return c.getDescricao()+", com creme";
	}

}

package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;
import br.edu.ifs.designpatterns.decorator.Decorator;

public class Acucar extends Decorator{

	public Acucar(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return c.custo()+0.3;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return c.getDescricao()+", com açúcar";
	}

}

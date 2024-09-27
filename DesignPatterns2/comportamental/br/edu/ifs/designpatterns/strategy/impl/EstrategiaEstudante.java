package br.edu.ifs.designpatterns.strategy.impl;

import br.edu.ifs.designpatterns.strategy.EstrategiaDesconto;

public class EstrategiaEstudante implements EstrategiaDesconto{

	@Override
	public double calcularValor(double valor) {
		// TODO Auto-generated method stub
		return valor*0.5;
	}

}

package br.edu.ifs.designpatterns.strategy;

public class Ingresso {
	
	private double valor;
	private EstrategiaDesconto ed;
	
	public Ingresso(double valor, EstrategiaDesconto ed) {
		this.valor = valor;
		this.ed = ed;
	}
	
	public double calcularValor() {
		return this.ed.calcularValor(valor);
	}

}

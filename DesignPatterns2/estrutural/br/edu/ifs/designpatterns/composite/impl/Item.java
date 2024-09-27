package br.edu.ifs.designpatterns.composite.impl;

import br.edu.ifs.designpatterns.composite.Componente;

public class Item implements Componente{
	
	private String produto;
	private double valor;
	
	

	public Item(String produto, double valor) {
		super();
		this.produto = produto;
		this.valor = valor;
	}



	@Override
	public double calcularPreco() {
		// TODO Auto-generated method stub
		return valor;
	}



	public String getProduto() {
		return produto;
	}



	
	

}

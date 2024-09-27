package br.edu.ifs.designpatterns.composite.impl;

import java.util.ArrayList;

import br.edu.ifs.designpatterns.composite.Componente;

public class Combo implements Componente{
	
	ArrayList<Componente> componentes= new ArrayList<>();
	private String combo;
	
	

	public Combo(String combo) {
		super();
		this.combo = combo;
	}
	
	public void adicionar(Componente c) {
		componentes.add(c);
	}



	@Override
	public double calcularPreco() {
		
		double total=0;
		for(int i=0 ; i < componentes.size();i++) {
			total+= componentes.get(i).calcularPreco();
		}
		return total;
	}

}

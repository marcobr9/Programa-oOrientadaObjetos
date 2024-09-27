package br.edu.ifs.designpatterns.memento;

import java.util.ArrayList;

import br.edu.ifs.designpatterns.memento.impl.Jogo;

public class Armazenador {
	
	private ArrayList<Jogo> memoria = new ArrayList<Jogo>();  
	
	public Jogo recuperar() {
		if(memoria.isEmpty()) {
			throw new IllegalStateException("Histórico vazio");
		}else {
			return this.memoria.remove(this.memoria.size()-1);
		}
	}
	
	public void armazenar(Jogo copia) {
		this.memoria.add(copia);
	}

}

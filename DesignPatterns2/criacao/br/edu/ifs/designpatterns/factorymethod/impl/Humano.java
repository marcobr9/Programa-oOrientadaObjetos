package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.FabricaPersonagens;
import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Humano implements Personagem{

	
	public String atacar() {
		// TODO Auto-generated method stub
		return "Ataque: espada";
	}

	public String defender() {
		// TODO Auto-generated method stub
		return "Defesa: rolar";
	}


	public String usarMagia() {
		// TODO Auto-generated method stub
		return "Magia: raio de luz";
	}

}

package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens{
	
	private String tipo;
	private Personagem personagem;
	
	
	
	public FabricaPersonagens(String tipo, Personagem personagem) {
		super();
		this.tipo = tipo;
		this.personagem = personagem;
	}


	public void criarPersonagem(String tipo) {
		
		if(tipo=="orc") {
			Personagem orc= new Orc();
		}else if(tipo=="anão") {
			Personagem anao= new Anao();
		}else if(tipo=="elfo") {
			Personagem elfo= new Elfo();
		}else if(tipo=="humano") {
			Personagem humano= new Humano();
		}else if(tipo=="outro") {
			throw new IllegalStateException("Personagem não encontrado!");
		}
			
	}
	

	public String getTipo() {
		return tipo;
	}


	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String usarMagia() {
		// TODO Auto-generated method stub
		return null;
	}



}

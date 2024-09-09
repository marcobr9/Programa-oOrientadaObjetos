package br.edu.ifs.designpatterns.state;

public class MarioVoador implements State{
	
	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Capa giratória";
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario voador";
	}

	@Override
	public State pegarCogumelo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State pegarFlor() {
		// TODO Auto-generated method stub
		return new MarioFogo();
	}

	@Override
	public State pegarPena() {
		// TODO Auto-generated method stub
		return this ;
	}

	@Override
	public State sofreDano() {
		// TODO Auto-generated method stub
		return new SuperMario();
	}

}

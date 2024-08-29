package br.edu.ifs.designpatterns.State;

public class MarioVoador implements State{

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
		return this;
	}

	@Override
	public State sofreDano() {
		// TODO Auto-generated method stub
		return new SuperMario();
	}
	
	public String atacar(){
		return "ATAQUE_PENA";
	}

	public String obterEstado() {
		return "MARIO_VOADOR";
	}

}

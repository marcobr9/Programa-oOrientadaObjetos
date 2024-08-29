package br.edu.ifs.designpatterns.State;

public class SuperMario implements State{

	@Override
	public State pegarCogumelo() {
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
		return new MarioVoador();
	}

	@Override
	public State sofreDano() {
		return new Mario();
	}
	
	public String atacar(){
		return "ATAQUE_SUPER";
	}

	public String obterEstado() {
		return "MARIO_SUPER";
	}

}

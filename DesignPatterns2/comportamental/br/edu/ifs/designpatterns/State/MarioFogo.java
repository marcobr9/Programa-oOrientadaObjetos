package br.edu.ifs.designpatterns.State;

public class MarioFogo implements State{

	@Override
	public State pegarCogumelo() {
		return this;
	}

	@Override
	public State pegarFlor() {
		return this;
	}

	@Override
	public State pegarPena() {
		// TODO Auto-generated method stub
		return new MarioVoador();
	}

	@Override
	public State sofreDano() {
		// TODO Auto-generated method stub
		return new SuperMario();
	}
	
	public String atacar(){
		return "ATAQUE_FOGO";
	}

	public String obterEstado() {
		return "MARIO_FOGO";
	}

}

package br.edu.ifs.designpatterns.State;

public class Mario implements State{

	@Override
	public State pegarCogumelo() {
		return new SuperMario();
	}

	@Override
	public State pegarFlor() {
		return new MarioFogo();
	}

	@Override
	public State pegarPena() {
		// TODO Auto-generated method stub
		return new MarioVoador();
	}

	@Override
	public State sofreDano() {
		// TODO Auto-generated method stub
		return MarioMorto();
	}

	public String atacar(){
		return "ATAQUE_PEQUENO";
	}

	public String obterEstado() {
		return "MARIO_PEQUENO";
	}

}

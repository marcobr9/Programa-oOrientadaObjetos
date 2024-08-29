package br.edu.ifs.designpatterns.State;

public class MarioMorto implements State{

	@Override
	public State pegarCogumelo() {
		throw new IllegalStateException("Mario está sem vida!");
		return this;
	}

	@Override
	public State pegarFlor() {
		throw new IllegalStateException("Mario está sem vida!");
		return this;
	}

	@Override
	public State pegarPena() {
		throw new IllegalStateException("Mario está sem vida!");
		return this;
	}

	@Override
	public State sofreDano() {
		throw new IllegalStateException("Mario está sem vida!");
		return this;
	}
	
	public String atacar(){
		throw new IllegalStateException("Mario está sem vida!");
		return this;
	}

	public String obterEstado() {
		return "MARIO_MORTO";
	}

}

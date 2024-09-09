package br.edu.ifs.designpatterns.state;

public class MarioMorto implements State{
	
	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return  "Mario morto";
	}

	@Override
	public State pegarCogumelo() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public State pegarFlor() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public State pegarPena() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public State sofreDano() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

}

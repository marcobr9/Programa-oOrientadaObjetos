package br.edu.ifs.designpatterns.state;

public class MarioFogo implements State{
	
	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Bola de fogo";
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario de fogo";
	}

	@Override
	public State pegarCogumelo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State pegarFlor() {
		// TODO Auto-generated method stub
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


}

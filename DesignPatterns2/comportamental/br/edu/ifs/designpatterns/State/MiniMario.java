package br.edu.ifs.designpatterns.state;

public class MiniMario implements State{
	
	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Salto";
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario pequeno";
	}

	@Override
	public State pegarCogumelo() {
		// TODO Auto-generated method stub
		return new SuperMario();
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
		// TODO Auto-generated method stub
		return new MarioMorto();
	}

}

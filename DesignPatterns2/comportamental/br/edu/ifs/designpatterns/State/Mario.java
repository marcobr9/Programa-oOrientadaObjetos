package br.edu.ifs.designpatterns.state;

public class Mario {
	
	private State state;

	public Mario() {
		this.state= new MiniMario();
	}
	
	
	public String atacar() {
		// TODO Auto-generated method stub
		return state.atacar();
	}

	
	public String obterEstado() {
		// TODO Auto-generated method stub
		return state.obterEstado();
	}

	
	public void pegarCogumelo() {
		// TODO Auto-generated method stub
		this.state = state.pegarCogumelo();
	}

	
	public void pegarFlor() {
		// TODO Auto-generated method stub
		this.state =  state.pegarFlor();
	}


	public void pegarPena() {
		// TODO Auto-generated method stub
		this.state =  state.pegarPena();
	}


	public void sofreDano() {
		// TODO Auto-generated method stub
		this.state = this.state.sofreDano();
	}

}

package br.edu.ifs.designpatterns.memento.impl;

public class Jogo {
	
	private int saude;
	private int vidas;
	
	
	public Jogo() {
		super();
		this.saude = 100;
		this.vidas = 3;
	}
	
	private Jogo(int saude, int vidas) {
		this.saude=saude;
		this.vidas=vidas;
	}
	
	public Jogo salvar() {
		return new Jogo(this.saude, this.vidas);
	}
	
	public void causarDano(int dano) {
		saude= saude - dano;
		
		if(saude <=0 && vidas >= 1) {
			saude=100;
			vidas--;
		}if (vidas<1) {
			throw new IllegalStateException("Fim de Jogo");
		}
	}
	
	
	public void restaurar(Jogo copia) {
		this.saude= copia.saude;
		this.vidas= copia.vidas;
	}
	
	
	public int getSaude() {
		return saude;
	}
	public int getVidas() {
		return vidas;
	}
	public void setSaude(int saude) {
		this.saude = saude;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "{saúde: " + saude + ", vidas: " + vidas + "}";
	}
	
	
	
	
}

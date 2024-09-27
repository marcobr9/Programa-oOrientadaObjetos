package br.edu.ifs.designpatterns.builder.impl;

import br.edu.ifs.designpatterns.builder.Construtor;

public class ConstrutorComputador implements Construtor{
	
	private String processador;
	private int capacidadeHD;
	private int capacidadeRAM;

	@Override
	public void configurarProcessador(String processador) {
		this.processador=processador;
		
	}

	@Override
	public void configurarHD(int capacidade) {
		this.capacidadeHD=capacidade;
		
	}

	@Override
	public void configurarRAM(int capacidade) {
		this.capacidadeRAM=capacidade;
		
	}

	@Override
	public Computador obterResultado() {
		// TODO Auto-generated method stub
		return new Computador(this.processador,this.capacidadeHD,this.capacidadeRAM);
	}

}

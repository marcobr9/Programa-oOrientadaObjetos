package br.edu.ifs.designpatterns.builder.impl;

public class Computador {
	
	private String processador;
	private int HD;
	private int RAM;
	
	
	public Computador(String processador, int hD, int rAM) {
		super();
		this.processador = processador;
		HD = hD;
		RAM = rAM;
	}


	public String getProcessador() {
		return processador;
	}


	public int getHD() {
		return HD;
	}


	public int getRAM() {
		return RAM;
	}


	public void setProcessador(String processador) {
		this.processador = processador;
	}


	public void setHD(int hD) {
		HD = hD;
	}


	public void setRAM(int rAM) {
		RAM = rAM;
	}
	
	

}

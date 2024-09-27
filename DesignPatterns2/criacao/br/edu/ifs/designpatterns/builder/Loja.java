package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;
import br.edu.ifs.designpatterns.builder.impl.ConstrutorComputador;

public class Loja {
	
	private Construtor construtor;

	public Loja(ConstrutorComputador construtor) {
		this.construtor = construtor;
	}
	
	public Computador construirNotebook() {
		this.construtor.configurarProcessador("Core™ i7-1355U");
		this.construtor.configurarHD(512);
		this.construtor.configurarRAM(16);
		
		return construtor.obterResultado();
	}
	
	public Computador construirNotebookGamer() {
		this.construtor.configurarProcessador("Core i7-13650HX");
		this.construtor.configurarHD(1024);
		this.construtor.configurarRAM(16);
		
		return construtor.obterResultado();
	}
	
	public Computador construirNotebookUltra() {
		this.construtor.configurarProcessador("Core Ultra 7 155H");
		this.construtor.configurarHD(1024);
		this.construtor.configurarRAM(32);
		
		return construtor.obterResultado();
	}

}

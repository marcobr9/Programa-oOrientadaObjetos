package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public interface Construtor {
	
	public void configurarProcessador(String processador);
	public void configurarHD(int capacidade);
	public void configurarRAM(int capacidade);
	
	public Computador obterResultado();

}

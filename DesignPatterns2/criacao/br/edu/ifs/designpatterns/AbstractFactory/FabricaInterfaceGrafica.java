package br.edu.ifs.designpatterns.AbstractFactory;

public interface FabricaInterfaceGrafica {
	
	public Janela criarJanela();
	public Botao criarBotao();
	public Menu criarMenu();
	
}

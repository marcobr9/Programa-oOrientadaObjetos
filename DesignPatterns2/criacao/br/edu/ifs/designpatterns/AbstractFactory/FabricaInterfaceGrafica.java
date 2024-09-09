package br.edu.ifs.designpatterns.abstractfactory;

public interface FabricaInterfaceGrafica {
	
    public Janela criarJanela();
	
	public Menu criarMenu();
	
	public Botao criarBotao();

}

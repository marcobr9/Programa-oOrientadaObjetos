package br.edu.ifs.designpatterns.AbstractFactory;

public class TemaEscuro implements FabricaInterfaceGrafica {

	@Override
	public Janela criarJanela() {
		return JanelaEscura();
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return BotaoEscuro();
	}

	@Override
	public Menu criarMenu() {
		// TODO Auto-generated method stub
		return MenuEscuro();
	}

	

}

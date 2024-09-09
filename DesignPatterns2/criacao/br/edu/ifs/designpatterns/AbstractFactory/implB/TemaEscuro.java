package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.FabricaInterfaceGrafica;
import br.edu.ifs.designpatterns.abstractfactory.Janela;
import br.edu.ifs.designpatterns.abstractfactory.Menu;
import br.edu.ifs.designpatterns.abstractfactory.implA.BotaoEscuro;
import br.edu.ifs.designpatterns.abstractfactory.implA.JanelaEscura;
import br.edu.ifs.designpatterns.abstractfactory.implA.MenuEscuro;

public class TemaEscuro implements FabricaInterfaceGrafica{

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaEscura();
	}

	@Override
	public Menu criarMenu() {
		// TODO Auto-generated method stub
		return new MenuEscuro();
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoEscuro();
	}

}

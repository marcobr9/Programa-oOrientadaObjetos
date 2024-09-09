package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.String;

public class BotaoEscuro implements Botao{

	@Override
	public String obterCor() {
		// TODO Auto-generated method stub
		return "#4F4F4F";
	}

}

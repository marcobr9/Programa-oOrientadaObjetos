package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.String;

public class BotaoClaro implements Botao{

	@Override
	public String obterCor() {
		// TODO Auto-generated method stub
		return "#FFFAFA";
	}

}

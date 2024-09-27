package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens{
	
	
	
	



	public static Personagem criarPersonagem (String personagem) {
		
		if(personagem.equals("orc")) {
			return new Orc();
		}else if(personagem.equals("anão")) {
			return new Anao();
		}else if(personagem.equals("elfo")) {
			return new Elfo();
		}else if(personagem.equals("humano")) {
			return new Humano();
		}else if(personagem.equals("outro")) {
			throw new IllegalStateException("Personagem não encontrado!");
		}
		return null;
			
	}
	



}

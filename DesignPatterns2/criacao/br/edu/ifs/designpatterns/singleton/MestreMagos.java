package br.edu.ifs.designpatterns.singleton;

import java.util.Objects;

public class MestreMagos {
	
	private static MestreMagos instance;
	private int NivelMagia;
	
	private MestreMagos() {
		this.NivelMagia=1;
	}
	
	public static MestreMagos obterInstancia() {
		synchronized (MestreMagos.class) {
			if(Objects.isNull(instance)) {
				instance= new MestreMagos();
			}
		}
		return instance;
	}
	
	public int elevarNivel() {
		return(NivelMagia+1);
	}

	public int getNivelMagia() {
		return NivelMagia;
	}

	public void setNivelMagia(int nivelMagia) {
		NivelMagia = nivelMagia;
	}
	
	

}

package br.edu.ifs.designpatterns.prototype;

import java.util.Objects;

public abstract class  Robo {
	
	protected int at1;
	protected int at2;
	protected String at3;
	
	
	public Robo(int at1, int at2, String at3) {
		this.at1 = at1;
		this.at2 = at2;
		this.at3 = at3;
	}


	public int getAt1() {
		return at1;
	}


	public int getAt2() {
		return at2;
	}


	public String getAt3() {
		return at3;
	}


	public void setAt1(int at1) {
		this.at1 = at1;
	}


	public void setAt2(int at2) {
		this.at2 = at2;
	}


	public void setAt3(String at3) {
		this.at3 = at3;
	}
	
	public abstract Robo clonar();


	@Override
	public int hashCode() {
		return Objects.hash(at1, at2, at3);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robo other = (Robo) obj;
		return at1 == other.at1 && at2 == other.at2 && Objects.equals(at3, other.at3);
	}
	
	

}

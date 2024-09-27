package br.edu.ifs.designpatterns.decorator;

public abstract class Decorator implements Component {
	
	protected Component c;

	public Decorator(Component c) {
		super();
		this.c = c;
	}
	
	

}

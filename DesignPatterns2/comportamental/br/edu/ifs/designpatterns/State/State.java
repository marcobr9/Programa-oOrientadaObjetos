package br.edu.ifs.designpatterns.state;

public interface State {
	
    public String atacar();
	
	public String obterEstado();
	
	public State pegarCogumelo();
	
	public State pegarFlor();
	
	public State pegarPena();
	
	public State sofreDano();

}

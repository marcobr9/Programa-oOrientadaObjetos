package atividade04;

public class Usuario {
	
	private String nome;
	private String senha;
	private int acesso;
	
	public Usuario(String name, String senha, int acesso) {
		super();
		this.nome = name;
		this.senha = senha;
		this.acesso = acesso;
	}


	public String getName() {
		return nome;
	}


	public void setName(String name) {
		this.nome = name;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getAcesso() {
		return acesso;
	}


	public void setAcesso(int acesso) {
		this.acesso = acesso;
	}

}

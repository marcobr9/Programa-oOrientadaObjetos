package atividade04;

import java.util.Date;

public class Produto {
	
	private String nproduto;
	private String descricao;
	private int quantidade;
	private double preco;
	private Date validade;
	
	
	@Override
	public String toString() {
		return "Produto [nproduto=" + nproduto + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco="
				+ preco + ", validade=" + validade + "]";
	}


	public Produto(String nproduto, String descricao, int quantidade, double preco, Date validade) {
		super();
		this.nproduto = nproduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
	}
	
	
	public String getNproduto() {
		return nproduto;
	}
	public void setNproduto(String nproduto) {
		this.nproduto = nproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}

}

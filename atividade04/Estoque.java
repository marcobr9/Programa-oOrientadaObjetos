package atividade04;

import java.util.ArrayList;
import java.util.Date;

public class Estoque {
	
	public ArrayList<Produto> produtos= new ArrayList<>(); 
	
	public void estocar(String nome, String senha,String nproduto, String descricao, int quantidade, double preco, Date validade) {
		Validacao.autenticar(nome,senha);
		
		if(Validacao.getPermissao()==true) {
			produtos.add(nproduto, descricao,  quantidade, preco, validade);
		}else {
			System.out.println("Sem permissao.");
		}
	}


}

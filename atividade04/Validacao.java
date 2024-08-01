package atividade04;

public class Validacao {
	
private boolean permissao;
private boolean autenticado;
private int cont;


	
	public Validacao(boolean permissao, boolean autenticado) {
	super();
	this.permissao = permissao;
	this.autenticado = autenticado;
    }

	public boolean permite(boolean autenticado,int cont){
		
		for(int i=0; ListaUsuarios.lista.length < i; i++){
		   if(autenticado==true && ListaUsuarios.lista[i].getAcesso()>1) {
			   permissao=true;
		   }else {
			   try {
			      permissao=false;
			   }catch(NullPointerException e){
				   System.out.println("Permissao invalida.");
			   }
		   }
		}
		return permissao;
	}
	
	public static void autenticar(String nome,String senha) {
	
		for(int i=0; ListaUsuarios.lista.length < i; i++){
			   if(ListaUsuarios.lista[i].equals(nome) && ListaUsuarios.lista[i].equals(senha)) {
				   autenticado=true;
				   cont=i;
				   break;
			   }else {
				      autenticado=false;
				   }
			   }
		
		if(autenticado==true) {
			permite(autenticado,cont);
		}else {
		   System.out.println("Usuario e senha incorretos.");
		}
			
	}

	public boolean getPermissao() {
		return permissao;
	}

	public boolean getAutenticado() {
		return autenticado;
	}

	
	


}

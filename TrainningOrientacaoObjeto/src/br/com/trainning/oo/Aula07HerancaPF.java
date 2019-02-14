package br.com.trainning.oo;

public class Aula07HerancaPF extends Aula07HerancaPessoa {
//extends = inheritance
	
	private String cpf;
	
	
//constructors
	public Aula07HerancaPF(String cpf) {
		this.cpf = cpf;
	}

	public Aula07HerancaPF() {
	}

//getters and setters	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	protected void mostrarDados() {

		System.out.println("Pessoa Física: " 
		+ getNome() + " " + getCpf() 
		+ " " + getEndereco() + " " + getTelefone());
		
	}
	
	
}

package br.com.trainning.oo;

public abstract class Aula07HerancaPessoa {
//abstract = don't generate objects;
	
	private String nome;
	private String endereco;
	private String telefone;
	

	//this method has to be executed in other class that wants this class' information	
	protected abstract void mostrarDados();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}

package br.com.trainning.oo;

public class Aula06Construtores {
//variables -> private	
	private String nome;
	private int idade;
	private String endereco;	

//builders
	public Aula06Construtores(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	public Aula06Construtores() {

	}
//Other methods
	
//And then getters and setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}

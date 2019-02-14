package br.com.trainning.oo;

public class Aula06UsaConstrutores {

	public static void main(String[] args) {
		
		Aula06Construtores construtor1 = new Aula06Construtores(
				"Leonardo", 24, "Santo André");
		

		System.out.println(construtor1.getNome()+
				" "+ construtor1.getIdade()+
				" "+ construtor1.getEndereco());
		
		Aula06Construtores construtor2 = new Aula06Construtores();
		construtor2.setNome("Ramon");
		construtor2.setIdade(55);
		construtor2.setEndereco("São Paulo");
	}

}

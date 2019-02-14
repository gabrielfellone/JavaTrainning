package br.com.trainning.oo;

public class Aula02UsaCachorro {

	public static void main(String[] args) {
		
		Aula02Cachorro Meg = new Aula02Cachorro();
		Meg.tamanho = 1;
		Meg.sexo = "Femea";
		Meg.raca = "Pinscher";
		Meg.latir();
		
		Aula02Cachorro Toby = new Aula02Cachorro();
		Toby.tamanho = 3;
		Toby.sexo = "Macho";
		Toby.raca = "Vira-Lata";
		Toby.latir();
		

	}

}

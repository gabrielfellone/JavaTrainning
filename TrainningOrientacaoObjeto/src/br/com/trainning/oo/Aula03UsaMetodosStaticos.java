package br.com.trainning.oo;

public class Aula03UsaMetodosStaticos {

	public static void main(String[] args) {
		
		Aula03MetodosStaticos galinha = new Aula03MetodosStaticos();
		galinha.botar();
		galinha.botar();
		galinha.botar();

		Aula03MetodosStaticos frango = new Aula03MetodosStaticos();
		frango.botar();
		frango.botar();
		frango.botar();
		frango.botar();
		frango.botar();
		
		System.out.println("Galinha " + galinha.ovos);
		System.out.println("Frango " + frango.ovos);
		System.out.println("Total da Granja " + Aula03MetodosStaticos.ovosDaGranja);
	}

}

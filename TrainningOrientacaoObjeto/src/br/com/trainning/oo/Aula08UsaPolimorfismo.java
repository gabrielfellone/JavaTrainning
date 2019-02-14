package br.com.trainning.oo;

public class Aula08UsaPolimorfismo {
	
	public void fazerAnimalComer(Aula08PolimorfismoAnimal animal) {
		animal.comer();
	}

	public static void main(String[] args) {
		
		Aula08UsaPolimorfismo teste = new Aula08UsaPolimorfismo();
		teste.fazerAnimalComer(new Aula08PolimorfismoAnimal());
		teste.fazerAnimalComer(new Aula08PolimorfismoCao());
		teste.fazerAnimalComer(new Aula08PolimorfismoTigre());

		Aula08PolimorfismoAnimal animal = new Aula08PolimorfismoAnimal();
		animal.comer();
		
		Aula08PolimorfismoAnimal cao = new Aula08PolimorfismoCao();
		cao.comer();
		
		Aula08PolimorfismoAnimal tigre = new Aula08PolimorfismoTigre();
		tigre.comer();
	}

}

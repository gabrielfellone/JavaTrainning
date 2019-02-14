package br.com.trainning.oo;

public class Aula04MetodosSemRetorno {

	public static void imprimir() {
		System.out.println("Aprendendo a Linguagem Java");
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static void imprimir(String texto, int num) {
		System.out.println("O que eu quero dizer é: " + num + ". " + texto);
	}
	
	public static void somar(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void somar(String a, int b, int c) {
		System.out.println(a + (b + c));
	}
	
	public static void sexo(char c) {
		if (c == 'F') {
			System.out.println("Feminino");
		} else if (c == 'M') {
			System.out.println("Masculino");
		} else {
			System.out.println("Outro");
		}
	}
	
	public static void main(String[] args) {
		imprimir();
		imprimir("Sexta-feira é feriado");
		imprimir("São 21:47", 1);
		somar(5,2);
		somar("Arroz ", 18, 9);
		sexo('H');
	}

}

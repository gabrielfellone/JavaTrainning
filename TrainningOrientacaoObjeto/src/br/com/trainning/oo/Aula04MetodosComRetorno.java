package br.com.trainning.oo;

public class Aula04MetodosComRetorno {
	
	public static double somar(double a, double b) {
		//double c = a + b;
		return a + b;
	}
	

	public static double somar(double a, double b, double c) {
		//method overload
		//double c = a + b;
		return a + b + c;
	}
	
	public static String pares(int  valor) {
		String retorno = "";
		for (int  a = 0; a <= valor; a += 2) {
			retorno += a + " ";
		}
		return retorno;
	}
	
	public static int contaLetrasA(String palavra) {
		int quantidade = 0;
		palavra = palavra.toUpperCase();
		for (int a = 0; a < palavra.length(); a++) {
			if (palavra.charAt(a) == 'A')
				quantidade++;
		}
		return quantidade;
	}
	
	public static void main(String[] args) {

		System.out.println(somar(2,3,4));
		System.out.println(somar(2,4));
		System.out.println(pares(10));
		System.out.println(contaLetrasA("araraquara"));
	}

}

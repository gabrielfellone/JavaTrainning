package br.com.trainning.generics;

import java.util.ArrayList;

public class Baralho {
		byte a = (byte) 129;
		
		
	public static void main(String[] args) {
		
		System.out.print(a);		
	
	
	}
		public ArrayList<Cartas>cartas;

		public Baralho() {
			cartas = new ArrayList<Cartas>(52);
			inicializarCartas();
		}
		
		private void inicializarCartas() {
			Cartas.Naipe naipes[] = Cartas.Naipe.values();
			
			Cartas.Valor valores[] = Cartas.Valor.values();
			
			for(Cartas.Naipe naipe : naipes) {
				for(Cartas.Valor valor : valores) {
					cartas.add(new Cartas(naipe, valor));
				}
			}
		}
		
		public ArrayList<Cartas> getCartas() {
			return cartas;
		}

		public void setCartas(ArrayList<Cartas> cartas) {
			this.cartas = cartas;
		}
		
}

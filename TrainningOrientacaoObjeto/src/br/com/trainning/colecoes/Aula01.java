package br.com.trainning.colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		
		Iterator<Integer> inter1 = al.iterator();
		
		while(inter1.hasNext()) {
			System.out.println("Lista: "+ inter1.next());
		}
			System.out.println("Posição: "+ al.get(0));
			System.out.println("Tamanho: "+ al.size());
			System.out.println("Remover: "+ al.remove(5));

			for(Integer i : al) {
				System.out.println("Lista: "+ i);
			}
			
	}

}

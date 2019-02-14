package br.com.trainning.colecoes;

import java.util.Iterator;
import java.util.Vector;

public class Aula02 {

	public static void main(String[] args) {


		Vector<Integer> al = new Vector<>();
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
			System.out.println("Posição: "+ al.get(1));

	}

}

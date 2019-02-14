package br.com.trainning.colecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Aula03 {

	public static void main(String[] args) {

		Map<Object, String> mp = new HashMap<Object, String>();
		
		//Adicionar ou definir elementos no
		//mapa chave método put de valores
		
		mp.put(new Integer(2), "Dois");
		mp.put(new Integer(1), "Um");
		mp.put(new Integer(3), "Três");
		mp.put(new Integer(4), "Quatro");
		mp.put(new Integer(5), "Cinco");
		mp.put(new Integer(5), "Cinco");
		
		Set s = mp.entrySet();
		Iterator it = s.iterator();
		
		while (it.hasNext()){
			
			Map.Entry m = (Map.Entry) it.next();
			
			int key = (Integer) m.getKey();
			
			String value = (String) m.getValue();
			
			System.out.println("Chave: " + key + " Valor: " + value);
			
		}
	}

}

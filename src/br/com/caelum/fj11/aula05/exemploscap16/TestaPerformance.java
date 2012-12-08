package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ArrayList inicio...");
		long inicio = System.currentTimeMillis();		
		Collection<Integer> teste = new ArrayList<>();
		
		int total = 30000;
		
		for (int i = 0; i< total; i++){
			teste.add(i);
		}
		for (int i = 0; i< total; i++){
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto ArrayList: " + tempo/1000 + "s ");

		System.out.println("HashSet inicio...");
		long inicio2 = System.currentTimeMillis();		
		Collection<Integer> teste2 = new HashSet<>();
		
		int total2 = 30000;
		
		for (int i = 0; i< total2; i++){
			teste2.add(i);
		}
		for (int i = 0; i< total2; i++){
			teste2.contains(i);
		}
		long fim2 = System.currentTimeMillis();
		
		long tempo2 = fim2 - inicio2;
		
		System.out.println("Tempo gasto HashSet: " + tempo2 + "ms ");
		
	}

}

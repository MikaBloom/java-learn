package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("LinkedList inicio...");
		long inicio = System.currentTimeMillis();		
		List<Integer> teste = new LinkedList<>();
		
		int total = 30000;
		
		for (int i = 0; i< total; i++){
			teste.add(0, i);
		}
		for (int i = 0; i< total; i++){
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto LinkedList: " + tempo/1000 + "s ");

		System.out.println("ArrayList inicio...");
		long inicio2 = System.currentTimeMillis();		
		List<Integer> teste2 = new ArrayList<Integer>();
		
		int total2 = 30000;
		
		for (int i = 0; i< total2; i++){
			teste2.add(0,i);
		}
		for (int i = 0; i< total2; i++){
			teste2.contains(i);
		}
		long fim2 = System.currentTimeMillis();
		
		long tempo2 = fim2 - inicio2;
		
		System.out.println("Tempo gasto ArrayList: " + tempo2/1000 + "s ");
		
	}

}

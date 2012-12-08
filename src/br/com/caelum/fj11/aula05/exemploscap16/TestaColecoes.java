package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.HashSet;

public class TestaColecoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> p = new HashSet<>();

		p.add("java");

		System.out.println("Tamanho: " + p.size());

		p.add("java"); // Não adiciona objetos repetidos. Coleção sem repetição

		System.out.println("Tamanho: " + p.size());
		
		// Uso de buckets (tabela de espalhamento)
		if (p.contains("java")){
			System.out.println("Contem java");
		}
		
		

	}

}

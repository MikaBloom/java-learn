package br.com.caelum.fj11.aula05.exemploscap15.compras;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("teste1");
		lista.add("teste2");
		lista.add("teste3");
		lista.add("teste4");

		for (String s : lista) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println(lista.get(0));
		// lista.remove("teste3");
		System.out.println("posição de teste3: " + lista.indexOf("teste3"));

		System.out.println("\nRemovendo o teste3");
		lista.remove("teste3");
		
		System.out.println("tamanho da lista: " + lista.size());

	}
}

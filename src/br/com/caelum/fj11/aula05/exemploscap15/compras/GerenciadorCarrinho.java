package br.com.caelum.fj11.aula05.exemploscap15.compras;

import java.util.Collections;
import java.util.List;

public class GerenciadorCarrinho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Carrinho c = new Carrinho();

		Item dvd = new Item("DVD");
		Item cd = new Item("CD");
		Item revista = new Item("Revista");
		Item jornal = new Item("Jornal");

		c.adiciona(jornal);
		c.adiciona(dvd);
		c.adiciona(cd);
		c.adiciona(revista);
		
		
		

		// c.remove(dvd);

		// c.mostra();

		List<Item> retorno = c.getItens();

		for (Item i : retorno) {
			System.out.println(i);
		}

		Collections.sort(retorno);
		
	}

}

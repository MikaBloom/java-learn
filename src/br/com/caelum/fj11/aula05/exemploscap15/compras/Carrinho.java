package br.com.caelum.fj11.aula05.exemploscap15.compras;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Item> itens = new ArrayList<>();

	public Carrinho(){
	}
	
	public void remove(Item item) {
		this.itens.remove(item);
	}
	
	public ArrayList<Item> getItens(){
		return this.itens;
	}
		
	public void mostra() {
		for (Item i: itens){
			System.out.println(i);
		}
	}

	public void adiciona(Item i) {
		this.itens.add(i);
	}

}

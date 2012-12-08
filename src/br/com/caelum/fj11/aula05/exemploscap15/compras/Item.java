package br.com.caelum.fj11.aula05.exemploscap15.compras;

public class Item implements Comparable<Item>{

	private String nome;

	public Item(String string) {
		this.nome = string;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + "]";
	}

	@Override
	public int compareTo(Item item) {
		return this.getNome().compareTo(item.getNome());
	}
	
	

}

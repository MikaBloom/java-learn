package br.com.caelum.fj11.aula05.exemploscap16.banco;

public class ComparadorPorTitular {

	public int compara(Conta c1, Conta c2){
		return c1.getNome().compareTo(c2.getNome());
	}
	
}

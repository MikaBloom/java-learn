package br.com.caelum.fj11.aula05.exemploscap16.banco;

import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Collection<> --> mais generico do que Set<>
		Collection<Conta> contas = new HashSet<>(); // Sem ordenação/posição
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		
		cc1.setNumero(1111);
		cc2.setNumero(2222);
		
		contas.add(cc1);
		contas.add(cc2);
		
		if (contas.contains(cc1)){
			System.out.println("Ok");
		}
		
		for (Conta c : contas){
			System.out.println(c);
		}
		
	}

}

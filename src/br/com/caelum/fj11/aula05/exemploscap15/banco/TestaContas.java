package br.com.caelum.fj11.aula05.exemploscap15.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta cp = new ContaPoupanca();
		
		Conta cc = new ContaCorrente();
		Conta cc1 = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta cc3 = new ContaCorrente();
		
		cc.setNumero(1111);
		cc1.setNumero(2222);
		cc2.setNumero(3333);
		cc3.setNumero(4444);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(cc3);
		contas.add(cc2);
		contas.add(cc);
		contas.add(cc1);
		
		
		
		Collections.sort(contas);
		
		for (Conta c: contas){
			System.out.println(c);
		}
		
	
	}

}

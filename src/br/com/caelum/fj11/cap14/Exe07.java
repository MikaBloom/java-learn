package br.com.caelum.fj11.cap14;

import br.com.caelum.fj11.cap14.banco.Conta;
import br.com.caelum.fj11.cap14.banco.ContaCorrente;

public class Exe07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		cc1.setNumero(100);
		Conta cc2 = new ContaCorrente();
		cc2.setNumero(100);
		
		if (!(cc1 == cc2)){
			System.out.println("Contas com referencias diferentes!");
		}
		
		if (cc1.equals(cc2)){
			System.out.println("Contas com números iguais!");
		}

	}

}

package br.com.caelum.fj11.cap14;

import br.com.caelum.fj11.cap14.banco.Conta;
import br.com.caelum.fj11.cap14.banco.ContaCorrente;

public class Exe05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		conta.setNumero(1234);
		System.out.println(conta);
		
	}

}

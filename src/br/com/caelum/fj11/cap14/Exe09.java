package br.com.caelum.fj11.cap14;

import br.com.caelum.fj11.cap14.banco.Conta;
import br.com.caelum.fj11.cap14.banco.ContaCorrente;

public class Exe09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		
		cc1.setNumero(100);
		cc2.setNumero(100);
		
		cc1.setNome("Fernando");
//		cc2.setNome("Fernando");
		
		if (cc1.equals(cc2)){
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		
		
	}

}

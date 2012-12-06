package br.com.caelum.fj11.cap14.exe10;

import br.com.caelum.fj11.cap14.banco.ContaCorrente;
import br.com.caelum.fj11.cap14.banco.ContaPoupanca;

public class TestaGuardador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000.1);
		
		guardador.adicionaObjeto(cc);
		
		System.out.println(guardador.pegaObjeto(0));
//		System.out.println(cc);
		
		try {
			ContaPoupanca cp = (ContaPoupanca) guardador.pegaObjeto(0);
			System.out.println(cp);
		} catch (ClassCastException e){
			System.out.println("Erro: " + e);
		}
		
	}

}

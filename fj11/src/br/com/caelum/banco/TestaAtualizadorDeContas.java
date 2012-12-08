package br.com.caelum.banco;

import br.com.caelum.banco.sistema.AtualizadorDeContas;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaAtualizadorDeContas {

	/**
	 * Programa de teste do Atualizador de Contas.
	 * @param args
	 */
	public static void main(String[] args) {

		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		
		cc.deposita(1000.0);
		cp.deposita(1000.0);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("\nSaldo Total: " + adc.getSaldoTotal());

	}

}

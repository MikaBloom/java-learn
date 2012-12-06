package br.com.caelum.fj11.cap14.banco;

public class TestaAtualizadorDeContas {

	/**
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

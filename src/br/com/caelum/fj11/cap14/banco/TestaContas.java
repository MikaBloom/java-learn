package br.com.caelum.fj11.cap14.banco;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

	
		cc.deposita(1000.0);
		cp.deposita(1000.0);

	
		cc.atualiza(0.01);
		cp.atualiza(0.01);

	
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

	}

}

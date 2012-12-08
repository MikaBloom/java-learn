package br.com.caelum.aulas.banco2;

public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc.deposita(1000.0);
		cp.deposita(2000.0);

		cp.atualiza(0.005);

		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupanca: " + cp.getSaldo());

		Conta[] contas = new Conta[100];

		for (int i = 0; i < 100; i++) {
			contas[i] = new ContaCorrente();
			contas[i].setNome("Cliente #" + i);
			contas[i].deposita(100 * i);
			contas[i].saca(0.10 * i);
			System.out.println("Cliente #" + i + " :: Saldo C.C.: " + contas[i].getSaldo());
		}

	}

}

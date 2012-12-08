package br.com.caelum.aulas.banco2;

public class ContaPoupanca extends Conta {
	@Override
	void atualiza(double selic) {
		this.deposita(getSaldo() * selic);
	}
}

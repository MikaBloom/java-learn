package br.com.caelum.aulas.banco;

public class ContaCorrente extends Conta {

	@Override
	void atualiza(double selic) {
		this.deposita(getSaldo() * selic - 0.10);
	}

}

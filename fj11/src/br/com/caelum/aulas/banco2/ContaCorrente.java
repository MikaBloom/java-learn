package br.com.caelum.aulas.banco2;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	void atualiza(double selic) {
		this.deposita(getSaldo() * selic - 0.10);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}

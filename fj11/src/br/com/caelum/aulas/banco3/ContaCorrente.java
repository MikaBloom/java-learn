package br.com.caelum.aulas.banco3;

public class ContaCorrente implements ContaTributavel{

	private double saldo;
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0)
			this.saldo += valor;
	}

	@Override
	public void retira(double valor) {
		if (this.saldo > 0)
			this.saldo -= valor;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}

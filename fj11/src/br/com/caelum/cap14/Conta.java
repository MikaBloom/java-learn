package br.com.caelum.cap14;
public abstract class Conta {

	protected double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public abstract void atualiza(double taxa); 

	public double getSaldo() {
		return saldo;
	}

}

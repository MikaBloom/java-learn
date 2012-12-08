package br.com.caelum.cap14;
public class ContaCorrente extends Conta implements Item {
	
	public void deposita(double valor) {
		super.deposita(valor - 0.10);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;	
	}



}

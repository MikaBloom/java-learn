package br.com.caelum.fj11.cap14.banco;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	
	
}

package br.com.caelum.fj11.aula05.exemploscap14;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	
	
}

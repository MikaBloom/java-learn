package br.com.caelum.fj11.aula05.exemploscap15.banco;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	public int compareTo(Conta outra){
		return this.getNome().compareTo(outra.getNome());
	}
	
	
	@Override
	public String toString() {
		return this.getNome() + ": Conta #" + this.getNumero() + " com Saldo: " + this.getSaldo();
	}
	
	
}

package br.com.caelum.fj11.aula05.exemploscap15.banco;


public class AtualizadorDeContas {
	
	private double selic;
	private double saldoTotal = 0;

	public AtualizadorDeContas(double taxa) {
		this.selic = taxa;		
	}

	public void roda(Conta c) {
		System.out.println(" Saldo: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println(" Saldo Atualizado: " + c.getSaldo());
		this.saldoTotal  += c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}


}

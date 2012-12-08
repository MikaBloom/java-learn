package br.com.caelum.aulas.banco2;

public abstract class Conta {
	
	private double saldo;
	private String nome;
	
	public void deposita(double valor) {
		this.saldo += valor;		
	}
	
	public void saca(double valor) {
		if (this.saldo > valor) 
			this.saldo -= valor;	
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSaldo() {
		return saldo;
	}



	abstract void atualiza(double selic);

}

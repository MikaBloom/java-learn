package br.com.caelum.fj11.cap14.banco;

public abstract class Conta {
	
	private int numero;
	private String nome;

	protected double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public abstract void atualiza(double taxa); 

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta com Saldo: " + this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)){
			return false;
		}
		Conta outraConta = (Conta) obj;
		return ((this.numero == outraConta.numero) && (this.nome.equals(outraConta.nome)));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

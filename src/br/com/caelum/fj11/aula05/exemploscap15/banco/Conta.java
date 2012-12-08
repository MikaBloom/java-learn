package br.com.caelum.fj11.aula05.exemploscap15.banco;

public abstract class Conta implements Comparable<Conta>{

	private int numero;
	private String nome;

	protected double saldo;

	public int compareTo(Conta outra) {
		if (this.numero > outra.numero) {
			return 1;
		}
		if (this.numero < outra.numero) {
			return -1;
		}
		return 0;
		
		// return (this.numero - outra.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta #" + this.numero + " com Saldo: " + this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return ((this.numero == outraConta.numero) && (this.nome
				.equals(outraConta.nome)));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

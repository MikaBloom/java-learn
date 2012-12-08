package br.com.caelum.banco.conta;
/**
 * Modelo lógico de conta
 * @author oo2888
 *
 */

public abstract class Conta {

	protected double saldo;
	
	/**
	 * Método para depositar um valor na conta.
	 * @param valor é o valor a ser depositado.
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	/**
	 * Método de correção do saldo por uma taxa.
	 * @param taxa é a taxa a ser utilizada para correção.
	 */
	public abstract void atualiza(double taxa); 

	/**
	 *  Método de acesso ao atributo saldo da conta.
	 *  @return é o valor do saldo.
	 */
	public double getSaldo() {
		return saldo;
	}

}

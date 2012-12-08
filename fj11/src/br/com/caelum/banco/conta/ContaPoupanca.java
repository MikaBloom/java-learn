package br.com.caelum.banco.conta;

/**
 * Modelo de conta poupança
 * @author oo2888
 * @version 0.1
 */

public class ContaPoupanca extends Conta {
	
	/**
	 *  Método de atualização do saldo da poupança.
	 *  @param é a taxa a ser usada na atualização.
	 */
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	
	
}

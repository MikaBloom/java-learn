package br.com.caelum.banco.conta;

/**
 * Modelo de conta corrente.
 * @author oo2888
 *
 */

public class ContaCorrente extends Conta {
	
	/**
	 *  Método para deposita um valor na conta.
	 *  @param é o valor a ser depositado.
	 */
	public void deposita(double valor) {
		super.deposita(valor - 0.10);
	}

	/**
	 *  Método para atualizar um saldo usando uma taxa.
	 *  @param é o valor da taxa
	 */
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;	
	}



}

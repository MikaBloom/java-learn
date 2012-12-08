package br.com.caelum.banco.sistema;
import br.com.caelum.banco.conta.Conta;

/**
 * Modelo para atualização de multiplas contas.
 * @author oo2888
 *
 */
public class AtualizadorDeContas {
	
	/**
	 * Atributo selic é a taxa utilizada para correção do valor das contas.
	 */
	private double selic;
	
	/** 
	 * Acumulador de saldos (soma os saldos das contas atualizadas).
	 */
	private double saldoTotal = 0;

	/**
	 * Construtor do atualizador de contas 
	 * @param taxa é a taxa a ser usada na atualização.
	 */
	public AtualizadorDeContas(double taxa) {
		this.selic = taxa;		
	}
	
	
	/**
	 * Método de inicialização das atualizações.
	 * @param c é a conta a ser atualizada.
	 */
	public void roda(Conta c) {
		System.out.println(" Saldo: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println(" Saldo Atualizado: " + c.getSaldo());
		this.saldoTotal  += c.getSaldo();
	}

	/**
	 * Método de acesso ao atributo saldoTotal
	 * @return o valor do saldo total de atualizações.
	 */
	public double getSaldoTotal() {
		return this.saldoTotal;
	}


}

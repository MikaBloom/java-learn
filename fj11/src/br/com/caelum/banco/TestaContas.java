package br.com.caelum.banco;

import javax.swing.JOptionPane;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

	
		cc.deposita(1000.0);
		cc.deposita(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor:")));
		cp.deposita(1000.0);

	
		cc.atualiza(0.01);
		cp.atualiza(0.01);

	
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

	}

}

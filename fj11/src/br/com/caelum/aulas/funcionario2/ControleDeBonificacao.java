package br.com.caelum.aulas.funcionario2;

public class ControleDeBonificacao {
	
	private double totalDeBonificacoes = 0;
	
	public void registra (Funcionario f) {
		System.out.println("Adicionando bonificação do " +
					"funcionario: " + f);
		this.totalDeBonificacoes += f.getBonificacao();		
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;				
	}



}

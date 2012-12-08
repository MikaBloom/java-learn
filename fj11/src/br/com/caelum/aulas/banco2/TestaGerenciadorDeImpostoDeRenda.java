package br.com.caelum.aulas.banco2;

public class TestaGerenciadorDeImpostoDeRenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000.0);
		gerenciador.adiciona(cc);
		
		System.out.println(" Total de Impostos: " + gerenciador.getTotal());
		System.out.printf(" Total de Impostos: R$ %.2f",  gerenciador.getTotal());
		
	}

}

package br.com.caelum.aulas.banco3;

public class TestaContasInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		ContaTributavel cc = new ContaCorrente();
		cc.deposita(1000.0);
		
		/*
		 * 
		 *  Tributavel t = new ContaCorrente();
		 *  t.calculaTributos();
		 */
		
		cc.deposita(500.0);
		
		System.out.printf("\n Total de Tributos: R$ %.2f", cc.calculaTributos());
		
		
	}

}

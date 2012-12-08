package br.com.caelum.aulas.banco2;

public class TestaTributavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		System.out.println("Tributos: " + cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println("Tributos: " + t.calculaTributos());
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Saldo: " + ((Conta)t).getSaldo());  // Usando o casting para Conta.
		System.out.println("Saldo: " + ((Object)t).toString());  // Usando o casting para Object.
		
	}

}

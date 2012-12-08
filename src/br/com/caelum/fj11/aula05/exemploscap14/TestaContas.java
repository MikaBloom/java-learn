package br.com.caelum.fj11.aula05.exemploscap14;

import java.io.PrintStream;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();

		Conta cp = new ContaPoupanca();

		cc1.setNumero(1111);
		cc1.setNome("Jose");
		cc2.setNumero(2222);
		cc2.setNome("Maria");
		cc3.setNumero(2222);
		cc3.setNome("Maria");

		cc1.deposita(1000.0);
		cc2.deposita(2000.0);
		cc3.deposita(2000);

		cp.deposita(1000.0);

		cc1.atualiza(0.01);
		cp.atualiza(0.01);

		// System.out.println("Saldo Conta Corrente: " + cc1.getSaldo());
		// System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

		System.out.println(cc1.toString());
		System.out.println(cc2);
		System.out.println(cc3);

		if (cc2 == cc3) {
			System.out.println("São referencias iguais!");
		} else {
			System.out.println("São referencias diferentes!");
		}

		// Usando o metodo equals redefinido. Se não houvesse sido redefinido
		// teria o mesmo comportamento do ==
		if (cc2.equals(cc3)) {
			System.out.println("São objetos iguais!");
		} else {
			System.out.println("São objetos diferentes!");
		}

		// Retorna o tipo da classe do objeto.
		System.out.println(cc1.getClass());

		Sacola sacola = new Sacola(10);
		sacola.guarda(cc1);
		
		System.out.println("Conta: " + sacola.pega(0));

		int dez = 10;
		int outroDez = 10;

		if (dez == outroDez) {
			System.out.println("Iguais");
		}

		// Wrappers ou autobox
		Integer onze = new Integer(11);
		Integer outroOnze = new Integer(11);

		if (onze.equals(outroOnze)) {
			System.out.println("Iguais");
		}

		// String are immutable
		String s1 = "java";
		String s2 = "java";		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		if (s1.equals(s2)){
			System.out.println("iguais de novo");
		}
		
		PrintStream saida = System.out;
		saida.println("Saida padrão!");

	}

}

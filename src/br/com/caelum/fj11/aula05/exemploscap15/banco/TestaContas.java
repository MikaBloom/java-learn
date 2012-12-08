package br.com.caelum.fj11.aula05.exemploscap15.banco;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Conta cp = new ContaPoupanca();

		// Conta cc1 = new ContaCorrente();
		// Conta cc2 = new ContaCorrente();
		// Conta cc3 = new ContaCorrente();
		// Conta cc4 = new ContaCorrente();

		// cc1.setNumero(1111);
		// cc2.setNumero(2222);
		// cc3.setNumero(3333);
		// cc4.setNumero(4444);

		List<Conta> contas = new ArrayList<>();
		// contas.add(cc3);
		// contas.add(cc2);
		// contas.add(cc4);
		// contas.add(cc1);

		Random ran = new Random();

		for (int i = 1; i < 100; i++) {
			Conta c = new ContaPoupanca();
			c.setNumero(i);
			c.setNome("Correntista" + ran.nextInt(1000));
			// c.deposita(10 * i);
			c.deposita(ran.nextInt(90) * 10);

			contas.add(c);
		}

		// Não misturar ContaCorrente com ContaPoupanca para usar o sort()
		Collections.sort(contas);
		// Collections.reverse(contas);
		// Collections.rotate(contas, 1);
		// Collections.shuffle(contas);

		for (Conta c : contas) {
			System.out.println(c);
		}

		// System.out.println(contas);

	}

}

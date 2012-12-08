package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.fj11.aula05.exemploscap16.banco.Conta;
import br.com.caelum.fj11.aula05.exemploscap16.banco.ContaCorrente;

public class TestaMap {
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		c1.deposita(100000);
		Conta c2 = new ContaCorrente();
		c2.deposita(30000);
		
		
//		Cria mapa
//		Map mapaDeContas = new HashMap();
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
//		Adiciona contas
		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);
		
//		Qual a conta do diretor
		Conta contaDoDiretor = (ContaCorrente) mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
	}
}

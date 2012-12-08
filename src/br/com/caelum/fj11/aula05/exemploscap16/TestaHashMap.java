package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.HashMap;

public class TestaHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, Carro> mapa = new HashMap<>();
		
		mapa.put("ABC1234",new Carro("ABC1234"));
		mapa.put("DEF5678",new Carro("DEF5678"));
		mapa.put("XXX0000", new Carro("XXX0000"));
		
		for (String chave : mapa.keySet()){
			Carro c = mapa.get(chave);
			System.out.println("Placa: " + c.getPlaca());
		}
		
	}

}

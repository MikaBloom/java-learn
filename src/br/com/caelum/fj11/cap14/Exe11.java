package br.com.caelum.fj11.cap14;

public class Exe11 {

	public static void main(String[] args) {

		String str = "Fernando";

		Exe11.imprime(str);
		
		Exe11.reversa("Socorram-me, subi no onibus em Marrocos");
		System.out.println();
		Exe11.reversa("Anotaram A Data Da Maratona");
		System.out.println();
		Exe11.invertePalavras("Socorram-me, subi no onibus em Marrocos");
		
		System.out.println(Exe11.invertePalavras2("Amor da minha vida! Daqui até a eternidade!"));
		
		reversa2("AraraQuara!");

	}

	private static void invertePalavras(String string) {
		String[] palavras = string.split(" ");		
		StringBuilder saida = new StringBuilder();
		for (int i=palavras.length-1; i>=0; i--)
			saida.append(palavras[i] + " ");		
		System.out.println(saida);
	}

	private static String invertePalavras2(String string) {
		String[] palavras = string.split(" ");		
		StringBuilder saida = new StringBuilder();
		for (int i=palavras.length-1; i>=0; i--)
			saida.append(palavras[i] + " ");		
		return saida.toString();
	}

	
	private static void reversa(String s) {
		for (int i = (s.length()-1); i >= 0; i--)
			System.out.print(s.charAt(i));
	}
	
	static void reversa2(String s){
		StringBuilder saida = new StringBuilder(s);
		System.out.println(saida.reverse());
	}

	public static void imprime(String s) {
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
	}

}

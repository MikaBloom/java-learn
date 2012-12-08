package br.com.caelum.fj11.cap14;

public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String valor = "00000762034511";

		int i = StringToInt.converte(valor);

		System.out.println(i);

		System.out.println();

		// Usar a classe Character e o static method isChar() to verify if a
		// char is number or character

	}

	private static int converte(String valorString) {
		int tamanho = valorString.length();
		char[] c = valorString.toCharArray();
		int valorInteiro = 0;
		for (int i = 0; i < tamanho; i++) {
			valorInteiro += Math.pow(10, tamanho - i - 1) * (c[i] - '0');
		}
		return valorInteiro;
	}

}

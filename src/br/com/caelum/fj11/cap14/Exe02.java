package br.com.caelum.fj11.cap14;

/**
 * Exercicios do capitulo 14 
 * 
 * Ex2) Como fazer para saber se uma String se encontra dentro de outra? 
 * E para tirar os espaços em branco de uma String? E
 * para saber se uma String esta vazia? E para saber quantos caracteres tem uma
 * String? Use o javadoc.
 * 
 * @author fk
 * 
 */
public class Exe02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String uma = "dog";
		String outra = "The brown fox jump's over the lazy dog!";

		// Procurando uma dentro da outra.
		if (outra.contains(uma)) {
			System.out.println("positivo uma esta dentro da outra!");
		}

		// Retirando os espaços
		String outraSemEspaco = outra.replace(" ", "");
		System.out.println(outraSemEspaco);

		// Verificar se esta vazia
		if (!uma.isEmpty()) {
			System.out.println("Não esta vazia!");
		}

		// Saber quantos caracteres tem uma string
		System.out.println("Tamanho da string outra = " + outra.length());

	}

}

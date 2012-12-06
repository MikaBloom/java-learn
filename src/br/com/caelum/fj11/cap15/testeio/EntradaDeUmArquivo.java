package br.com.caelum.fj11.cap15.testeio;

//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// InputStream is = new FileInputStream("arquivo.txt"); // Lendo do arquivo.
		InputStream is = System.in; // Lendo do teclado.

		Scanner entrada = new Scanner(is);
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}

		is.close();
	}

}

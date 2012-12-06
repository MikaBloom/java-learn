package br.com.caelum.fj11.cap15.testeio;

import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class CopiaArquivos {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		//InputStream in = new FileInputStream("entrada.txt"); // Lê do arquivo.
		InputStream in = System.in; // Lê do teclado.
		
		OutputStream out = new FileOutputStream("saida.txt",true);
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
			
		
		Scanner entrada = new Scanner(in);
//		
		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}
		
		in.close();
		bw.close();
		
		
	}

}

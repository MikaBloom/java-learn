package br.com.caelum.fj11.cap15.testeio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/*
		// Lendo do teclado e escrevendo no sysout
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine(); // Primeira linha
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		*/
		
		
		
		
		
		
		
//		Lendo do arquivo.txt e escrevendo no sysout
		
		
//		InputStream is = new FileInputStream("arquivo.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("arquivo.txt")));
			
		
//		int b = isr.read();
//		System.out.println(b);
		String s = br.readLine();
		
		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}
		
//		System.out.println(s);
		
		br.close();
		
		
	}

}

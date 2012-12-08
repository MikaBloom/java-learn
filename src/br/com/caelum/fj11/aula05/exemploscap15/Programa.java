package br.com.caelum.fj11.aula05.exemploscap15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa {

//	private static PrintStream ps;

	/**
	 * Data IO - reading from any input.
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
//		Reading from ...
		// InputStream is = new FileInputStream("entrada.txt"); // read file
		// entrada.txt
		InputStream is = System.in; // read from default sys in (keyboard)
		Scanner sc = new Scanner(is);
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		while (sc.hasNextLine()){
			String linha2 = sc.nextLine();
			System.out.println(linha2);
		}
		
		
//  Writing on...
		
		OutputStream os = new FileOutputStream("saida.txt");
		//OutputStream os = System.out;
		PrintStream ps = new PrintStream(os);
		
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		while (sc.hasNextLine()){
			String linha3 = sc.nextLine();
			ps.println(linha3);
			bw.write(linha3);
		}
		
	}

}

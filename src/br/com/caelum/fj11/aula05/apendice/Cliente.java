package br.com.caelum.fj11.aula05.apendice;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Socket servidor = new Socket("192.168.55.133",12345);
		OutputStream os = servidor.getOutputStream();
		
		PrintStream saida = new PrintStream(os);
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()){
			saida.println(sc.nextLine());
		}
		
	}
}

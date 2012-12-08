package br.com.caelum.fj11.aula05.apendice;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		Socket cliente = servidor.accept();
		
		InputStream is = cliente.getInputStream();
		
		Scanner sc = new Scanner(is);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}
}

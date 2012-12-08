package br.com.caelum.fj11.aula05.exemploscap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Programa2 {
	
	public static void main(String[] args) {
		
		try{
			InputStream is = new FileInputStream("entrada.txt");
			Scanner sc = new Scanner(is);
			
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
			
			is.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}

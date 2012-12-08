package br.com.caelum.fj11.aula05.exemploscap16;

import java.util.Collection;
import java.util.TreeSet;

public class TestaTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Collection<String> p = new TreeSet<>();
		
		p.add("java");
		p.add("ruby");
		p.add("scala");
		
		for (String s: p){
			System.out.println(s);
		}
		
	}

}

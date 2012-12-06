package br.com.caelum.fj11.cap14;

public class Exe01 {

	public static void main(String[] args) {
		String s = "fj11";

		String outra1 = s.toUpperCase();
		String outra2 = s.replace('1', '2');
		String outra3 = s.toUpperCase().replace('1', '3');

		// String's sao imutaveis...
		System.out.println(s + " " + outra1 + " " + outra2 + " " + outra3);

		// StringBuffer sao mutaveis...
		StringBuffer str = new StringBuffer();
		str.append("fj11");
		
		str.replace(2, 4, "22");
				
		System.out.println(str);
		
		
	}

}

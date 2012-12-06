package br.com.caelum.fj11.cap14;

import java.math.BigDecimal;
import java.math.MathContext;

public class Exe08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erro na precisão do double 0.1 * 10 = 1
		double x1 = 0;		
		for (int i = 0; i < 10; i++)
			x1 += 0.1;		
		System.out.println("Double: 0.1 * 10 = " + x1);

		
		
		BigDecimal valor = new BigDecimal(0.1, new MathContext(2));
		BigDecimal total = valor.multiply(new BigDecimal(10));
		
		System.out.println("BigDecimal: "+ valor +" * 10 = " + total);
//		System.out.println(valor);
		
		
		
		
	}

}

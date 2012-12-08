package br.com.caelum.aulas.geometria;

public class TestaGeometria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AreaCalculavel a = new Retangulo(2, 4);
		System.out.println("Area do retangulo: " + a.calculaArea());

		a = new Circulo(1);
		System.out.println("Area do circulo: " + a.calculaArea());

		a = new Triangulo(4, 2);
		System.out.println("Area do triangulo:  " + a.calculaArea());

	}

}

package br.com.caelum.aulas.geometria;

public class Triangulo implements AreaCalculavel{

	private double base;
	private double altura;
	
	public Triangulo (double base, double altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return (this.base * this.altura) / 2;
	}
}

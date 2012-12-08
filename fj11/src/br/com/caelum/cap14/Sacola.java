package br.com.caelum.cap14;

public class Sacola<T> {
	
	private T objeto;
	
	public void guarda (T o) {
		this.objeto = o;
	}
	
	public T devolve() {
		return this.objeto;
	}
	
}

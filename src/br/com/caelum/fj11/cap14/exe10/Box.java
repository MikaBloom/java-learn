package br.com.caelum.fj11.cap14.exe10;

public class Box<T> {

	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}

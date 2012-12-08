package br.com.caelum.fj11.aula05.exemploscap14;

public class Sacola {

	int quantidade = 0;
	
	
	Object[] guardador;
	
	public Sacola(){}
	
	public Sacola(int t){
		guardador  = new Object[t];
	}
	
	public void guarda(Object o) {
			this.guardador[quantidade++] = o;
	}
	
	public Object pega(int i){
		return  guardador[i];
	}
	

}

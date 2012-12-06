package br.com.caelum.fj11.cap14.exe10;

public class GuardadorDeObjetos {
	
	private Object[] arrayDeObjetos = new Object[100];
	private int posicao = 0;

	public void adicionaObjeto(Object obj) {
		this.arrayDeObjetos[this.posicao++] = obj;
	}

	public Object pegaObjeto(int i) {
		return this.arrayDeObjetos[i];
	}
	
	

	
	
}

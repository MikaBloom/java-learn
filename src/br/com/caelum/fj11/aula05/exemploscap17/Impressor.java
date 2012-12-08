package br.com.caelum.fj11.aula05.exemploscap17;

public class Impressor implements Runnable {

	private String letra;
	
	public Impressor(String letra) {
		this.letra = letra;
	}
	
	public void executa(){
		for (int i= 0; i< 50; i++){
			// Faz um lock do objeto para evitar race conditions...
			synchronized (this) {	
				System.out.println(this.letra);
			}
			
		}
	}

	@Override
	public void run() {
		this.executa();
	}

}

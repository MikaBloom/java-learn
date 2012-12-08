package br.com.caelum.fj11.aula05.exemploscap17;

public class AppProgram {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Impressor ia = new Impressor("A");
		Thread ta = new Thread(ia);
		
		Impressor ib = new Impressor("B");
		Thread tb = new Thread(ib);
		
		ta.start();
		tb.start();
		
		ta.join();	// Aguarda ta terminar antes de voltar a thread principal
		tb.join();	// Aguarda tb terminar antes de voltar a thread principal
		
		
		Thread.sleep(2000); // static method 
		System.out.println("Fim");
		
	}

}

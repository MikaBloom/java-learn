package cap11;

public class SemMemoria {

	public static void main(String[] args) {

		java.util.ArrayList<Integer> lista = new java.util.ArrayList<Integer>();
		
		System.out.println("Memória Livre Inicial: " + Runtime.getRuntime().freeMemory());
		System.out.println("Memória Total: " + Runtime.getRuntime().totalMemory());
		while (true) {
			try {
				lista.add(33);
				
			} catch (OutOfMemoryError e) {
				// lista = null;				
				System.out.println("Memória cheia!");
				break;
			}			
		}
		

	}
}

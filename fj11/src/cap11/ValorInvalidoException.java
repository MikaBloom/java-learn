package cap11;

public class ValorInvalidoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super ("Valor inválido: " + valor);
	}

	public ValorInvalidoException(String msg){
		super (msg);
	}
	
}

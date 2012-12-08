package cap11;

public class TestaDeposita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta cc = new Conta();
		try {
			cc.deposita3(-100.0);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		System.out.println("Saldo: " + cc.getSaldo());

	}

}

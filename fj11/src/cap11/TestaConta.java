package cap11;

public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		if (minhaConta.saca(1000))
			System.out.println("Saque efetuado com sucesso!\nSaldo: " + minhaConta.getSaldo());
		else
			System.out.println("Não foi possível efetuar o saque!");
		
	}

}

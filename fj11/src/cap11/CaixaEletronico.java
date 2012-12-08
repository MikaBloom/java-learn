package cap11;

class CaixaEletronico {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		Cliente c = new Cliente();
		c.setNome("Maria");

		c1.setTitular(c);
		c1.deposita(1000.0);

		System.out.println("Ola! " + c1.getTitular());
		System.out.println("Conta Num.: " + c1.getNumero());

		try {
			c1.saca2(-1100);
			System.out.println("Saque efetuado com sucesso!");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e){
			System.out.println("Erro Zuadão!");
		}

		/*
		 * if (c1.saca(5000)) { // Emite dinheiro
		 * System.out.println("OK! Saque efetuado com sucesso!"); } else {
		 * System.out.println("Erro! Saldo Insuficiente!"); }
		 */
	}

}

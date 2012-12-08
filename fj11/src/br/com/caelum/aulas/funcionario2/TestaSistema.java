package br.com.caelum.aulas.funcionario2;

public class TestaSistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("José");
		g.setSalario(12000.0);
		g.setSenha(1234);
		
		Cliente c = new Cliente();
		c.setNome("Julia");
		c.setSenha(1111);
		
		
		SistemaInterno si = new SistemaInterno();
		
		si.login(g, 1234);
		si.login(c, 1110); // Senha incorreta.
	}

}

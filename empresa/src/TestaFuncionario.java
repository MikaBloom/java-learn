
public class TestaFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Funcionario f = new Analista();
		f.setNome("João");
		f.setSalario(1000.0);
		
		Funcionario g = new Gerente();
		g.setNome("Maria");
		g.setSalario(2000.0);
		
		System.out.println(f.getBonus());
		System.out.println(g.getBonus());
		
	}

}

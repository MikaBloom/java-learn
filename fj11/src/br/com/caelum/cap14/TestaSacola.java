package br.com.caelum.cap14;

public class TestaSacola {

	/**
	 * Exemplo de Generics
	 * @param args
	 */
	public static void main(String[] args) {
		Sacola<Funcionario> sacolaFuncionarios = new Sacola<Funcionario>();
		
		sacolaFuncionarios.guarda(new Funcionario());
		
		Funcionario f = sacolaFuncionarios.devolve();
		f.setNome("Joe");
		
		Sacola<ContaCorrente> sacolaContas = new Sacola<ContaCorrente>();
		
		sacolaContas.guarda(new ContaCorrente());
		
		
	}

}

package br.com.caelum.aulas.funcionario;

public class TestaControleBonificacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario f = new Analista();
		f.setNome("João");
		f.setSalario(1000.0);
		f.setCpf("11111111111");
		
		ControleDeBonificacao cdb = new ControleDeBonificacao();
		cdb.registra(f);
		
		
		Funcionario g = new Gerente();
		g.setNome("Maria");
		g.setSalario(2000.0);
		g.setCpf("22222222222");
		
		cdb.registra(g);
		
		Funcionario d = new Diretor();
		d.setNome("Silvia");
		d.setCpf("33333333333");
		d.setSalario(10000.0);
		
		cdb.registra(d);
		
		System.out.println("\n Total de bonificações: " + cdb.getTotalDeBonificacoes());
		
	}

}

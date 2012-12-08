package br.com.caelum.aulas.funcionario2;

public class Secretaria extends Funcionario {

	@Override
	double getBonificacao() {
		return this.salario * 1.05;
	}

}

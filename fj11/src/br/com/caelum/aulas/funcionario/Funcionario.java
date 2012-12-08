package br.com.caelum.aulas.funcionario;

abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	
	public Funcionario() {
		
	}

	public Funcionario(String cpf) {
		super();
		this.cpf = cpf;
	}

// Using abstract method we obligate that sub-classes define this method on this on.
	abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario="
				+ salario + "]";
	}
	
	
	
	
	
}

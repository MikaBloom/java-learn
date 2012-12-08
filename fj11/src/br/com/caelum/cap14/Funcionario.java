package br.com.caelum.cap14;
/**
 * Modelo de funcionario
 * @author oo2888
 *
 */

public class Funcionario implements Item{

	private String nome;
	private double salario;

	// Methods Getters and Setters
	/**
	 * Método de acesso ao atributo nome
	 * @return é o nome do funcionario
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método modificador do atributo nome.
	 * @param nome é o novo nome do funcionario 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

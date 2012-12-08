package br.com.caelum.aulas.funcionario2;

public class Cliente implements Autenticavel{
	
	private String nome;
	private String endereco;
	private int senha;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", senha="
				+ senha + "]";
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	@Override
	public boolean autentica(int senha) {
		return (this.getSenha() == senha);
	}
	
	
	
}

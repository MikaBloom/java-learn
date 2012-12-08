package br.com.caelum.aulas.funcionario2;

public class Diretor extends Gerente implements Autenticavel{

	public boolean autentica(int senha) {
		return (this.getSenha() == senha);
	}

}

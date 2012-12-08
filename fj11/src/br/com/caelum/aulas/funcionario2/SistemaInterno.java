package br.com.caelum.aulas.funcionario2;

public class SistemaInterno {
	
	void login (Autenticavel a, int senha) {
		if (a.autentica(senha))
			System.out.println("Usuário: "+ a + " Seja Bem Vindo!");
		else
			System.out.println("Acesso negado!");
	}
	
}

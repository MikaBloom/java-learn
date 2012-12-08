public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica (int tentativa) {
		return (this.senha == tentativa);
	}
	
	public double getBonus() {
		return super.getSalario() * 0.20;
	}

}

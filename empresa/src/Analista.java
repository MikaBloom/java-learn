
public class Analista extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return super.getSalario() * 0.10;
	}

	@Override
	public boolean autentica(int tentativa) {
		return false;
	}
	
	

}


public class AcumuladorDeBonus {

	private double total;

	public void acumula(Funcionario f) {
		this.total += f.getBonus();
	}

	public double getTotalBonus() {
		return total;
	}

	

}

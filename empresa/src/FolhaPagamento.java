
public class FolhaPagamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AcumuladorDeBonus adb = new AcumuladorDeBonus();
		
		Funcionario jose = new Analista();
		jose.setNome("José");
		jose.setSalario(1000.0);
		adb.acumula(jose);
		
		Gerente maria = new Gerente();
		maria.setNome("Maria");
		maria.setSalario(2000.0);
		adb.acumula(maria);
		
		Analista ana = new Analista();
		ana.setNome("Ana");
		ana.setSalario(3000.0);
		adb.acumula(ana);
		
		System.out.println("Total de Bonus: " + adb.getTotalBonus());
		
	}

}

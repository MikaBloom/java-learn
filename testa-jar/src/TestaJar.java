import br.com.caelum.banco.TestaAtualizadorDeContas;
import br.com.caelum.banco.TestaContas;
import br.com.caelum.banco.conta.ContaCorrente;

/**
 * Teste de importação do JAR
 *  
 * @author oo2888
 * @version 1.0
 */

public class TestaJar {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100.0);
		TestaAtualizadorDeContas.main(args); // rodando outro main do jar 
		TestaContas.main(args);	// rodando outro main do jar
		
	}
	
	

}

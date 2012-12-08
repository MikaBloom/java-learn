package br.com.caelum.aulas.banco3;

public interface Conta {
	
	double getSaldo();
	void deposita(double valor);
	void retira(double valor);
	void atualiza (double taxa);

}

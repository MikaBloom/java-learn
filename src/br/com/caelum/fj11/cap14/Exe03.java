package br.com.caelum.fj11.cap14;

import javax.swing.JOptionPane;

public class Exe03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		// Compara as Referencias usando == (distintas x1 e x2)
		if (x1 == x2) {
			System.out.println("Referencia igual");
		} else {
			System.out.println("Referencia diferente");
		}

		// Compara o conteudo usando equals (conteudos iguais)
		// conteudo comparado pelo metodo equals
		if (x1.equals(x2)) {
			System.out.println("Conteudos iguais");
		} else {
			System.out.println("Conteudos diferentes");
		}

		// Verificando se a classe Integer reescreve o metodo toString()
		// verificar a javadoc da classe String na API
		System.out.println(x1);

		// Testando o metodo parseInt
		try{
			int i = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro:"));
			JOptionPane.showMessageDialog(null, "Número digitado: " + i);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Erro: \n" + e);
		}
	}

}

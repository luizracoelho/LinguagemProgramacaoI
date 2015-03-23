package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 10 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc10 {
	/**
	 * Programa que tem a função de verificar se um número está ou não
	 * compreendido entre 20 e 90.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Entre com um número");
			double num = Double.parseDouble(teclado.nextLine());

			if (num > 20 && num < 90)
				System.out.println("O Número Está Entre 20 e 90.");
			else
				System.out.println("O Número Não Está Entre 20 e 90.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
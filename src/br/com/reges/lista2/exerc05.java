package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 5 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc05 {
	/**
	 * Programa que tem a função de ler dois número e deixá-los em ordem
	 * crescente.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int[] num = new int[2];

			System.out.println("Digite o primeiro número:");
			num[0] = Integer.parseInt(teclado.nextLine());

			System.out.println("Digite o segundo número:");
			num[1] = Integer.parseInt(teclado.nextLine());

			int numA, numB;
			if (num[0] >= num[1]) {
				numA = num[0];
				numB = num[1];
			} else {
				numA = num[1];
				numB = num[0];
			}

			System.out.println(String.format(
					"Números em ordem crescente [%d, %d].", numA, numB));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
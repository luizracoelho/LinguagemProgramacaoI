package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 3 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc03 {
	/**
	 * Programa que tem a função de ler dois número e informar se o primeiro é
	 * divisível pelo segundo. par ou ímpar.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro número:");
			int numA = Integer.parseInt(teclado.nextLine());

			System.out.println("Digite o segundo número:");
			int numB = Integer.parseInt(teclado.nextLine());

			System.out.println((numA % numB == 0) ? String.format(
					"O número %d é Divisível por %d.", numA, numB) : String
					.format("O número %d NÃO é Divisível por %d.", numA, numB));
		} catch (Exception exc) {
			System.err
					.println("[ERRO] O Valor Informado Não é um Número Inteiro.");
		} finally {
			teclado.close();
		}
	}
}
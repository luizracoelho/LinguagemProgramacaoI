package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 2 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc02 {
	/**
	 * Programa que tem a função de ler um número inteiro e informar se ele é
	 * par ou ímpar.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Digite o número:");
			int num = Integer.parseInt(teclado.nextLine());
			
			System.out.println((num % 2 == 0) ? "O Número Informado é Par!"
					: "O Número Informado é Ímpar!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 4 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc04 {
	/**
	 * Programa que tem a função de ler dois número e informar qual é o maior
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro número:");
			int num1 = Integer.parseInt(teclado.nextLine());

			System.out.println("Digite o segundo número:");
			int num2 = Integer.parseInt(teclado.nextLine());

			if (num1 > num2)
				System.out
						.println(String.format("O Maior Número é %d.", num1));
			else if (num1 < num2)
				System.out
						.println(String.format("O Maior Número é %d.", num2));
			else
				System.out.println("Os Números São Iguais.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
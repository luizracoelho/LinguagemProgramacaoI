package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 7 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc07 {
	/**
	 * Programa que tem a função de ler três valores correspondentes à pontos de
	 * um triângulo e classificar este triângulo em equilátero, isósceles ou
	 * escaleno.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Digite o valor para o primeiro ponto:");
			double posA = Double.parseDouble(teclado.nextLine());

			System.out.println("Digite o valor para o segundo ponto:");
			double posB = Double.parseDouble(teclado.nextLine());

			System.out.println("Digite o valor para o terceiro ponto:");
			double posC = Double.parseDouble(teclado.nextLine());

			if (posA == posB && posA == posC)
				System.out.println("Triângulo EQUILÁTERO Formado!");
			else if (posA != posB && posA != posC && posB != posC)
				System.out.println("Triângulo ESCALENO Formado!");
			else
				System.out.println("Triângulo ISÓSCELES Formado!");

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
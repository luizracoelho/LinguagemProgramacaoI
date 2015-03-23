package br.com.reges.lista2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Resolução do Exercício 8 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc08 {
	/**
	 * Método que testa se o número é positivo.
	 * 
	 * @param Número
	 * @return Double
	 * @throws NegativeException
	 */
	public static double positiveNumber(double num) throws NegativeException {
		if (num < 0)
			throw new NegativeException();
		else
			return num;
	}

	/**
	 * Programa que tem a função de ler três numeros positivos e colocá-los em
	 * ordem crescente;
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			double[] num = new double[3];

			System.out.println("Entre com o primeiro número:");
			num[0] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			System.out.println("Entre com o segundo número:");
			num[1] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			System.out.println("Entre com o terceiro número:");
			num[2] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			// Ordenar o Array
			Arrays.sort(num);

			System.out.println(String.format(
					"Lista de Números Ordenada: \n%.2f\n%.2f\n%.2f", num[0],
					num[1], num[2]));
		} catch (NegativeException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 1 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc01 {
	/**
	 * Programa que tem a funcionalidade de ler dois números e imprimir se eles
	 * são iguais ou diferentes.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Entre com o primeiro Número:");
			int num1 = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Entre com o segundo Número:");
			int num2 = Integer.parseInt(teclado.nextLine());
			
			System.out.println((num1 == num2) ? "São Iguais!"
					: "São Diferentes!");
		} catch (Exception exc) {
			System.err
					.println("[ERRO] O Valor Digitado Não é um Número Inteiro.");
		} finally {
			teclado.close();
		}
	}
}

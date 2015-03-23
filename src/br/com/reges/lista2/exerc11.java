package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 11 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc11 {
	/**
	 * Programa que tem a função de calcular o preço de venda de um produto,
	 * caso o preço de compra for menor que R$ 20,00 acrescentar 45% caso
	 * contrário 30%.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Entre com um número");
			double preco = Double.parseDouble(teclado.nextLine());
			if (preco < 20.0)
				preco *= 1.45;
			else
				preco *= 1.3;

			System.out.println(String.format("O preço de venda é R$ %.2f.",
					preco));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
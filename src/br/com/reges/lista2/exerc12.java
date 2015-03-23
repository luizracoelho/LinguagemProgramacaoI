package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 12 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc12 {
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
	 * Programa que tem a função de atualizar o salário dos funcionários.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Entre com o Salário do Funcionário:");
			double salario = positiveNumber(Double.parseDouble(teclado
					.nextLine()));

			if (salario <= 600.0)
				salario *= 1.3;
			else if (salario > 600.0 && salario <= 1100.0)
				salario *= 1.25;
			else if (salario > 1100.0 && salario <= 2400.0)
				salario *= 1.2;
			else if (salario > 2400.0 && salario <= 3550.0)
				salario *= 1.15;
			else
				salario *= 1.1;

			System.out.println(String.format(
					"O Valor do Salário com o Aumento é %.2f.", salario));

		} catch (NegativeException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
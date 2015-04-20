package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;

		while (true) {
			System.out.println("Entre com o número desejado:");
			try {
				num = isPositiveNumber(Integer.parseInt(scan.nextLine()));
				break;
			} catch (NegativeNumberException e) {
				System.err.println("\n" + e.getMessage());
			} catch (NumberFormatException e) {
				System.err.println("\nO número deve ser inteiro.");
			}
		}

		System.out.println("Relação de Números Primos Anteriores à " + num);
		for (int i = num; i > 0; i--) {

			int quantDivisoes = 0;

			for (int j = i; j > 0; j--) {
				if (i % j == 0)
					quantDivisoes++;
			}

			if (i != num && quantDivisoes <= 2)
				System.out.println(String.format("Número: %d", i));
		}

		scan.close();
	}

	public static int isPositiveNumber(int number)
			throws NegativeNumberException {
		if (number >= 0)
			return number;
		else
			throw new NegativeNumberException("O número deve ser positivo");
	}
}

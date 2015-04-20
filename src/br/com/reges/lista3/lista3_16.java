package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, quantDivisoes = 0;

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

		for (int i = num; i > 0; i--) {
			if (num % i == 0)
				quantDivisoes++;
		}

		if (quantDivisoes <= 2)
			System.out.println(String.format("O número [%d] é primo.", num));
		else
			System.out.println(String.format("O número [%d] NÃO é primo.", num));

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

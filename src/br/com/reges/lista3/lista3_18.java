package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_18 {
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

		while (num > 0) {
			System.out.print(num % 10);
			num /= 10;
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

package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, fatorial = 1;

		while (true) {
			System.out.println("Entre com o número desejado:");
			try {
				num = isPositiveNumber(Integer.parseInt(scan.nextLine()));
				break;
			} catch (NegativeNumberException e) {
				System.err.println("\n" + e.getMessage());
			}
			catch (NumberFormatException e){
				System.err.println("\nO número deve ser inteiro.");
			}
		}
		
		if (num == 0)
			fatorial = 0;
		else {
			for (int i = num; i > 0; i--) {
				fatorial *= i;
			}
		}

		System.out.println(String.format("O fatorial do número [%d] é [%d].",
				num, fatorial));

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

package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantDeInt = 0, i = 0, numMaior = 0, numLido;

		while (true) {
			try {
				System.out
						.println("Digite a quantidade de interações desejadas:");
				quantDeInt = Integer.parseInt(scan.nextLine());
				System.out.println("============================================");
				break;
			} catch (Exception e) {
				System.err.println("O valor digitado não é um inteiro.");
				continue;
			}
		}

		while (i < quantDeInt) {
			try {
				System.out.println("Digite o " + (i + 1) + "º número:");
				numLido = Integer.parseInt(scan.nextLine());

				if (numLido > numMaior)
					numMaior = numLido;

				i++;
			} catch (Exception e) {
				System.err.println("O valor digitado não é um inteiro.");
				continue;
			}
		}
		
		System.out.println("O maior número é " + numMaior);

		scan.close();
	}
}

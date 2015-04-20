package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[10];
		int soma = 0;

		int i = 0;
		while (i < 10) {
			try {
				System.out.println(String
						.format("Digite o %dº número: ", i + 1));
				num[i] = Integer.parseInt(scan.nextLine());

				soma += num[i];

				i++;
			} catch (Exception e) {
				System.err.println("O valor digitado não é um número inteiro.");
				continue;
			}
		}

		System.out.println("A soma dos números foi:\t\t" + soma);
		System.out.println("A média dos números foi:\t" + (soma / num.length));

		scan.close();
	}
}

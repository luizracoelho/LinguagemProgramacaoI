package br.com.reges.lista3;

import java.util.Arrays;
import java.util.Scanner;

public class lista3_07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[20];

		for (int i = 0; i < 20; i++) {
			try {
				System.out.println("Digite o valor desejado na posição "
						+ (i + 1) + ":");
				num[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.err
						.println("O valor digitado não é um número inteiro.\n");
				i--;
			}
		}

		Arrays.sort(num);

		int cont = 0;

		for (int i : num) {
			if (i == num[0])
				cont++;
		}

		System.out.println("O menor número informado foi o " + num[0]
				+ ", sendo repetido por " + cont + " veze(s).");

		scan.close();
	}
}

package br.com.reges.lista3;

import java.util.Arrays;
import java.util.Scanner;

public class lista3_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] num = new double[15];

		for (int i = 0; i < 15; i++) {
			try {
				System.out.println("Digite o salario do " + (i + 1)
						+ "º funcionário:");
				num[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.err
						.println("O valor digitado não é um número decimal.\n");
				i--;
			}
		}

		Arrays.sort(num);

		System.out.println(String.format(
				"Os três maiores salários são: R$ %.2f, R$ %.2f e R$ %.2f.", num[14],
				num[13], num[12]));

		scan.close();
	}

}

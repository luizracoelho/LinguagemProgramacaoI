package br.com.reges.lista3;

import java.util.Arrays;
import java.util.Scanner;

public class lista3_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int[] num = new int[2];

			System.out.println("Digite o 1º número: ");
			num[0] = Integer.parseInt(scan.nextLine());
			System.out.println("Digite o 2º número: ");
			num[1] = Integer.parseInt(scan.nextLine());

			Arrays.sort(num);

			int i = num[0];

			while (i <= num[1]) {
				if (i % 2 != 0)
					System.out.println("Número: " + i);

				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}
}

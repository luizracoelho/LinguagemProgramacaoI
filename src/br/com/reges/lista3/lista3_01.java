package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double numLido, maiorNum = 0;
	
		while (true) {
			try{
				System.out.println("Entre com o número desejado: ");
				numLido = Double.parseDouble(scan.nextLine());
				
				if (numLido == 0){
					System.out.println("\nEncerrando programa...");	
					break; 
				}
				
				if (numLido > maiorNum) maiorNum = numLido;
				
				System.out.println(String.format("O maior número é: %.2f\n", maiorNum));
			}
			catch (Exception e)
			{
				System.err.println("O valor informado não é um número!\n\n");
				continue;	
			}
		}
		
		scan.close();
	}
}

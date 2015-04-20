package br.com.reges.lista3;

public class lista3_03 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print("Número: " + i);
			
			if (i % 10 == 0) System.out.print(", Múltiplo de 10!\n");
			else System.out.print("\n");
			
			i++;
		} while (i <= 100);
	}
}

package br.com.reges.lista3;

public class lista3_14 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int fibonacci;
		
		System.out.println("Fibonacci: " + n1);
		System.out.println("Fibonacci: " + n2);
		
		while (true) {
			fibonacci = n1 + n2;
			
			if (fibonacci > 5000) break;
						
			n1=n2;
			n2=fibonacci;
						
			System.out.println("Fibonacci: " + fibonacci);
		}
	}
}

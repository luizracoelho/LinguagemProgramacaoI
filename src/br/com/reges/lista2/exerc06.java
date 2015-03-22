package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 6 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc06 {
	/**
	 * Programa que tem a função de validar o acesso de um usuário.
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua senha:");
		String senha = teclado.nextLine();

		if (senha.equals("batatafrita")) System.out.println("Acesso Permitido!");
		else System.err.println("[Erro] Senha Não Confere!");
		
		teclado.close();
	}
}
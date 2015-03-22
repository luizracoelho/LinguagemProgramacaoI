package br.com.reges.lista2;

import java.util.Scanner;

/**
 * Resolução do Exercício 9 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class exerc09 {
	/**
	 * Programa que tem a função de verificar se um aluno está Aprovado,
	 * Reprovado por Faltas, Reprovado por Média ou Reprovado por Faltas e
	 * Média.
	 * 
	 * @param args
	 *            Argumentos
	 * @throws NumberFormatException
	 *             Tipo de Número Incorreto
	 * @throws RangeOutOfBoundException
	 *             Nota Fora do Limite 0 à 10 ou se as faltas estão entre 0 e
	 *             80.
	 */
	public static void main(String[] args) throws NumberFormatException,
			RangeOutOfBoundException {
		Scanner teclado = new Scanner(System.in);

		try{
		Aluno aluno = new Aluno("Luiz Ricardo");
		System.out.println("Digite a primeira nota:");
		aluno.setNota1(Double.parseDouble(teclado.nextLine()));

		System.out.println("Digite a segunda nota:");
		aluno.setNota2(Double.parseDouble(teclado.nextLine()));

		System.out.println("Digite a terceira nota:");
		aluno.setNota3(Double.parseDouble(teclado.nextLine()));

		System.out.println("Digite a quantidade de faltas:");
		aluno.setQuantFaltas(Integer.parseInt(teclado.nextLine()));

		System.out.println(aluno.toString());
		}
		catch (NumberFormatException e){
			System.err.println("[ERRO] Número em Formato Incorreto!");
		}
		catch (RangeOutOfBoundException e){
			System.err.println("[ERRO] Número Fora do Intervalo!");
		}
		finally{
		teclado.close();
		}
	}
}
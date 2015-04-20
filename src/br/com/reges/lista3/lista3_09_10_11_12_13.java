package br.com.reges.lista3;

import java.util.Scanner;

public class lista3_09_10_11_12_13 {
	public static void main(String[] args) throws GenreException,
			noteRangeException {
		int i = 0;

		Scanner scan = new Scanner(System.in);

		Turma turma = new Turma();

		do {
			System.out.println("\nInclusão do Aluno " + (i + 1) + "/"
					+ turma.getAluno().length
					+ "\n=======================\n");

			System.out.println("Digite o nome do aluno:");
			Aluno aluno = new Aluno(scan.nextLine());

			while (true) {
				try {
					System.out.println("Digite o sexo do aluno:");
					aluno.setSexo(scan.nextLine());
					break;
				} catch (GenreException e) {
					System.err.println(e.getMessage());
					continue;
				}
			}

			while (true) {
				try {
					System.out.println("Digite a 1ª nota do aluno:");
					aluno.setNota1(Double.parseDouble(scan.nextLine()));
					break;
				} catch (noteRangeException e) {
					System.err.println("\n" + e.getMessage());
					continue;
				} catch (NumberFormatException e) {
					System.err
							.println("\nO valor digitado está em um formato incorreto!");
					continue;
				}
			}

			while (true) {
				try {
					System.out.println("Digite a 2ª nota do aluno:");
					aluno.setNota2(Double.parseDouble(scan.nextLine()));
					break;
				} catch (noteRangeException e) {
					System.err.println("\n" + e.getMessage());
					continue;
				} catch (NumberFormatException e) {
					System.err
							.println("\nO valor digitado está em um formato incorreto!");
					continue;
				}
			}

			while (true) {
				try {
					System.out.println("Digite a 3ª nota do aluno:");
					aluno.setNota3(Double.parseDouble(scan.nextLine()));
					break;
				} catch (noteRangeException e) {
					System.err.println("\n" + e.getMessage());
					continue;
				} catch (NumberFormatException e) {
					System.err
							.println("\nO valor digitado está em um formato incorreto!");
					continue;
				}
			}

			while (true) {
				try {
					System.out
							.println("Digite a quantidade de faltas do aluno:");
					aluno.setFaltas(Integer.parseInt(scan.nextLine()));
					break;
				} catch (NumberFormatException e) {
					System.err
							.println("\nO valor digitado está em um formato incorreto!");
					continue;
				}
			}

			turma.addAluno(aluno);

			i++;
		} while (i < turma.getAluno().length);

		/**
		 * Resolução do Exercício 10 da Lista
		 */
		System.out
				.println("\nSituação Final dos Alunos\n=========================");
		for (Aluno a : turma.situacaoFinalDaTurma()) {
			System.out
					.println(String
							.format("O aluno [%s] obteve média final [%.2f], portanto sua situação final é [%s].",
									a.getNome(), a.getMedia(), a.getSituacao()));
			;
		}

		/**
		 * Resolução do Exercício 11 da Lista
		 */
		System.out
				.println("\nMédia de Notas Por Gênero\n=========================");
		double[] notasPorGenero = turma.mediaDeNotasPorGenero();
		System.out
				.println(String
						.format("Média de notas dos homens: [%.2f] e média de notas das mulheres: [%.2f].",
								notasPorGenero[0], notasPorGenero[1]));

		/**
		 * Resolução do Exercício 12 da Lista
		 */
		System.out
				.println("\nPercentual de Reprovados Por Gênero\n===================================");
		double[] reprovadosPorGenero = turma.percentualDeReprovacaoPorGenero();
		System.out
				.println(String
						.format("O percentual de alunos REPROVADOS homens foi de: [%.2f] e mulheres: [%.2f];",
								reprovadosPorGenero[0], reprovadosPorGenero[1]));

		/**
		 * Resolução do Exercício 13 da Lista
		 */
		System.out
				.println("\nPercentual de Reprovados Geral\n==============================");
		System.out.println(String.format(
				"O percentual de alunos REPROVADOS foi [%.2f]",
				turma.percentualDeReprovacao()));
		scan.close();
	}
}

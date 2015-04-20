package br.com.reges.lista3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class lista3_19 {
	public static void main(String[] args) throws PrimaryKeyViolationException {
		Scanner scan = new Scanner(System.in);

		ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();

		while (true) {
			System.out
					.println("\nInclusão de Mercadoria\n======================");
			Mercadoria mercadoria = new Mercadoria();

			while (true) {
				System.out.println("Entre com o código da mercadoria:");
				try {
					mercadoria
							.setCodigo(primaryKeyViolation(mercadorias,
									isPositiveNumber(Integer.parseInt(scan
											.nextLine()))));
					break;
				} catch (NegativeNumberException e) {
					System.err.println("\n" + e.getMessage());
				} catch (NumberFormatException e) {
					System.err.println("\nO número deve ser inteiro.");
				} catch (PrimaryKeyViolationException e) {
					System.err.println("\n" + e.getMessage());
				}
			}

			if (mercadoria.getCodigo() == 0) {
				System.out.println("Programa Encerrado!!!");
				break;
			}

			System.out.println("Entre com a descrição da mercadoria:");
			mercadoria.setDescr(scan.nextLine());

			while (true) {
				System.out.println("Entre com o estoque MÍNIMO da mercadoria:");
				try {
					mercadoria.setEstMin(isPositiveNumber(Double
							.parseDouble(scan.nextLine())));
					break;
				} catch (NegativeNumberException e) {
					System.err.println("\n" + e.getMessage());
				} catch (NumberFormatException e) {
					System.err.println("\nFormato incorreto.");
				}
			}

			while (true) {
				System.out.println("Entre com o estoque ATUAL da mercadoria:");
				try {
					mercadoria.setEstAtual(isPositiveNumber(Double
							.parseDouble(scan.nextLine())));
					break;
				} catch (NegativeNumberException e) {
					System.err.println("\n" + e.getMessage());
				} catch (NumberFormatException e) {
					System.err.println("\nFormato incorreto.");
				}
			}

			mercadorias.add(mercadoria);
		}

		System.out
				.println("\nMercadorias com estoque abaixo do mínimo\n========================================");

		Iterator<Mercadoria> i = mercadorias.iterator();

		while (i.hasNext()) {
			Mercadoria mercadoria = i.next();
			if (mercadoria.estaAbaixoDoEstoqueMinimo())
				System.out.println(mercadoria);
		}

		scan.close();
	}

	public static int isPositiveNumber(int number)
			throws NegativeNumberException {
		if (number >= 0)
			return number;
		else
			throw new NegativeNumberException("O número deve ser positivo");
	}

	public static double isPositiveNumber(double number)
			throws NegativeNumberException {
		if (number >= 0)
			return number;
		else
			throw new NegativeNumberException("O número deve ser positivo");
	}

	public static int primaryKeyViolation(ArrayList<Mercadoria> lista,
			int codigo) throws PrimaryKeyViolationException {
		for (Mercadoria m : lista) {
			if (m.getCodigo() == codigo) {
				throw new PrimaryKeyViolationException("Este código já existe!");
			}
		}

		return codigo;
	}
}

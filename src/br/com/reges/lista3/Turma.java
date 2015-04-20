package br.com.reges.lista3;

import java.util.Arrays;

/**
 * Classe que modela uma turma de alunos
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Turma {
	/**
	 * Lista de alunos
	 */
	private Aluno[] aluno = new Aluno[10];

	/**
	 * Controla o Id do Aluno
	 */
	private int id = 0;

	/**
	 * Método que adiciona um novo aluno à turma
	 * 
	 * @param aluno
	 *            Aluno
	 */
	public void addAluno(Aluno aluno) {
		this.aluno[this.id] = aluno;
		id++;
	}

	// public String

	@Override
	/**
	 * Imprimir a turma
	 */
	public String toString() {
		return "Turma [aluno=" + Arrays.toString(aluno) + "]";
	}

	/**
	 * Obter os alunos
	 * 
	 * @return Array de Alunos
	 */
	public Aluno[] getAluno() {
		return aluno;
	}

	/**
	 * Método que Calcula a situação Final da Turma
	 * 
	 * @return Array de Alunos
	 */
	public Aluno[] situacaoFinalDaTurma() {
		for (Aluno a : this.aluno) {
			a.situacaoFinaldoAluno();
		}
		return this.aluno;
	}

	/**
	 * Método que calcula a media dos alunos por genêro
	 * 
	 * @return Índice [0] Gênero Masculino, índice [1] Gênero Feminino
	 */
	public double[] mediaDeNotasPorGenero() {
		int contMasc = 0;
		double somaMasc = 0, somaTotal = 0;
		double[] genero = new double[2];

		for (Aluno a : this.aluno) {
			if (a.getSexo().equals("M")) {
				contMasc++;
				somaMasc += a.getMedia();
			}

			somaTotal += a.getMedia();
		}

		genero[0] = somaMasc / contMasc;
		genero[1] = (somaTotal - somaMasc) / (this.aluno.length - contMasc);

		return genero;
	}

	/**
	 * Método que retorna o percentual de reprovação dos alunos por Gênero
	 * 
	 * @return Índice [0] Gênero Masculino, índice [1] Gênero Feminino
	 */
	public double[] percentualDeReprovacaoPorGenero() {
		int contMasc = 0, contMascReprovado = 0, contFemReprovado = 0;
		double[] genero = new double[2];

		for (Aluno a : this.aluno) {
			if (a.getSexo().equals("M")) {
				contMasc++;
				if (a.getSituacao().equals("REPROVADO"))
					contMascReprovado++;
			} else {
				if (a.getSituacao().equals("REPROVADO"))
					contFemReprovado++;
			}
		}

		try {
			genero[0] = (contMascReprovado * 100) / contMasc;
		} catch (Exception e) {
			genero[0] = 0;
		}

		try {
			genero[1] = ((contFemReprovado) * 100)
					/ (this.aluno.length - contMasc);
		} catch (Exception e) {
			genero[1] = 0;
		}

		return genero;
	}

	/**
	 * Método que calcula o percentual de alunos reprovados
	 * @return Percentual de Reprovados
	 */
	public double percentualDeReprovacao() {
		int contReprovado = 0;
		double perc;

		for (Aluno a : this.aluno) {
			if (a.getSituacao().equals("REPROVADO"))
				contReprovado++;
		}
		
		try{
			perc = (contReprovado * 100)/this.aluno.length;
		}
		catch(Exception e){
			perc = 0;
		}
		
		return perc;
	}
}

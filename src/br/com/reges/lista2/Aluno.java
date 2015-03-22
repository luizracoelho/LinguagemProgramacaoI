package br.com.reges.lista2;

/**
 * Classe para a modelagem de um aluno.
 * <p>
 * Classe Auxiliar para a resolução do Exercício 9 da Lista 2.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Aluno {
	/**
	 * Nome do Aluno
	 */
	private String nome;
	/**
	 * Nota 1 do Aluno
	 */
	private double nota1;
	/**
	 * Nota 2 do Aluno
	 */
	private double nota2;
	/**
	 * NOta 3 do Aluno
	 */
	private double nota3;
	/**
	 * Média do Aluno
	 */
	private double media;
	/**
	 * Quantidade de Faltas do Aluno
	 */
	private int quantFaltas;

	/**
	 * Método Construtor da Classe.
	 * 
	 * @param nome
	 *            Nome do Aluno
	 */
	public Aluno(String nome) {
		this.nome = nome;
	}

	/**
	 * Método que testa se uma nota está entre 0 e 10.
	 * 
	 * @param numero
	 *            Nota
	 * @return Nota
	 * @throws RangeOutOfBoundException
	 */
	public double IsRangeOutOfBounds(double numero)
			throws RangeOutOfBoundException {
		if (numero < 0.0 || numero > 10.0)
			throw new RangeOutOfBoundException();
		else
			return numero;
	}
	
	/**
	 * Método que testa se uma falta está entre 0 e 80.
	 * 
	 * @param numero
	 *            Nota
	 * @return Nota
	 * @throws RangeOutOfBoundException
	 */
	public int IsRangeOutOfBounds(int numero)
			throws RangeOutOfBoundException {
		if (numero < 0 || numero > 80)
			throw new RangeOutOfBoundException();
		else
			return numero;
	}

	/**
	 * Método para verificar se o aluno está aprovado por Média.
	 * 
	 * @return TRUE Para Média Igual ou Superior 7.0
	 *         <p>
	 *         FALSE Para Média Inferior à 7.0
	 */
	private boolean aprovadoMedia() {
		this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
		return (media >= 7.0) ? true : false;
	}

	/**
	 * Método para verificar se o aluno está aprovado por Faltas
	 * 
	 * @return TRUE Para Percentual de Faltas Igual ou Inferior à 25%
	 *         <p>
	 *         FALSE Para Percentual de Faltas Superior à 25%
	 */
	private boolean aprovadoFaltas() {
		return (this.quantFaltas <= 20) ? true : false;
	}

	/**
	 * Método que Retorna o Resultado da Classe
	 * 
	 * @return Resutado da Classe
	 */
	public String toString() {
		String mensagem;
		if (aprovadoMedia() && aprovadoFaltas())
			mensagem = "APROVADO";
		else if (!aprovadoMedia() && aprovadoFaltas())
			mensagem = "REPROVADO por Média";
		else if (aprovadoMedia() && !aprovadoFaltas())
			mensagem = "REPROVADO por Faltas";
		else
			mensagem = "REPROVADO por Média e Faltas";

		return String.format("O Aluno %s foi %s!", this.nome, mensagem);
	}

	/**
	 * Obter Nota 1 do Aluno
	 * 
	 * @return Nota 1
	 */
	public double getNota1() {
		return nota1;
	}

	/**
	 * Atribuir Nota 1 do Aluno
	 * 
	 * @param nota1
	 *            Nota 1
	 * @throws RangeOutOfBoundException Nota Fora do Limite 0 à 10.
	 */
	public void setNota1(double nota1) throws RangeOutOfBoundException {
		this.nota1 = IsRangeOutOfBounds(nota1);
	}

	/**
	 * Obter Nota 2 do Aluno
	 * 
	 * @return Nota 2
	 */
	public double getNota2() {
		return nota2;
	}

	/**
	 * Atribuir Nota 2 do Aluno
	 * 
	 * @param nota2
	 *            Nota 2
	 * @throws RangeOutOfBoundException Nota Fora do Limite 0 à 10.
	 */
	public void setNota2(double nota2) throws RangeOutOfBoundException {
		this.nota2 = IsRangeOutOfBounds(nota2);
	}

	/**
	 * Obter Nota 3 do Aluno
	 * 
	 * @return Nota 3
	 */
	public double getNota3() {
		return nota3;
	}

	/**
	 * Atribuir Nota 3 do Aluno
	 * 
	 * @param nota3
	 *            Nota 3
	 * @throws RangeOutOfBoundException Nota Fora do Limite 0 à 10.
	 */
	public void setNota3(double nota3) throws RangeOutOfBoundException {
		this.nota3 = IsRangeOutOfBounds(nota3);
	}

	/**
	 * Obter a Quantidade de Faltas do Aluno
	 * 
	 * @return Quantidade de Faltas
	 */
	public int getQuantFaltas() {
		return quantFaltas;
	}

	/**
	 * Atribuir a Quantidade de Faltas do Aluno
	 * 
	 * @param quantFaltas
	 *            Quantidade de Faltas
	 * @throws RangeOutOfBoundException
	 *             Verificar se as faltas estão entre 0 e 80.
	 */
	public void setQuantFaltas(int quantFaltas) throws RangeOutOfBoundException {
		this.quantFaltas = IsRangeOutOfBounds(quantFaltas);
	}
}

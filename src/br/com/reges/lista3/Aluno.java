package br.com.reges.lista3;

/**
 * 
 * Classe que modela um aluno
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
	 * Sexo do Aluno
	 */
	private String sexo = "M";
	/**
	 * Nota 1 do Aluno
	 */
	private double nota1 = 0;
	/**
	 * Nota 2 do Aluno
	 */
	private double nota2 = 0;
	/**
	 * Nota 3 do Aluno
	 */
	private double nota3 = 0;
	/**
	 * Faltas do Aluno
	 */
	private int faltas = 0;

	/**
	 * Média do Aluno
	 */
	private double media = 0;

	/**
	 * Situação do Aluno
	 */
	private String situacao;

	/**
	 * Método contrutor da classe
	 * 
	 * @param nome
	 */
	public Aluno(String nome) {
		this.nome = nome;
	}

	/**
	 * Método que calcula a média final do aluno
	 * 
	 * @return
	 */
	private void calcularMedia() {
		this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
	}

	/**
	 * Método que define a situação finaldo aluno com base na sua média
	 * 
	 * @return Aprovado, Reprovado ou Exame
	 */
	public void situacaoFinaldoAluno() {
		calcularMedia();
		if (this.media < 7)
			this.situacao = "REPROVADO";
		else
			this.situacao = "APROVADO";
	}

	/**
	 * Método que testa se uma nota está dentro do intervalo 0-10
	 * 
	 * @param number
	 * @return
	 */
	public boolean noteRange(double number) {
		if (number >= 0 && number <= 10)
			return true;
		else
			return false;
	}

	/**
	 * Obter Sexo do Aluno
	 * 
	 * @return Sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Atribuir Sexo do Aluno
	 * 
	 * @param sexo
	 *            Sexo
	 * @throws GenreException
	 *             Sexo do Aluno
	 */
	public void setSexo(String sexo) throws GenreException {
		if (sexo.equals("M") || sexo.equals("F"))
			this.sexo = sexo;
		else
			throw new GenreException("[M] Masculino e [F] Feminino");
	}

	/**
	 * Obter a nota 1 do Aluno
	 * 
	 * @return Nota 1
	 */
	public double getNota1() {
		return nota1;
	}

	/**
	 * Atribuir a nota 1 do Aluno
	 * 
	 * @param nota1
	 *            Nota 1
	 * @throws noteRangeException
	 *             Testa o intervalo das notas
	 */
	public void setNota1(double nota1) throws noteRangeException {
		if (noteRange(nota1))
			this.nota1 = nota1;
		else
			throw new noteRangeException("A nota deve estar entre 0 à 10.");
	}

	/**
	 * Obter a nota 2 do Aluno
	 * 
	 * @return Nota 2
	 */
	public double getNota2() {
		return nota2;
	}

	/**
	 * Atribuir a nota 2 do Aluno
	 * 
	 * @param nota1
	 *            Nota 2
	 * @throws noteRangeException
	 *             Testa o intervalo das notas
	 */
	public void setNota2(double nota2) throws noteRangeException {
		if (noteRange(nota2))
			this.nota2 = nota2;
		else
			throw new noteRangeException("A nota deve estar entre 0 à 10.");
	}

	/**
	 * Atribuir a nota 3 do Aluno
	 * 
	 * @param nota1
	 *            Nota 3
	 */
	public double getNota3() {
		return nota3;
	}

	/**
	 * Obter a nota 3 do Aluno
	 * 
	 * @return Nota 3
	 * @throws noteRangeException
	 *             Testa o intervalo das notas
	 */
	public void setNota3(double nota3) throws noteRangeException {
		if (noteRange(nota3))
			this.nota3 = nota3;
		else
			throw new noteRangeException("A nota deve estar entre 0 à 10.");
	}

	/**
	 * Obter as faltas do Aluno
	 * 
	 * @return Faltas
	 */
	public int getFaltas() {
		return faltas;
	}

	/**
	 * Atribuir do Aluno
	 * 
	 * @param faltas
	 *            Fatas
	 */
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	/**
	 * Imprimir o aluno
	 */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sexo=" + sexo + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", faltas="
				+ faltas + ", media=" + media + ", situacao=" + situacao + "]";
	}

	/**
	 * Obter o Nome do Aluno
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Obter a Média do Aluno
	 * 
	 * @return
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Obter a Situação do Aluno
	 * 
	 * @return
	 */
	public String getSituacao() {
		return situacao;
	}

}

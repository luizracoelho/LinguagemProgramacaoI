package br.com.reges.lista1;

/**
 * Resolução do Exercício 6
 * <p>
 * Modelagem da classe de empregados de uma empresa
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Empregado {
	/**
	 * Número da Matrícula do Empregado
	 */
	private int matricula;
	/**
	 * Nome do Empregado
	 */
	private String nome;
	/**
	 * Função do Empregado
	 */
	private String funcao;
	/**
	 * Salário do Empregado
	 */
	private double salario;
	/**
	 * Data de Admissão do Empregado
	 */
	private String dataDeAdmisao;

	/**
	 * Método contrutor da classe
	 * 
	 * @param matricua
	 *            Número da Matrícula do Empregado
	 * @param nome
	 *            Nome do Empregado
	 */
	public Empregado(int matricua, String nome) {
		this.matricula = matricua;
		this.nome = nome;
	}

	/**
	 * Método para Imprimir os Dados do Empregado Na Tela
	 * 
	 * @return Cadastro
	 */
	public String imprimirCadastro() {
		return String
				.format("Matrícula:\t%d\nNome:\t\t%s\nFunção:\t\t%s\nSalário:\t%.2f\nAdmissão:\t%s",
						this.matricula, this.nome, this.funcao, this.salario,
						this.dataDeAdmisao);
	}

	/**
	 * Obter a Função do Empregado
	 * 
	 * @return Função
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * Atribuir a Função do Empregado
	 * 
	 * @param funcao
	 *            Função
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * Obter Salário do Empregado
	 * 
	 * @return Salário
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Atribuir Salário do Empregado
	 * 
	 * @param salario
	 *            Salário
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Obter a Data de Admissão do Empregado
	 * 
	 * @return Data de Admissão
	 */
	public String getDataDeAdmisao() {
		return dataDeAdmisao;
	}

	/**
	 * Atribuir a Data de Admissão
	 * 
	 * @param dataDeAdmisao
	 *            Data de Admissão
	 */
	public void setDataDeAdmisao(String dataDeAdmisao) {
		this.dataDeAdmisao = dataDeAdmisao;
	}

	/**
	 * Método que testa a classe
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Empregado empregado = new Empregado(1, "Luiz Ricardo");
		empregado.setFuncao("Programador");
		empregado.setSalario(10000.0);
		empregado.setDataDeAdmisao("01/01/2015");
		System.out.println(empregado.imprimirCadastro());
	}
}

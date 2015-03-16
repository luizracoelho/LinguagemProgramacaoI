package br.com.reges.lista1;

/**
 * Resolução do Exercício 4
 * <p>
 * Modelagem da classe de professores da Faculdade de Informática Ideal.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Professor {
	/**
	 * Numeração que identifica o professor
	 */
	protected int matricula;
	/**
	 * Nome do professor
	 */
	protected String nome;
	/**
	 * Quantidade de horas trabalhadas mensalmente pelo professor
	 */
	protected int cargaHoraria;
	/**
	 * Salário do professor
	 */
	protected double salario = 0.0;

	/**
	 * Método construtor da classe Professor
	 * 
	 * @param matricula
	 *            Numeração que identifica o professor
	 * @param nome
	 *            Nome do Professor
	 */
	public Professor(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	/**
	 * Método que imprime na tela as informçãoes de carga horária e salário do
	 * professor
	 * 
	 * @return Dados Do Professor
	 */
	public String imprimirProfessor() {
		return String
				.format("Matrícula:\t%d\nNome:\t\t%s\nCarga Horária:\t%s Horas Trabalhadas\nSalário:\tR$ %.2f\n",
						this.matricula, this.nome, this.cargaHoraria,
						this.salario);
	}

	/**
	 * Obter Número da Matrícula
	 * 
	 * @return Matrícula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * Atribuir o Número da Matrícula
	 * 
	 * @param matricula
	 *            Número da Matrícula
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * Obter o Nome do Professor
	 * 
	 * @return Nome do Professor
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atribuir o nome do Professor
	 * 
	 * @param nome
	 *            Nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter a Carga Horária Mensal do Professor
	 * 
	 * @return Carga Horária Mensal
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	/**
	 * Atribuir a Carga Horária Mensal do Professor
	 * 
	 * @param cargaHoraria
	 *            Carga Horária Mensal
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	/**
	 * Obter o Salário do Professor
	 * 
	 * @return Salário
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Atribuir Salário do Professor
	 * 
	 * @param salario
	 *            Salário
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static void main(String[] args) {
		// Teste de professor com horário fixo
		Professor professorSalarioFixo = new Professor(1,
				"Professor Com Salário Fixo");
		professorSalarioFixo.setCargaHoraria(200);
		professorSalarioFixo.setSalario(5000.0);
		System.out.println(professorSalarioFixo.imprimirProfessor());

		// Teste de professor horista
		ProfessorHorista professorHorista = new ProfessorHorista(2,
				"Professor Horista");
		professorHorista.setCargaHoraria(200);
		professorHorista.setSalarioHora(23.57);
		System.out.println(professorHorista.imprimirProfessor());
	}
}

package br.com.reges.lista1;

/**
 * Resolução do Exercício 4
 * <p>
 * Modelagem da classe de professores horistas da Faculdade de Informática
 * Ideal.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class ProfessorHorista extends Professor {
	/**
	 * Salário por hora do professor
	 */
	private double salarioHora = 0.0;

	/**
	 * Método construtor da classe Professor
	 * 
	 * @param matricula
	 *            Numeração que identifica o professor
	 * @param nome
	 *            Nome do Professor
	 */
	public ProfessorHorista(int matricula, String nome) {
		super(matricula, nome);
	}

	/**
	 * Obter Salário por Hora do Professor
	 * 
	 * @return Salário por Hora
	 */
	public double getSalarioHora() {
		return salarioHora;
	}

	/**
	 * Atribuir Salário por Hora do Professor
	 * 
	 * @param salarioHora
	 *            Salário por Hora
	 */
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
		super.salario = (super.cargaHoraria * this.salarioHora);
	}
}

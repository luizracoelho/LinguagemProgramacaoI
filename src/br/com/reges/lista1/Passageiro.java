package br.com.reges.lista1;

/**
 * Resolução do Exercício 8
 * <p>
 * Modelagem da classe de passageiros em uma empresa de aviação.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Passageiro {
	/**
	 * Código do Passageiro
	 */
	private int codigo;
	/**
	 * Nome do Passageiro
	 */
	private String nome;
	/**
	 * RG do Passageiro
	 */
	private String rg;
	/**
	 * CPF do Passageiro
	 */
	private String cpf;
	/**
	 * Telefone do Passageiro
	 */
	private String telefone;
	/**
	 * Data de Nascimento do Passageiro
	 */
	private String dataDeNascimento;
	/**
	 * O Passageiro possui Necessidades Especiais?
	 */
	private boolean necessidadesEspeciais = false;

	/**
	 * Método Construtor da Classe
	 * 
	 * @param codigo
	 *            Código do Passageiro
	 * @param nome
	 *            Nome do Passageiro
	 */
	public Passageiro(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * Método que Imprime os Dados do Passageiro
	 */
	public String toString() {
		StringBuilder sbPassageiro = new StringBuilder();

		sbPassageiro.append("Dados do Passageiro:\n");
		sbPassageiro.append(String.format("Código:\t\t\t\t%d\n", this.codigo));
		sbPassageiro.append(String.format("Nome:\t\t\t\t%s\n", this.nome));
		sbPassageiro.append(String.format("RG:\t\t\t\t%s\n", this.rg));
		sbPassageiro.append(String.format("CPF:\t\t\t\t%s\n", this.cpf));
		sbPassageiro
				.append(String.format("Telefone:\t\t\t%s\n", this.telefone));
		sbPassageiro.append(String.format("Data De Nascimento:\t\t%s\n",
				this.dataDeNascimento));
		sbPassageiro.append(String.format(
				"Possui Necessidades Especiais?\t%s\n",
				this.necessidadesEspeciais ? "Sim" : "Não"));

		return sbPassageiro.toString();
	}

	/**
	 * Método que Agenda um Novo Vôo para o Passageiro
	 * 
	 * @param voo
	 *            Objeto Vôo
	 * @return Agendamento
	 */
	public String agendarVoo(Voo voo) {
		return String.format("Vôo Agendado Com Sucesso!!!\n\n%s%s",
				this.toString(), voo.toString());
	}

	/**
	 * Obter RG do Passageiro
	 * 
	 * @return RG
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * Atribuir RG do Passageiro
	 * 
	 * @param rg
	 *            RG
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * Obter CPF do Passageiro
	 * 
	 * @return CPF
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Atribuir CPF do Passageiro
	 * 
	 * @param cpf
	 *            CPF
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Obter o Telefone do Passageiro
	 * 
	 * @return Telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Atribuir o Telefone do Passageiro
	 * 
	 * @param telefone
	 *            Telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Obter a Data de Nascimento do Passageiro
	 * 
	 * @return Data de Nascimento
	 */
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	/**
	 * Atribuir a Data de Nascimento do Passageiro
	 * 
	 * @param dataDeNascimento
	 *            Data de Nascimento
	 */
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	/**
	 * Obter Necessidades Especiais do Passageiro
	 * 
	 * @return Necessidades Especiais
	 */
	public boolean isNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}

	/**
	 * Atribuir Necessidades Especiais ao Passageiro
	 * 
	 * @param necessidadesEspeciais
	 *            Necessidades Especiais
	 */
	public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	/**
	 * Método que Executa os Testes da Classe Passageiro
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Passageiro passageiro = new Passageiro(1, "Luiz Ricardo");
		passageiro.setRg("47144513-7");
		passageiro.setCpf("388.809.298-10");
		passageiro.setTelefone("+55(16)99262-4963");
		passageiro.setDataDeNascimento("04/12/1990");
		passageiro.setNecessidadesEspeciais(false);

		Voo voo = new Voo(123456, "7A");
		voo.setPaisOrigem("BRA");
		voo.setEstadoOrigem("SP");
		voo.setCidadeOrigem("[SAO] São Paulo");
		voo.setPaisDestino("USA");
		voo.setEstadoDestino("CA");
		voo.setCidadeDestino("[SFO] San Francisco");

		System.out.println(passageiro.agendarVoo(voo));
	}
}

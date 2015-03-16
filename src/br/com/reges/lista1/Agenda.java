package br.com.reges.lista1;

/**
 * Resolução do Exercício 3
 * <p>
 * Modelagem da classe de agenda de contatos.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Agenda {
	/**
	 * Nome do contato
	 */
	private String nome;
	/**
	 * Endereço do contato
	 */
	private String endereco;
	/**
	 * Telefone do contato
	 */
	private String fone;
	/*
	 * E-Mail do contato
	 */
	private String email;

	/**
	 * Método construtor da classe
	 * 
	 * @param nome
	 *            Nome do contato
	 */
	public Agenda(String nome) {
		this.nome = nome;
	}

	/**
	 * Imprimir os dados do contato na tela
	 * 
	 * @return Informações do Contato
	 */
	public String imprimeCadastro() {
		return String.format(
				"Nome: \t\t%s\nEndereço: \t%s\nFone: \t\t%s\nE-Mail: \t%s",
				this.nome, this.endereco, this.fone, this.email);
	}

	/**
	 * @return Nome do Contato
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atribuir Nome ao Contato
	 * 
	 * @param nome
	 *            Nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter Endereço do Contato
	 * 
	 * @return Endereço
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Atribuir Endereço ao Contato
	 * 
	 * @param endereco
	 *            Endereço
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Obter Telefone do Contato
	 * 
	 * @return Telefone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Atribuir Telefone ao Contato
	 * 
	 * @param fone
	 *            Telefone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}

	/**
	 * Obter E-Mail do Contato
	 * 
	 * @return E-Mail
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Atribuir E-Mail ao Contato
	 * 
	 * @param email
	 *            E-Mail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método que executa os testes da classe
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		Agenda contato = new Agenda("Luiz Ricardo");

		contato.setEndereco("Rua dos Bobos, número 0");
		contato.setFone("+55(16)99262-4963");
		contato.setEmail("luizracoelho@gmail.com");

		System.out.println(contato.imprimeCadastro());
	}
}

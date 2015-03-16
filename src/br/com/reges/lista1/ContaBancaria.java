package br.com.reges.lista1;

/**
 * Resolução do Exercício 2
 * <p>
 * Modelagem da classe de uma conta bancária.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class ContaBancaria {
	/**
	 * Nome do cliente bancário
	 */
	private String nome;
	/**
	 * Numero da conta do do cliente
	 */
	private String conta;
	/**
	 * Saldo atual do cliente
	 */
	private double saldoAtual = 0.0;

	/**
	 * Método Construtor de Conta Bancária
	 * 
	 * @param nome
	 *            Nome do Cliente
	 * @param conta
	 *            Conta do Cliente
	 */
	public ContaBancaria(String nome, String conta) {
		this.nome = nome;
		this.conta = conta;
	}

	/**
	 * Método Construtor de Conta Bancária com definição do saldo
	 * 
	 * @param nome
	 *            Nome do Cliente
	 * @param conta
	 *            Conta do Cliente
	 * @param saldoAtual
	 *            Saldo Atual da conta do cliente
	 */
	public ContaBancaria(String nome, String conta, double saldoAtual) {
		this(nome, conta);
		this.saldoAtual = saldoAtual;
	}

	/**
	 * Método que registra um saque
	 * 
	 * @param valorDoSaque
	 *            Valor que será sacado
	 */
	public void saque(double valorDoSaque) {
		this.saldoAtual -= valorDoSaque;
	}

	/**
	 * Método que registra um depósito
	 * 
	 * @param valorDoDeposito
	 *            Valor que será depositado
	 */
	public void deposito(double valorDoDeposito) {
		this.saldoAtual += valorDoDeposito;
	}

	/**
	 * Método que mostra o saldo atual da conta bancária
	 * 
	 * @return Saldo Atual
	 */
	public String saldoAtual() {
		return String.format("O cliente %s, conta %s possui R$ %.2f de saldo.",
				this.nome, this.conta, this.saldoAtual);
	}

	/**
	 * Método que executa os testes da classe
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria("Luiz Ricardo",
				"123456-X", 10.0);
		System.out.println(contaBancaria.saldoAtual());

		contaBancaria.deposito(100.0);
		System.out.println(contaBancaria.saldoAtual());

		contaBancaria.saque(50.0);
		System.out.println(contaBancaria.saldoAtual());
	}
}

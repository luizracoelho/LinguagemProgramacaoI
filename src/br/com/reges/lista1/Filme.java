package br.com.reges.lista1;

/**
 * Resolução do Exercício 5
 * <p>
 * Modelagem da classe de filmes de uma locadora.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Filme {
	/**
	 * Código do Filme
	 */
	private int codigo;
	/**
	 * Nome do Filme
	 */
	private String nome;
	/**
	 * Sinopse do Filme
	 */
	private String sinopse;
	/**
	 * Atores Principais do Filme
	 */
	private String[] atores;
	/**
	 * Tempo de Duração do Filme em Minutos
	 */
	private int tempoDeDuracao;
	/**
	 * Distribuidora do Filme
	 */
	private String distribuidora;
	/**
	 * Código de Barras do Filme
	 */
	private String codigoDeBarras;
	/**
	 * Classificação Indicativa do Filme
	 */
	private String classificacao;
	/**
	 * Gênero do Filme
	 */
	private String genero;
	/**
	 * Ano de Lançamento do Filme
	 */
	private int anoDeLancamento;
	/**
	 * Quantidade de Cópias do Filme Disponíveis
	 */
	private int quantidade = 0;

	/**
	 * Método Contrutor da Classe Filme
	 * 
	 * @param codigo
	 *            Código do Filme
	 * @param nome
	 *            Nome do Filme
	 */
	public Filme(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * Efetuar o Empréstimo do Filme
	 */
	public void emprestarFilme() {
		if (this.quantidade == 0)
			System.out.println("Filme Não Disponível Neste Momento!\n");
		else {
			this.quantidade -= 1;
			System.out.println("Empréstimo Efetuado Com Sucesso!\n");
		}
	}

	/**
	 * Efetuar a Devolução do Filme
	 */
	public void devolverFilme() {
		this.quantidade += 1;
	}

	/**
	 * Imprimir os Dados do Filme na Tela
	 * 
	 * @return Dados do Filme
	 */
	public String imprimirDadosDoFilme() {
		StringBuilder sbFilme = new StringBuilder();
		sbFilme.append(String.format("Código:\t\t\t%s\n", this.codigo));
		sbFilme.append(String.format("Nome:\t\t\t%s\n", this.nome));
		sbFilme.append(String.format("Sinopse:\t\t%s\n", this.sinopse));
		sbFilme.append("Atores:\n");
		for (int i = 0; i < this.atores.length; i++) {
			sbFilme.append(String.format("\t\t\t%s\n", this.atores[i]));
		}
		sbFilme.append(String.format("Duração:\t\t%d Minutos\n",
				this.tempoDeDuracao));
		sbFilme.append(String.format("Distribuidora:\t\t%s\n",
				this.distribuidora));
		sbFilme.append(String.format("Código de Barras:\t%s\n",
				this.codigoDeBarras));
		sbFilme.append(String.format("Classificação:\t\t%s\n",
				this.classificacao));
		sbFilme.append(String.format("Gênero:\t\t\t%s\n", this.genero));
		sbFilme.append(String.format("Lançamento:\t\t%d\n",
				this.anoDeLancamento));
		sbFilme.append(String.format("Quantidade:\t\t%d\n", this.quantidade));

		return sbFilme.toString();
	}

	/**
	 * Obter Código do Filme
	 * 
	 * @return Código
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Atribuir Código do Filme
	 * 
	 * @param codigo
	 *            Código
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obter Nome do Filme
	 * 
	 * @return Nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atribuir Nome do Filme
	 * 
	 * @param nome
	 *            Nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter Sinopse do Filme
	 * 
	 * @return Sinopse
	 */
	public String getSinopse() {
		return sinopse;
	}

	/**
	 * Atribuir Sinopse do Filme
	 * 
	 * @param sinopse
	 *            Sinopse
	 */
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	/**
	 * Obter os Atores do Filme
	 * 
	 * @return Atores
	 */
	public String[] getAtores() {
		return atores;
	}

	/**
	 * Atribuir os Atores do Filme
	 * 
	 * @param atores
	 *            Atores
	 */
	public void setAtores(String[] atores) {
		this.atores = atores;
	}

	/**
	 * Obter o Tempo de Duração do Filme em Minutos
	 * 
	 * @return Tempo em Minutos
	 */
	public int getTempoDeDuracao() {
		return tempoDeDuracao;
	}

	/**
	 * Atribuir o Tempo de Duração do Filme em Minutos
	 * 
	 * @param tempoDeDuracao
	 *            Tempo em Minutos
	 */
	public void setTempoDeDuracao(int tempoDeDuracao) {
		this.tempoDeDuracao = tempoDeDuracao;
	}

	/**
	 * Obter a Distribuidora do Filme
	 * 
	 * @return Distribuidora
	 */
	public String getDistribuidora() {
		return distribuidora;
	}

	/**
	 * Atribuir a Distribuidora do Filme
	 * 
	 * @param distribuidora
	 *            Distribuidora
	 */
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	/**
	 * Obter o Código de Barras do Filme
	 * 
	 * @return Código de Barras
	 */
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	/**
	 * Atribuir o Código de Barras do Filme
	 * 
	 * @param codigoDeBarras
	 *            Código de Barras
	 */
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	/**
	 * Obter a Classificação Indicativa do Filme
	 * 
	 * @return Classificação Indicativa
	 */
	public String getClassificacao() {
		return classificacao;
	}

	/**
	 * Atribuir a Classificação Indicativa do Filme
	 * 
	 * @param classificacao
	 *            Classificação Indicativa
	 */
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	/**
	 * Obter o Gênero do Filme
	 * 
	 * @return Gênero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Atribuir o Gênero do Filme
	 * 
	 * @param genero
	 *            Gênero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Obter o Ano de Lançamento do Filme
	 * 
	 * @return Ano de Lançamento
	 */
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	/**
	 * Atribuir o Ano de Lançamento do Filme
	 * 
	 * @param anoDeLancamento
	 *            Ano de Lançamento
	 */
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	/**
	 * Obter a Quantidade de Cópias do Filme Disponíveis
	 * 
	 * @return Quantidade Disponível
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Atribuir a Quantidade de Cópias do Filme Disponíveis
	 * 
	 * @param quantidade
	 *            Quantidade Disponível
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Método que Testa a Classe Filme
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		String[] atoresDoFilme = { "Brooke Shields", "Christopher Atkins" };

		Filme filme = new Filme(1, "A Lagoa Azul");
		filme.setSinopse("Um clássico da sessão da tarde para você desfrutar a qualquer momento do seu dia.");
		filme.setAtores(atoresDoFilme);
		filme.setTempoDeDuracao(104);
		filme.setDistribuidora("Columbia Pictures");
		filme.setCodigoDeBarras("12x34y56w78");
		filme.setClassificacao("Livre");
		filme.setGenero("Drama");
		filme.setAnoDeLancamento(1980);
		filme.setQuantidade(2);
		System.out.println(filme.imprimirDadosDoFilme());

		filme.emprestarFilme();
		filme.emprestarFilme();
		filme.emprestarFilme();
		filme.devolverFilme();

		System.out.println(filme.imprimirDadosDoFilme());
	}
}

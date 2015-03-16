package br.com.reges.lista1;

/**
 * Resolução do Exercício 7
 * <p>
 * Modelagem da classe de livros de Biblioeca.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Livro {
	/**
	 * Código do Livro
	 */
	private int codigo;
	/**
	 * Nome do Livro
	 */
	private String nome;
	/**
	 * Autores do Livro
	 */
	private String[] autores;
	/**
	 * Editora do Livro
	 */
	private String editora;
	/**
	 * Ano de Publicação do Livro
	 */
	private int anoDePublicacao;
	/**
	 * Código de Barras do Livro
	 */
	private String codigoDeBarras;
	/**
	 * Seção do Livro
	 */
	private String secao;
	/**
	 * Prateleira do Livro
	 */
	private String prateleira;
	/**
	 * Quantidade do Livro
	 */
	private int quantidade;

	/**
	 * Método Construtor da Classe
	 * 
	 * @param codigo
	 *            Código do Livro
	 * @param nome
	 *            Nome do Livro
	 */
	public Livro(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * Método que Empresta o Livro
	 */
	public void emprestarLivro() {
		if (this.quantidade == 0)
			System.out.println("Livro Não Disponível Neste Momento!\n");
		else {
			this.quantidade -= 1;
			System.out.println("Empréstimo Efetuado Com Sucesso!\n");
		}
	}

	/**
	 * Método de Devolve o Livro
	 */
	public void devolverLivro() {
		this.quantidade += 1;
	}

	/**
	 * Método que Imprime os Dados do Livro
	 * 
	 * @return Dados do Livro
	 */
	public String imprimirDadosDoLivro() {
		StringBuilder sbFilme = new StringBuilder();

		sbFilme.append(String.format("Código:\t\t\t%s\n", this.codigo));
		sbFilme.append(String.format("Nome:\t\t\t%s\n", this.nome));
		sbFilme.append("Autores:\n");
		for (int i = 0; i < this.autores.length; i++) {
			sbFilme.append(String.format("\t\t\t%s\n", this.autores[i]));
		}
		sbFilme.append(String.format("Editora:\t\t%s\n", this.editora));
		sbFilme.append(String.format("Ano De Publicação:\t%d\n",
				this.anoDePublicacao));
		sbFilme.append(String.format("Código de Barras:\t%s\n",
				this.codigoDeBarras));
		sbFilme.append(String.format("Seção:\t\t\t%s\n", this.secao));
		sbFilme.append(String.format("Prateleira:\t\t%s\n", this.prateleira));
		sbFilme.append(String.format("Quantidade:\t\t%d\n", this.quantidade));

		return sbFilme.toString();
	}

	/**
	 * Obter Autores do Livro
	 * 
	 * @return Autores
	 */
	public String[] getAutores() {
		return autores;
	}

	/**
	 * Atribuir os Autores do Livro
	 * 
	 * @param autores
	 *            Autores
	 */
	public void setAutores(String[] autores) {
		this.autores = autores;
	}

	/**
	 * Obter Editora do Livro
	 * 
	 * @return Editora
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * Atribuir Editora do Livro
	 * 
	 * @param editora
	 *            Editora
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * Obter Ano de Publicação do Livro
	 * 
	 * @return Ano de Publicação
	 */
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	/**
	 * Atribuir Ano de Publicação do Livro
	 * 
	 * @param anoDePublicacao
	 *            Ano de Publicação
	 */
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	/**
	 * Obter Código de Barras
	 * 
	 * @return Código de Barras
	 */
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	/**
	 * Atribuir o Código de Barras
	 * 
	 * @param codigoDeBarras
	 *            Código de Barras
	 */
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	/**
	 * Obter a Seção do Livro
	 * 
	 * @return Seção
	 */
	public String getSecao() {
		return secao;
	}

	/**
	 * Atrivuir a Seção do Livro
	 * 
	 * @param secao
	 *            Seção
	 */
	public void setSecao(String secao) {
		this.secao = secao;
	}

	/**
	 * Obter a Prateleira do Livro
	 * 
	 * @return Prateleira
	 */
	public String getPrateleira() {
		return prateleira;
	}

	/**
	 * Atribui a Prateleira do Livro
	 * 
	 * @param prateleira
	 *            Prateleira
	 */
	public void setPrateleira(String prateleira) {
		this.prateleira = prateleira;
	}

	/**
	 * Obter a Quantidade de Livros
	 * 
	 * @return Quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Atribui a Quantidade de Livros
	 * 
	 * @param quantidade
	 *            Quantidade
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Método que Testa o Funcionamento da Classe
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String[] args) {
		String[] autores = { "C.S. Lewis" };

		Livro livro = new Livro(1,
				"As Crônicas de Nárnia - O Leão, A Feiticeira e o Guarda-Roupa");
		livro.setAutores(autores);
		livro.setEditora("Presença");
		livro.setAnoDePublicacao(2003);
		livro.setCodigoDeBarras("972-23-3020-9");
		livro.setSecao("Fantasia");
		livro.setPrateleira("1.A.2");
		livro.setQuantidade(1);

		System.out.println(livro.imprimirDadosDoLivro());

		livro.emprestarLivro();

		System.out.println(livro.imprimirDadosDoLivro());

		livro.emprestarLivro();

		livro.devolverLivro();

		System.out.println(livro.imprimirDadosDoLivro());
	}
}

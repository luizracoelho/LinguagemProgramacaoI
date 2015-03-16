package br.com.reges.lista1;

/**
 * Resolução do Exercício 8
 * <p>
 * Modelagem da classe de Vôos de uma empresa de aviação que será utilizada
 * junto à classe de Passageiros.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Voo {
	/**
	 * Número do Vôo
	 */
	private int numeroDoVoo;
	/**
	 * Assento do Passageiro no Vôo
	 */
	private String assento;
	/**
	 * País de Origem do Vôo
	 */
	private String paisOrigem;
	/**
	 * Estado de Origem do Vôo
	 */
	private String estadoOrigem;
	/**
	 * Cidade de Origem do Vôo
	 */
	private String cidadeOrigem;
	/**
	 * País de Destino do Vôo
	 */
	private String paisDestino;
	/**
	 * Estado de Destino do Vôo
	 */
	private String estadoDestino;
	/**
	 * Cidade de Destino do Vôo
	 */
	private String cidadeDestino;

	/**
	 * Método Construtor da Classe
	 * 
	 * @param numeroDoVoo
	 *            Número do Vôo
	 * @param assento
	 *            Assento do Passageiro no Vôo
	 */
	public Voo(int numeroDoVoo, String assento) {
		this.numeroDoVoo = numeroDoVoo;
		this.assento = assento;
	}

	/**
	 * Método que Imprime os Dados do Vôo
	 */
	public String toString() {
		StringBuilder sbVoo = new StringBuilder();

		sbVoo.append("\nDados do Vôo:\n");
		sbVoo.append(String.format("Número:\t\t\t\t%s\n", this.numeroDoVoo));
		sbVoo.append(String.format("Assento:\t\t\t%s\n", this.assento));
		sbVoo.append(String.format("Origem:\t\t\t\t%s, %s, %s\n",
				this.paisOrigem, this.estadoOrigem, this.cidadeOrigem));
		sbVoo.append(String.format("Destino:\t\t\t%s, %s, %s\n",
				this.paisDestino, this.estadoDestino, this.cidadeDestino));

		return sbVoo.toString();
	}

	/**
	 * Obter País de Origem do Vôo
	 * 
	 * @return País de Origem
	 */
	public String getPaisOrigem() {
		return paisOrigem;
	}

	/**
	 * Atribui País de Origem do Vôo
	 * 
	 * @param paisOrigem
	 *            País de Origem
	 */
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	/**
	 * Obter Estado de Origem do Vôo
	 * 
	 * @return Estado de Origem
	 */
	public String getEstadoOrigem() {
		return estadoOrigem;
	}

	/**
	 * Atribuir Estado de Origem do Vôo
	 * 
	 * @param estadoOrigem
	 *            Estado de Origem
	 */
	public void setEstadoOrigem(String estadoOrigem) {
		this.estadoOrigem = estadoOrigem;
	}

	/**
	 * Obter Cidade de Origem do Vôo
	 * 
	 * @return Cidade de Origem
	 */
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	/**
	 * Atribuir Cidade de Origem do Vôo
	 * 
	 * @param cidadeOrigem
	 *            Cidade de Origem
	 */
	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	/**
	 * Obter País de Destino do Vôo
	 * 
	 * @return País de Destino
	 */
	public String getPaisDestino() {
		return paisDestino;
	}

	/**
	 * Atribui País de Destino do Vôo
	 * 
	 * @param paisDestino
	 *            País de Destino
	 */
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	/**
	 * Obter Estado de Destino do Vôo
	 * 
	 * @return Estado de Destino
	 */
	public String getEstadoDestino() {
		return estadoDestino;
	}

	/**
	 * Atribuir Estado de Destino do Vôo
	 * 
	 * @param estadoDestino
	 *            Estado de Destino
	 */
	public void setEstadoDestino(String estadoDestino) {
		this.estadoDestino = estadoDestino;
	}

	/**
	 * Obter Cidade de Destino do Vôo
	 * 
	 * @return Cidade de Destino
	 */
	public String getCidadeDestino() {
		return cidadeDestino;
	}

	/**
	 * Atribuir Cidade de Destino do Vôo
	 * 
	 * @param cidadeDestino
	 *            Cidade de Destino
	 */
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
}

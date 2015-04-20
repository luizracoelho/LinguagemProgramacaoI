package br.com.reges.lista3;

/**
 * Classe que modela uma mercadoria de um supermercado
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Mercadoria {
	/**
	 * Código da Mercadoria
	 */
	private int codigo;
	/**
	 * Descrição
	 */
	private String descr;
	/**
	 * Estoque Mínimo da Mercadoria
	 */
	private double estMin;
	/**
	 * Estoque Atual da Mercadoria
	 */
	private double estAtual;

	/**
	 * Método que testa se um produto está abaixo do estoque mínimo
	 * 
	 * @return True ou False
	 */
	public boolean estaAbaixoDoEstoqueMinimo() {
		if (this.estAtual < estMin)
			return true;
		else
			return false;
	}

	/**
	 * Obter Código da Mercadoria
	 * 
	 * @return Código
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Atribuir Código da Mercadoria
	 * 
	 * @param codigo
	 *            Código
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obter a Descrição da Mercadoria
	 * 
	 * @return Descrição
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * Atribuir a Desrição da Mercadoria
	 * 
	 * @param descr
	 *            Descrição
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}

	/**
	 * Obter o Estoque Mínimo da Mercadoria
	 * 
	 * @return Estoque Mínimo
	 */
	public double getEstMin() {
		return estMin;
	}

	/**
	 * Atribuir o Estoque Mpínimo da Mercadoria
	 * 
	 * @param estMin
	 *            Estoque Mínimo
	 */
	public void setEstMin(double estMin) {
		this.estMin = estMin;
	}

	/**
	 * Obter o Estoque Atual da Mercadoria
	 * 
	 * @return Estoque Atual
	 */
	public double getEstAtual() {
		return estAtual;
	}

	/**
	 * Atribuir o Estoque Atual da Mercadoria
	 * 
	 * @param estAtual
	 *            Estoque Atual
	 */
	public void setEstAtual(double estAtual) {
		this.estAtual = estAtual;
	}

	@Override
	/**
	 * Método que imprime os valores
	 */
	public String toString() {
		return String.format("Código:[%3d] Descrição: [%-40s]", this.codigo,
				this.descr);
	}

}

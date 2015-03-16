package br.com.reges.lista1;

/**
 * Resolução do Exercício 1
 * <p>
 * Modelagem da classe de uma lâmpada.
 * 
 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho</a>
 * 
 */
public class Lampada {
	/**
	 * Atributo que armazena se a lampada está acessa ou apagada
	 */
	private boolean ligada = false;

	/**
	 * Método que liga a lâmpada
	 */
	public void ligar() {
		this.ligada = true;
	}

	/**
	 * Método que desliga a lâmpada
	 */
	public void desligar() {
		this.ligada = false;
	}

	/**
	 * Método que retorna a situação atual da lâmpada
	 * 
	 * @return Situação da Lâmpada
	 */
	public String estaLigada() {
		return String.format("A Lâmpada está %s!", this.ligada ? "Acessa"
				: "Apagada");
	}

	/**
	 * Método que executa os testes da classe
	 * 
	 * @param args
	 *            Argumentos
	 */
	public static void main(String args[]) {
		Lampada lampada = new Lampada();

		lampada.ligar();
		System.out.println(lampada.estaLigada());

		lampada.desligar();
		System.out.println(lampada.estaLigada());
	}
}

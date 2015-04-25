package br.com.reges.alunos;

/**
 * Classe que testa a implementação da Classe Aluno
 * 
 * @author Lucas Nascimento
 * 
 */
public class AlunoTeste {

	/**
	 * Método principal a ser chamado na hora de terstarmos nossa implementação
	 * 
	 * @param args
	 *            Argumentos da linha de comando
	 */
	public static void main(String[] args) {

		// Testando um Aluno que seria reprovado
		Aluno aluno = new Aluno("Aluno", "Ensino Fundamental");
		aluno.notaProva = 5.5;
		System.out.println(aluno.resultado());

		// Testando um Aluno que iria para Exame
		AlunoDeGraduacao alunoGraduacao = new AlunoDeGraduacao(
				"AlunoDeGraduacao", "Graduação");
		alunoGraduacao.notaProva = 2.0;
		alunoGraduacao.notaTrabalhoPrimeiroBimstre = 3.0;
		alunoGraduacao.notaProvaSegundoBimestre = 2.0;
		alunoGraduacao.notaTrabalhoSegundoBimestre = 3.0;
		System.out.println(alunoGraduacao.resultado());

		// Testando um Aluno que seria aprovado
		AlunoDePosGraduacao alunoPosGraduacao = new AlunoDePosGraduacao(
				"AlunoDePosGraduacao", "PosGraduação");
		alunoPosGraduacao.notaProva = 5.0;
		alunoPosGraduacao.notaTrabalho = 2.0;
		System.out.println(alunoPosGraduacao.resultado());

		// Testando um Aluno de Graduação
		AlunoDeGraduacaoSemTrabalho alunoGraduacao2 = new AlunoDeGraduacaoSemTrabalho(
				"AlunoDeGraduacaoSemTrabalho", "Gradução Sem Trabalho");
		alunoGraduacao2.notaProva = 6.0;
		alunoGraduacao2.notaProvaSegundoBimestre = 8.0;
		System.out.println(alunoGraduacao2.resultado());

		// Usando polimorfismo imprimiremos uma mensagem para cada aluno
		System.out.println(montaMensagemDeResultado(aluno));
		System.out.println(montaMensagemDeResultado(alunoGraduacao));
		System.out.println(montaMensagemDeResultado(alunoPosGraduacao));
		System.out.println(montaMensagemDeResultado(alunoGraduacao2));

		@SuppressWarnings("unused")
		Aluno alunoPolimofico = (Aluno) alunoPosGraduacao;

		if (aluno instanceof Aluno) {
			// É do tipo Aluno
		} else if (aluno instanceof AlunoDeGraduacao) {
			// É do tipo AlunoDeGraduacao
		} else if (aluno instanceof AlunoDePosGraduacao) {
			// É do tipo AlunoDePosGraduacao
		} else if (aluno instanceof AlunoDeGraduacaoSemTrabalho) {
			// É do tipo AlunoDeGraduacaoSemTrabalho
		}

		// Resolução do Exercício de 06/03/2015 --POLIMORFISMO, CAST E
		// INSTANCEOF
		System.out.println("\nResolução do Exercício do dia 09/02/2015");
		System.out.println(nomeCompletoDoAluno(aluno));
		System.out.println(nomeCompletoDoAluno(alunoGraduacao));
		System.out.println(nomeCompletoDoAluno(alunoPosGraduacao));
		System.out.println(nomeCompletoDoAluno(alunoGraduacao2));
	}

	/**
	 * Usando polimorfismo podemos receber qualquer tipo de objeto que derive
	 * aluno e fazer uso de métodos da Classe em mais alto nível
	 * 
	 * @param aluno
	 * @return
	 */
	private static String montaMensagemDeResultado(Aluno aluno) {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("Caro aluno ").append(aluno.nome)
				.append(" seu resultado foi ").append(aluno.resultado());

		return mensagem.toString();
	}

	/**
	 * Método que retorna o nome do aluno
	 * 
	 * @param aluno Objeto aluno ou classes herdadas 
	 * 
	 * @return "NOME DO ALUNO" Retorno Padrão
	 *         <p>
	 *         "NOME DO ALUNO E NOTA DO TRABALHO DO SEGUNDO BIMESTRE" Caso o
	 *         Aluno seja do tipo de Gradução
	 * 
	 * @author <a href="mailto:luizracoelho@gmail.com">Luiz R. A. Coelho </a>
	 */
	private static String nomeCompletoDoAluno(Aluno aluno) {
		// Criar um novo StringBuilder para concatenar strings
		StringBuilder sbNomeAluno = new StringBuilder();

		// Concatenar o nome do aluno
		sbNomeAluno.append("Nome Completo: ").append(aluno.nome).append(" ")
				.append(aluno.sobrenome);

		/* Verificar se "aluno" é instância de AlunoDeGraduação e não é
		/ instância de AlunoDeGraduacaoSemTrabalho*/
		if (aluno instanceof AlunoDeGraduacao
				&& aluno instanceof AlunoDeGraduacaoSemTrabalho == false) {
			
			//CAST de aluno de graduação
			AlunoDeGraduacao alunoGraduacao = (AlunoDeGraduacao) aluno;

			//Concatenar nota do trabalho do segundo bimestre
			sbNomeAluno.append(", Nota do Trabalho do Segundo Bimestre: ")
					.append(alunoGraduacao.notaTrabalhoSegundoBimestre);
		}

		return sbNomeAluno.toString();
	}
}

package aulas;
public class Filme {
	String nome;
	String sinopse;
	int anoLancamento;
	int duracaoMinutos;
	double somaAvaliacao;
	int quantidadeAvaliacao;
	boolean inclusoPlano;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Sinopse: " + sinopse);
		System.out.println("Ano de lançamento: " + anoLancamento);
	}
	void avalie(double nota) {
		somaAvaliacao += nota;
		quantidadeAvaliacao++;
	}
	double retornaMediaAvaliacao () {
		return somaAvaliacao / quantidadeAvaliacao;
	}
}
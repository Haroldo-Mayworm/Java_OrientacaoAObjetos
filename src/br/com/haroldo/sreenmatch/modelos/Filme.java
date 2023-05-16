package br.com.haroldo.sreenmatch.modelos;
public class Filme {
	private String nome;
	private String sinopse;
	private int anoLancamento;
	private int duracaoMinutos;
	private double somaAvaliacao;
	private int quantidadeAvaliacao;
	private boolean inclusoPlano;
	
	//Pegar Infos
	public String setNome() {
		return nome;
	}
	
	public String setSinopse() {
		return sinopse;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	
	public int getQuantidadeAvaliacao() {
		return quantidadeAvaliacao;
	}
	
	public boolean getInclusoPlano() {
		return inclusoPlano;
	}
	//
	
	//Alterar Infos
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	public void setInclusoPlano(boolean inclusoPlano) {
		this.inclusoPlano = inclusoPlano;
	}
	//
	
	// Métodos
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Sinopse: " + sinopse);
		System.out.println("Ano de lançamento: " + anoLancamento);
	}
	
	public void avalie(double nota) {
		somaAvaliacao += nota;
		quantidadeAvaliacao++;
	}
	
	public double retornaMediaAvaliacao () {
		return somaAvaliacao / quantidadeAvaliacao;
	}
	//
}
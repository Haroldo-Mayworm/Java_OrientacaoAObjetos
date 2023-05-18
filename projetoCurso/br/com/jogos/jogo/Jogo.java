package br.com.jogos.jogo;

public class Jogo {
	private String titulo;
	private String descricao;
	private int totalDownloads;
	private int totalCurtidas;
	private int classificacao;
	
// Getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getTotalDownload() {
		return totalDownloads;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
// Métodos
	public void curte() {
		this.totalCurtidas++;
	}
	
	public void baixa() {
		this.totalDownloads++;
	}
}
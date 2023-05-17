package br.com.haroldo.screenmatch.modelos;

public class Serie extends Titulo {
	private int temporada;
	private int episodiosTemporada;
	private boolean ativa;
	private int minutosEpisodio;
	
	public int getTemporada() {
		return temporada;
	}
	
	public int getEpisodiosTemporada() {
		return episodiosTemporada;
	}
	
	public boolean getAtiva() {
		return ativa;
	}
	
	public int getMinutosEpisodio() {
		return minutosEpisodio;
	}
	
	@Override
	public int getDuracaoMinutos() {
		return temporada * episodiosTemporada * minutosEpisodio;
	}
	
//
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	public void setEpisodiosTemporada(int episodiosTemporada) {
		this.episodiosTemporada = episodiosTemporada;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public void setMinutosEpisodio(int minutosEpisodio) {
		this.minutosEpisodio = minutosEpisodio;
	}
}

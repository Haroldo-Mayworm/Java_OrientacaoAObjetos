package br.com.jogos.modelos;

import br.com.jogos.jogo.Jogo;

public class Tabuleiro extends Jogo {
	private String genero;
	private int minimoJogadores;
	private int faixaEtaria;
	
// Getters
	public String getGenero() {
		return genero;
	}
	
	public int getMinimoJogadores() {
		return minimoJogadores;
	}
	
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
// Setters
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setMinimoJogadores(int minimoJogadores) {
		this.minimoJogadores = minimoJogadores;
	}
	
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
// Métodos
	@Override
	public int getClassificacao() {
		if (this.getTotalCurtidas() > 500) {
			return 9;
		} else {
			return 5;
		}
	}
}
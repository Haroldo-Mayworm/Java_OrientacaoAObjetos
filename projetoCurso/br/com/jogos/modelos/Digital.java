package br.com.jogos.modelos;

import br.com.jogos.jogo.Jogo;

public class Digital extends Jogo {
	private String plataforma;
	private String desenvolvedor;
	private int duracaoDoJogoMinutos;
	
// Getters
	public String getPlataforma() {
		return plataforma;
	}
	
	public String getDesenvolvedor() {
		return desenvolvedor;
	}
	
	public int getDuracaoDoJogoMinutos() {
		return duracaoDoJogoMinutos;
	}
// Setters
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}
	
	public void setDuracaoDoJogoMinutos(int duracaoDoJogoMinutos) {
		this.duracaoDoJogoMinutos = duracaoDoJogoMinutos;
	}
// Métodos
	@Override
	public int getClassificacao() {
		if (this.getTotalCurtidas() > 900) {
			return 10;
		} else {
			return 6;
		}
	}
}
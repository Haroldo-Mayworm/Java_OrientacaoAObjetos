package br.com.haroldo.screenmatch.modelos;

import br.com.haroldo.screenmatch.calculo.Classificacao;

public class Episodio implements Classificacao {
	private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacao;
    
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Serie getSerie() {
		return serie;
	}	
	
	public int getTotalVisualizacao() {
		return totalVisualizacao;
	}
//
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	} 
	
	public void setTotalVisualizacao(int totalVisualizacao) {
		this.totalVisualizacao = totalVisualizacao;
	} 
//  
	
	@Override
	public int getClassificacao() {
		if (totalVisualizacao > 100) {
			return 5;
		} else {
			return 3;
		}
	}
}

package br.com.haroldo.screenmatch.calculo;

public class FiltroRecomendacao {
	
	public void filtra(Classificacao classificacao) {
		if (classificacao.getClassificacao() >= 4) {
			System.out.println("Esse é um ótimo filme!");
		} else if (classificacao.getClassificacao() >= 2) {
			System.out.println("Esse é um bom filme!");
		} else {
			System.out.println("Esse não é um bom filme!");
		}
	}
	
	
	
	
	
}
package br.com.haroldo.screenmatch.modelos;

import br.com.haroldo.screenmatch.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
	private String diretor;
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) retornaMediaAvaliacao() / 2;
	}
}
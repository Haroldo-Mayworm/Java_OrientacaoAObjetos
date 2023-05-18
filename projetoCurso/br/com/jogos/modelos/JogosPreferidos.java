package br.com.jogos.modelos;

import br.com.jogos.jogo.Jogo;

public class JogosPreferidos {
	public void inclui(Jogo jogo) {
		if(jogo.getClassificacao() >= 9) {
            System.out.println(jogo.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(jogo.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
	}
}
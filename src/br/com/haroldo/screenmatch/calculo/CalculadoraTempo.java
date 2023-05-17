package br.com.haroldo.screenmatch.calculo;
import br.com.haroldo.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void inclui(Titulo titulo) {
		tempoTotal += titulo.getDuracaoMinutos();
	}
	
}
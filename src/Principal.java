import br.com.haroldo.screenmatch.calculo.CalculadoraTempo;
import br.com.haroldo.screenmatch.calculo.FiltroRecomendacao;
import br.com.haroldo.screenmatch.modelos.Episodio;
import br.com.haroldo.screenmatch.modelos.Filme;
import br.com.haroldo.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		
		Filme filmeFavorito = new Filme();
		filmeFavorito.setNome("Arremessando Alto");
		filmeFavorito.setSinopse("""
						Mergulhando no universo do 
						basquete norte-americano, Arremessando 
						Alto mostra o caça-talentos Stanley Beren 
						em busca de um novo gênio do basquete""");
		filmeFavorito.setAnoLancamento(2022);
		filmeFavorito.setDuracaoMinutos(117);
		filmeFavorito.setInclusoPlano(true);
		
		filmeFavorito.exibeFichaTecnica();
		
		filmeFavorito.avalie(10);
		filmeFavorito.avalie(6);
		filmeFavorito.avalie(8);
		filmeFavorito.avalie(8);
		filmeFavorito.avalie(7);
		System.out.println("A média é: " + filmeFavorito.retornaMediaAvaliacao());
		
		System.out.println(filmeFavorito.getQuantidadeAvaliacao());	
//
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Uma Noite no Museu");
		outroFilme.setAnoLancamento(1991);
		outroFilme.setDuracaoMinutos(109);
//
		
		Serie supernatural = new Serie();
		supernatural.setNome("supernatural");
		supernatural.setSinopse("""
								Os irmãos Sam e Dean Winchester 
								encaram cenários sinistros 
								caçando monstros.""");
		supernatural.setAnoLancamento(2005);
		supernatural.setTemporada(15);
		supernatural.setEpisodiosTemporada(10);
		supernatural.setMinutosEpisodio(50);
		System.out.println("Duração total da serie: " + supernatural.getDuracaoMinutos());
		supernatural.exibeFichaTecnica();
//			
		
		CalculadoraTempo calculadora = new CalculadoraTempo();
		calculadora.inclui(filmeFavorito);
		calculadora.inclui(outroFilme);
		calculadora.inclui(supernatural);
		System.out.println(calculadora.getTempoTotal());
//
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(filmeFavorito);
//		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(supernatural);
		episodio.setTotalVisualizacao(250);
		
		filtro.filtra(episodio);
		System.out.println(episodio.getClassificacao());
		
		
		
		
		
	}
}
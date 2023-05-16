import br.com.haroldo.sreenmatch.modelos.Filme;

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
		System.out.println(filmeFavorito.retornaMediaAvaliacao());
		
		System.out.println(filmeFavorito.getQuantidadeAvaliacao());
	}
}
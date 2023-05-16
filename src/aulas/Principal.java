package aulas;

public class Principal {
	public static void main(String[] args) {
		
		Filme filmeFavorito = new Filme();
		filmeFavorito.nome = "Arremessando Alto";
		filmeFavorito.sinopse = """
						Mergulhando no universo do 
						basquete norte-americano, Arremessando 
						Alto mostra o caça-talentos Stanley Beren 
						em busca de um novo gênio do basquete""";
		filmeFavorito.anoLancamento = 2022;
		filmeFavorito.duracaoMinutos = 117;
		filmeFavorito.somaAvaliacao = 0;
		filmeFavorito.quantidadeAvaliacao = 0;
		filmeFavorito.inclusoPlano = true;
		
		filmeFavorito.exibeFichaTecnica();
		
		filmeFavorito.avalie(10);
		filmeFavorito.avalie(6);
		filmeFavorito.avalie(8);
		filmeFavorito.avalie(8);
		filmeFavorito.avalie(7);
		System.out.println(filmeFavorito.somaAvaliacao);
		System.out.println(filmeFavorito.quantidadeAvaliacao);
		
		System.out.println(filmeFavorito.retornaMediaAvaliacao());
	}
}
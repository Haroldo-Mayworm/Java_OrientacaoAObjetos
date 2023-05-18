import br.com.jogos.modelos.Digital;
import br.com.jogos.modelos.JogosPreferidos;
import br.com.jogos.modelos.Tabuleiro;

public class Principal2 {
	public static void main(String[] args) {
		Digital red = new Digital();
		red.setTitulo("Red Dead Redemption");
		red.setDescricao("""
					Estados Unidos, 1899. O fim da era do velho oeste começou. 
					Depois de tudo dar errado durante um roubo em uma cidade 
					do oeste chamada Blackwater, Arthur Morgan
					e a gangue Van der Linde são forçados a fugir.
					""");
		red.setPlataforma("ps4, xbox, pc");
		red.setDesenvolvedor("Rockstar Games");
		red.setDuracaoDoJogoMinutos(1200);
		
		for (int i = 0; i < 4400; i++) {
			red.baixa();
		}
		for (int i = 0; i < 1000; i++) {
			red.curte();
		}
//
		Tabuleiro war = new Tabuleiro();
		war.setTitulo("War");
		war.setDescricao("""
						Com War, uma batalha nunca é igual a outra,
						e cada jogador precisa usar toda sua habilidade militar para conquistar 
						territórios e continentes e derrotar seus adversários.
						""");
		war.setGenero("Estratégia");
		war.setMinimoJogadores(4);
		war.setFaixaEtaria(10);
		
		for (int i = 0; i < 1500; i++) {
			war.baixa();
		}
		for (int i = 0; i < 50; i++) {
			war.curte();
		}
// 
		JogosPreferidos preferidos = new JogosPreferidos();
		preferidos.inclui(red);
		preferidos.inclui(war);
	}
}
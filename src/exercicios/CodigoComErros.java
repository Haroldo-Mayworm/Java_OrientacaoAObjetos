package exercicios;

public class CodigoComErros {
// ERRADO
	public class Venda {
	    String produto;
	    int quantidade;
	    double valorUnitario;
	    double valorTotal;
	}
	public static void main(String[] args) {
	    venda1.produto = "Camiseta";
	    venda1.quantidade = "2";
	    venda1.valorUnitario = 25.50;
	    System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);
	}
//FIM-ERRADO

// CORREÇÃO
	public class VendaPrincipal {
		public static void main(String[] args) {
		    Venda venda1 = new Venda();
		    venda1.produto = "Camiseta";
		    venda1.quantidade = 2;
		    venda1.valorUnitario = 25.50;
	
		    System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);
		}
	}
// FIM-CORREÇÃO
}

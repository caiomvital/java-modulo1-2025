package modelos;

public class Principal {
	public static void main(String[] args) {

		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.anoLancamento = 1938;
		fusca.cor = "Preto";
		Carro palio = new Carro();
		palio.marca = "Fiat";
		palio.modelo = "Palio";
		palio.anoLancamento = 2000;
		palio.cor = "Vermelho";
		fusca.ligarRadio();
		
	

		
		
		
//		byd.marca = "BYD";
//		String marca = "Honda";
//		
//		byd.modelo = "King";
//		byd.anoLancamento = 2024;
//		byd.cor = "Azul Piscina";
//		System.out.println("Marca do Objeto: " + byd.marca);
//		System.out.println("Marca da Variável: " + marca);
//		System.out.println(byd.modelo);
//		System.out.println(byd.anoLancamento);
//		System.out.println(byd.cor);
	
	}
}

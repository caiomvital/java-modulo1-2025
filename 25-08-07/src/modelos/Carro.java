package modelos;

public class Carro {

	
	// atributos da classe Carro
	String marca;
	String modelo;
	Integer anoLancamento;
	String cor;
	boolean radioLigado;
	boolean carroLigado;
	
	void ligarCarro() {
		//se o carro já estiver ligado
		if(carroLigado == true) {
			System.out.println("Carro já está ligado!");
		} else {
		//não ligue novamente
		//senão, ligue o carro
		carroLigado = true;
		System.out.println("Carro foi ligado!");

		}
	}
	
	void desligarCarro() {
		//se o carro já estiver ligado
				if(carroLigado == false) {
					System.out.println("Carro já está desligado!");
				} else {
				//não ligue novamente
				//senão, ligue o carro
				carroLigado = false;
				System.out.println("Carro foi desligado!");

				}
	}
	
	
	void ligarRadio() {
		
		if(carroLigado == true) {
		radioLigado = true;
		System.out.println("Tocando Calypso!");
		
		} else {
			System.out.println("Não posso ligar o rádio com o carro desligado.");
			ligarCarro();
			ligarRadio();
			desligarCarro();
		}
		
	}
	
	void desligarRadio() {
		radioLigado = false;
	}
	
	
	
	
	
	
	
//	@Override
//	public String toString() {
//		
//		String dados = "Marca: " + marca;
//		dados += "\nModelo: " + modelo;
//		dados += "\nAno: " + anoLancamento;
//		dados += "\nCor: " + cor;
//		
//		return dados;
//	}
	
	
}

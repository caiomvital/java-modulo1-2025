package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

	/*Para um motorista de aplicativo, peça os valores 
	 * de 5 corridas e, ao final, mostre o total ganho no turno.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		nomes.add("Tadeu");
		nomes.add("Gervásio");
		nomes.add("Jurema");
		System.out.println(nomes);
		
		double valorCorrida = 0;
		double total = 0;
		for(int i = 1; i <= 5; i++) {
		System.out.println("Digite o valor da corrida: ");
		valorCorrida = scan.nextDouble();
		total += valorCorrida;
		}
		
		System.out.println("Total: R$ " + total);	
		
	}
	
}

package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	/*Peça ao usuário que informe o valor final de uma corrida 
de aplicativo. Se o valor for maior que R$50, mostre 
"Corrida longa", se estiver entre R$20 e R$50, "Corrida média", 
senão, "Corrida curta".
	 * */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da corrida: ");
		double valor = scan.nextDouble();
		
		String tipoCorrida = "";
		
		if(valor > 50.0) {
			tipoCorrida = "Corrida longa";
		} else if(valor <= 50 && valor > 20) {
			tipoCorrida = "Corrida média";
		} else {
			tipoCorrida = "Corrida curta"; 
		}
		
		System.out.println("Tipo de corrida: " + tipoCorrida);
		
		
		
	}
	
}

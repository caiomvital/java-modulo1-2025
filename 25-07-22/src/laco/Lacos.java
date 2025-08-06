package laco;

import java.util.Random;
import java.util.Scanner;

public class Lacos {
	public static void main(String[] args) {
			
		/*a partir do codigo abaixo
		crie mais 3 variáveis
		uma para multiplos de 2
		outra para multiplos de 3
		mais uma para multiplos de 5
		caso o numero inserido pelo usuário
		seja multiplo de 2, 3 e/ou 5, 
		incremente a variável correspondente*/
		
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int valor = 0;
		int soma = 0;
		int multiploDe2 = 0;
		int multiploDe3 = 0;
		int multiploDe5 = 0;
		while(true) {
			
	System.out.println("Digite um número ou digite 0 para sair");
	valor = scan.nextInt();
			
	
	if(valor % 2 == 0) {
		multiploDe2 += valor;
	}
	
	if(valor % 3 == 0) {
		multiploDe3 += valor;
	}
	
	if(valor % 5 == 0) {
		multiploDe5 += valor;
	}
	
	//se for multiplo de 3
	// multiploDe3 += valor
	
	//se for multiplo de 5
	// multiploDe5 += valor
	
	if(valor == 0) {
		//saia do laço while
		break;
	} 
		soma = soma + valor;
			
}
		
	System.out.println("Soma total: " + soma);
	System.out.println("Soma dos multiplos de 2: " + multiploDe2);
	System.out.println("Soma dos multiplos de 3: " + multiploDe3);
	System.out.println("Soma dos multiplos de 5: " + multiploDe5);
		
		
		
//		int valorSorteado = r.nextInt(1, 31); // 15
//		System.out.println("Digite um número: ");
//		int numeroDigitado = scan.nextInt();
//
//		
//		
//		
//		while(valorSorteado != numeroDigitado) {
//			
//			
//			if(numeroDigitado > valorSorteado) {
//				System.out.println("Valor é maior que o valor sorteado");
//				System.out.println("Tente novamente: ");
//				numeroDigitado = scan.nextInt();
//			
//			} else if(numeroDigitado < valorSorteado) {
//				System.out.println("Valor é menor que o valor sorteado");
//				System.out.println("Tente novamente: ");
//				numeroDigitado = scan.nextInt();
//			} 
//			
//		}
//
//		System.out.println("Você acertou!");
//		System.out.println("O valor sorteado foi " + valorSorteado);
//		
	}
}

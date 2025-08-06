package exercicio;

import java.util.Random;
import java.util.Scanner;

public class ExercicioLaco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		
		Integer soma = 0;
		Integer multiplos2 = 0;
		Integer multiplos3 = 0;
		Integer multiplos5 = 0;
		
		
		/*
		 * a partir do codigo abaixo crie mais 3 variáveis 
		 * uma para multiplos de 2 outra
		 * para multiplos de 3 mais uma para multiplos de 5 
		 * caso o numero inserido pelo
		 * usuário seja multiplo de 2, 3 e/ou 5, 
		 * incremente a variável correspondente
		 */
		
		while(true) {
			System.out.println("Entre com um número ou 0 para sair: ");
			Integer num = scan.nextInt();
			soma += num;
			
			if (num == 0) {
				break;
			}
			
			if(num % 2 == 0) {
				multiplos2++;
			}
			
			if(num % 3 == 0) {
				multiplos3++;
			}
			
			if(num % 5 == 0) {
				multiplos5++;
			}
			
			
			
		}
		
		System.out.println("Soma total: " + soma);
		System.out.println("Quantidade de múltiplos de 2: " + multiplos2);
		System.out.println("Quantidade de múltiplos de 3: " + multiplos3);
		System.out.println("Quantidade de múltiplos de 5: " + multiplos5);
		
	}

}

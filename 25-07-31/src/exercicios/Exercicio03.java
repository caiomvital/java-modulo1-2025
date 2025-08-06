package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

	/*
	 * 1. Solicite ao usuário que insira 
	 * 2. os preços de produtos 
comprados em uma ida ao supermercado 
	3. (em uma lista), 
	4. até decidir parar. 
	Ao final, mostre a média de gastos por produto.
	 * */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> precos = new ArrayList<>();
		double preco;
		int contador = 1;
		double media = 0;
		double total = 0;
		while(true) {
			System.out.printf("Informe o preço do %dº produto: R$ ", contador);
			preco = scan.nextDouble(); 
			precos.add(preco);
			total += preco;
			scan.nextLine(); // limpeza de buffer
			
			System.out.println("Quer adicionar um novo produto? S/N");
			String opcao = scan.nextLine().toUpperCase();
			// não -> NÃO
			// sim -> SIM
			
	
			
			if(opcao.charAt(0) == 'N') {
				break;
			}
			else if (opcao.charAt(0) == 'S') {
				contador++; 
			}
			else {
				System.out.println("Opção inválida"); break;
			}
			
			
		}
		
		media = total / precos.size();
		
		System.out.println("Média de preços: " + media);
		
		
	}
	
}

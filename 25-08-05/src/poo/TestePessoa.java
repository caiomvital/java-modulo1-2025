package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome da pessoa: ");
			String nome = scan.nextLine();
			Pessoa p = new Pessoa(nome);
			pessoas.add(p);
		}
		// lambda
		System.out.println("~~~~~~");
		pessoas.forEach(p -> System.out.println(p.nome));
		System.out.println("~~~~~~");
		
		
		
	
	}
		
	
	
}

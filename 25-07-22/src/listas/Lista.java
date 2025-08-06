package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lista {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random random = new Random();
		
		List<Integer> valores = new ArrayList<>();
		
		//contador = 1
		//contador = 2
		//...
		//contador = 20
		
		//para meu contador iniciando em um
		//e sendo menor que 20
		//aumente o contador em um
		
		for(int i = 1; i <= 10; i++) {
			valores.add(random.nextInt(1, 21));
		}
		
		
		System.out.println(valores);
		
//Adicione o número 11 à Lista criada no exercício anterior. 
		
	}
}

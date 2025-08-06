package exercicios;

import java.util.Scanner;
import static java.io.IO.readln;
import static java.io.IO.println;



public class Teste {
public static void main(String[] args) {
	
	String nome = readln("Digite um nome: ");
	Integer idade = Integer.parseInt("Digite sua idade: ");
	Double altura = Double.parseDouble(readln("Digite sua altura: "));
	
	System.out.printf("Nome: %s%nIdade: %dAltura: %fm", nome, idade, altura);
	
//	avaliar();
//	avaliar();
//	avaliar();

	
	
	
	
//	informarAvaliacao();
//	double valorRecebido = calcularCorrida(2, 4.20);
//	
//	System.out.println(valorRecebido);
	
	
	
	
}


static double calcularCorrida(int km, double valorCorrida) {
	
	return km * valorCorrida;
}

static void informarAvaliacao() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Você foi bem atendido?");
	String avaliacao = scan.nextLine();
	System.out.println("Deseja fazer um comentário sobre seu atendimento?");
	String opcao = scan.nextLine();
	
	if(opcao.toLowerCase().charAt(0) == 's') {
		System.out.println("Digite um comentário: ");
		String comentario = scan.nextLine();
		System.out.println("Comentário do cliente: " + comentario);
	} else {
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Obrigado!");
	}

}

static void avaliar() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe a quantidade de estrelas: ");
	System.out.println("1 - ⭐");
	System.out.println("2 - ⭐⭐");
	System.out.println("3 - ⭐⭐⭐");
	System.out.println("4 - ⭐⭐⭐⭐");
	System.out.println("5 - ⭐⭐⭐⭐⭐");
	
	int opcao = scan.nextInt();
	
	switch(opcao) {
	case 1 -> System.out.println("Meu querido, o que está acontecendo!!");
	case 2 -> System.out.println("Ainda tem que melhorar!");
	case 3 -> System.out.println("Está no caminho certo!");
	case 4 -> System.out.println("Quase lá!!");
	case 5 -> System.out.println("Parabéns, nota 10!!");


	}
	
}
	



}

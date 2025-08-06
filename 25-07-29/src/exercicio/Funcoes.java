package exercicio;

import java.util.Scanner;

public class Funcoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome = "Tadeu";
		// System.out.println("Olá, " + nome);
		
		//String cpf = validarCpf();
		
		//System.out.println(cpf);
		
		somar(3, 6);
		subtrair(3, 2);
		int soma = somarComRetorno(3, 6);
		
	}

	static void saudacao(String nome) {
		System.out.println("Olá, " + nome + "!");

	}

	static String validarCpf() {
		String regex = "^\\d+$";
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com seu cpf: ");
		String cpf = scan.nextLine();

		while (cpf.length() != 11 || !cpf.matches(regex)) {
			System.out.print("Insira um cpf válido: ");
			cpf = scan.nextLine();
		}
		
				return cpf;
			}
		
	
	static void somar(int a, int b) {
		System.out.println(a + b);
	}
	
	static void subtrair(int a, int b) {
		System.out.println(a - b);
	}
	
	static int somarComRetorno(int a, int b){
		return a + b;
	}
	
	
	}

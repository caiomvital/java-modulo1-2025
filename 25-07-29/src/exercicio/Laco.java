package exercicio;

import java.util.Scanner;

public class Laco {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

		//System.out.printf("Seu cpf é: %s", cpf);
		
		String regex = "^\\d+$";
		//expressao regular -> regex -> 
//		if(cpf.length() != 11 || !cpf.matches(regex)) {
//			System.out.println("CPF inválido!");
//		} else {
//			System.out.println("CPF válido!");
//		}
		
		
		while(true) {
			System.out.println("Insira seu cpf: ");
			String cpf = scan.nextLine();
			if(cpf.length() != 11 || !cpf.matches(regex)) {
				System.out.println("CPF inválido!");
			} else {
				System.out.println("CPF válido!");
				String cpfFormatado = cpf.substring(0, 3) + "." +
                        cpf.substring(3, 6) + "." +
                        cpf.substring(6, 9) + "-" +
                        cpf.substring(9, 11);
				
				System.out.println(cpfFormatado);
				break;
			}
			
		}
		
		// Verifica se tem exatamente 11 dígitos
//        if (cpf.length() == 11 && cpf.matches("\\d+")) {
//            String cpfFormatado = cpf.substring(0, 3) + "." +
//                                  cpf.substring(3, 6) + "." +
//                                  cpf.substring(6, 9) + "-" +
//                                  cpf.substring(9, 11);
		
	}

}

package poo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		
		//primeiro cliente
//		String nomeCliente1 = "Gervásio";
//		String telefoneCliente1 = "819998888333";
//		String enderecoCliente1 = "Rua Tal, 123";
		
		//segundo cliente
		String nomeCliente2 = "Gervásio";
		String telefoneCliente2 = "819998888333";
		String enderecoCliente2 = "Rua Tal, 123";
		
		List<String> nomesClientes = new ArrayList<>();
		List<String> telefonesClientes = new ArrayList<>();
		List<String> enderecosClientes = new ArrayList<>();
		
		nomesClientes.add("Gervásio");
		telefonesClientes.add("819998888333");
		enderecosClientes.add("Rua Tal, 123");
		
		// terceiro cliente
		Cliente fabricio = new Cliente();
		fabricio.nome = "Fabricio";
		fabricio.telefone = "8199999";
		fabricio.endereco = "Rua das Ninfas, 123";
		
		fabricio.exibirDados();
		
		// quarto cliente
		Cliente jacira = new Cliente();
		jacira.nome = "Jacira";
		jacira.telefone = "8198998";
		jacira.endereco = "Rua do Farol, 321";
		jacira.exibirDados();
		
		
		
		
		
				
		
		
		
	}
}

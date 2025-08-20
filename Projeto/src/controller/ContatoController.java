package controller;

import java.util.List;
import java.util.Scanner;

import model.Contato;
import services.ContatoService;

public class ContatoController {

	private ContatoService contatoService;
	
	public ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	
	public void adicionarContato() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do contato: ");
		String nome = scan.nextLine();
		contatoService.adicionarContato(nome);
		
	}
	
	public void listarContatos() {
		List<Contato> lista = contatoService.listarContatos();
		
		for(Contato contato : lista) {
			System.out.println(contato);
		}
	}
	
	public void localizarContatoPorNome() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do contato a ser localizado: ");
		String nome = scan.nextLine();
		Contato contato = contatoService.localizarContatoPorNome(nome);
		
		if(contato != null) {
			System.out.println(contato);
		} else {
			System.out.println("Contato inexistente.");
		}
		
	}
	
	public void atualizarContato() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome antigo do contato: ");
		String nomeAntigo = scan.nextLine();
		
		Contato contato = contatoService.localizarContatoPorNome(nomeAntigo);
		if(contato != null) {
			System.out.println("Digite o novo nome do contato: ");
			String nomeNovo = scan.nextLine();
			contatoService.atualizarContato(nomeAntigo, nomeNovo);
		} else {
			System.out.println("Contato inexistente.");
		}
	}

	public void removerContato() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite o nome do contato a ser removido: ");
		String nome = scan.nextLine();
		Contato contato = contatoService.localizarContatoPorNome(nome);
		if(contato != null) {
			if(contatoService.removerContato(nome)) {
				System.out.println("Contato removido com sucesso.");
			} else {
				System.out.println("Contato não removido.");
			}
		} else {
			System.out.println("Contato inexistente.");
		}
		
	}
	
	
}

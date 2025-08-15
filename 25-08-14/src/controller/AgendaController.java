package controller;

import java.util.List;
import java.util.Scanner;

import model.Contato;

public class AgendaController {
	ContatoController controller;
	
	public AgendaController(ContatoController controller) {
		this.controller = new ContatoController();
	}
	
	public void adicionarContato() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do contato: ");
		String nome = scan.nextLine();
		System.out.println("Digite o telefone: ");
		String telefone = scan.nextLine();
		controller.adicionarContato(nome, telefone);
		
	}
	public void listarContatos() {
		List<Contato> contatos = controller.listarContatos();
		for(Contato c : contatos) {
			System.out.println("~~~~~~~~");
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Telefone: " + c.getTelefone());
			System.out.println("~~~~~~~~");
		}
	}
	
	public void buscarPorId() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o id do contato: ");
		int id = Integer.parseInt(scan.nextLine());
	//	int id = scan.nextInt(); scan.nextLine(); limpar o buffer
		Contato contato = controller.buscarPorId(id);
		if(contato != null) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
		} else {
			System.out.println("Não existe contato com o id " + id);
		}
		

		

	}
	
	public void atualizarContato() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o ID do contato a alterar: ");
		int id = scan.nextInt(); scan.nextLine();
		Contato contato = controller.buscarPorId(id);
		
		if(contato != null) {
			System.out.println("Digite o novo nome: ");
			String nome = scan.nextLine();
			System.out.println("Digite o novo telefone: ");
			String telefone = scan.nextLine();
			controller.atualizarContato(id, nome, telefone);
		} else {
			System.out.println("Não existe contato com o id " + id);
		}
		
		
		
	}
	
	public void removerContato() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o ID do contato a remover: ");
		int id = scan.nextInt(); scan.nextLine();
		if(controller.removerContato(id)) {
			System.out.println("Contato removido com sucesso");
		} else {
			System.out.println("Contato não removido.");
		}
		
	}
	
	
}

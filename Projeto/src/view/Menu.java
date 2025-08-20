package view;

import java.util.Scanner;

import controller.ContatoController;
import repository.ContatoRepository;
import services.ContatoService;

public class Menu {

	private ContatoRepository repository = new ContatoRepository();
	private ContatoService service = new ContatoService(repository);
	private ContatoController controller = new ContatoController(service);
	
	
	public void exibirMenu() {
		Scanner scan = new Scanner(System.in);
		
		
		String menu = """
				1 - Adicionar Contato;
				2 - Listar Contatos;
				3 - Localizar Contato por Nome;
				4 - Atualizar Contato;
				5 - Remover Contato;
				0 - Sair
				""";
		
		
		while (true) {
			System.out.println(menu);
			System.out.println("Digite sua opção");
			int opcao = scan.nextInt();
			switch (opcao) {
			case 1 -> controller.adicionarContato();
			case 2 -> controller.listarContatos();
			case 3 -> controller.localizarContatoPorNome();
			case 4 -> controller.atualizarContato();
			case 5 -> controller.removerContato();
			case 0 -> {
				return;
			}
			}
		}
		
	}
	
}

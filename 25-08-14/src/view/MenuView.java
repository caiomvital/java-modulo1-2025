package view;

import controller.ContatoController;
import controller.AgendaController;
import model.Contato;
import model.Compromisso;
import java.util.Scanner;

public class MenuView {
    private static ContatoController contatoController = new ContatoController();
    private static AgendaController agendaController = new AgendaController(contatoController);
    private static Scanner scan = new Scanner(System.in);

    public static void exibirMenu() {
        int opcao;
        while(opcao != 0)
            System.out.println("\n=== AGENDA ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Atualizar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Adicionar compromisso");
            System.out.println("6 - Listar compromissos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(scan.nextLine()); // outra forma de evitar o " " no buffer do Scanner

            switch (opcao) {
                case 1 -> adicionarContato();
                case 2 -> listarContatos();
                case 3 -> atualizarContato();
                case 4 -> removerContato();
                case 5 -> adicionarCompromisso();
                case 6 -> listarCompromissos();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
    }
}

    private static void adicionarContato() {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Telefone: ");
        String telefone = scan.nextLine();
        Contato c = contatoController.adicionarContato(nome, telefone);
        System.out.println("Adicionado: " + c.exibirResumo());
    }

private static void listarContatos() {
        contatoController.listarContatos()
                .forEach(c -> System.out.println(c.exibirResumo())); //outra forma de exibir usando o forEach
    }

    private static void atualizarContato() {
        System.out.print("ID do contato: ");
        int id = Integer.parseInt(scan.nextLine());
        System.out.print("Novo nome: ");
        String nome = scan.nextLine();
        System.out.print("Novo telefone: ");
        String telefone = scan.nextLine();
        if (contatoController.atualizarContato(id, nome, telefone)) {
            System.out.println("Atualizado com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void removerContato() {
        System.out.print("ID do contato: ");
        int id = Integer.parseInt(scan.nextLine());
        if (contatoController.removerContato(id)) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void adicionarCompromisso() {
        System.out.print("Descrição: ");
        String descricao = scan.nextLine();
        System.out.print("Data e hora: ");
        String dataHora = scan.nextLine();
        System.out.print("ID do contato: ");
        int idContato = Integer.parseInt(scan.nextLine());
        Compromisso comp = agendaController.criarCompromisso(descricao, dataHora, idContato);
        if (comp != null) {
            System.out.println("Adicionado: " + comp.exibirResumo());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void listarCompromissos() {
        agendaController.listarCompromissos()
                .forEach(c -> System.out.println(c.exibirResumo()));
    }
}
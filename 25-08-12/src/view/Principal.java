package view;


import java.util.Scanner;

import model.Caixa;
import model.Produto;


public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        
        Caixa caixa = new Caixa();
        
        int opcao;

        System.out.println("=== Sistema do Caixa ===");
        System.out.println("Digite 0 para sair.");

        while (true) {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Calcular total");
            System.out.println("5 - Finalizar compra");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();
            
            switch(opcao) {
            case 1 -> {
            	Produto produto = new Produto();
            	System.out.println("Informe o nome do produto: ");
            	String nome = scan.nextLine();
            	System.out.println("Informe o preço do produto: ");
            	Double preco = scan.nextDouble(); scan.nextLine();
            	produto.setNome(nome);
            	produto.setPreco(preco);
            	caixa.adicionarProduto(produto);
            }
            case 2 -> {
            	System.out.println("Informe o índice do produto a ser removido: ");
            	int indice = scan.nextInt(); scan.nextLine();
            	caixa.removerProduto(indice);
            	
            }
            case 3 -> {
            	caixa.listarProdutos();
            }
            case 4 -> {
            	double total = caixa.calcularTotal();
            	System.out.printf("Total até o momento: R$ %.2f", total);
            }
            case 5 -> {
            	caixa.finalizarCompra();
            }
            case 0 -> {
            	break;
            }
            
            
            }
            
            
            

            
        }
    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    
	public List<Produto> produtos;
    
	public Caixa() {
		this.produtos = new ArrayList<>();
	}
	
	
    public void adicionarProduto(Produto produto) {
    	this.produtos.add(produto);
    }

    public void removerProduto(int indice) {
    	indice = indice -1;
    	this.produtos.remove(indice);
    }

    public void listarProdutos() {
    	    	
    	for(Produto p : this.produtos) {
    		System.out.println(p.getNome());
    	
    	}
    	
    	
    	
    }

    public double calcularTotal() {
        double total = 0;
        
        for(Produto p: this.produtos) {
        	total += p.getPreco();
        }
    	return total;
    }

    public void finalizarCompra() {
    	System.out.println("Cupom Fiscal:");
    	System.out.println("--------");
    	for(Produto p : this.produtos) {
    		System.out.println(p);
    	}
    	double total = calcularTotal();
    	
    	System.out.printf("Total: R$ %.2f", total);
    	
    }
}

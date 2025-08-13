package model;


public class Produto {

	private String nome;
	private Double preco;
	

	
	public Produto() {
	
	}

//	public Produto(String nome, Double preco) {
//		this.nome = nome;
//		this.preco = preco;
//	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.isEmpty() || nome.isBlank()) {
			this.nome = "Produto desconhecido";
		} else {
			this.nome = nome;
		}
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		if(preco <= 0) {
			this.preco = 0.99;
		} else {
			this.preco = preco;
		}

		
	}

	@Override
	public String toString(){
		String dados = String.format("%s - Preço: R$ %.2f", 
				this.nome, this.preco);
		
		return dados;
	}
	
	
}

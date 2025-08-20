package model;

public class Contato {

	private String nome;
	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	@Override
	public String toString() {
		String dados = String.format("Nome: %s", nome);
		return dados;
	}
}

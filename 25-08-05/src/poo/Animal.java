package poo;

public class Animal {
	//atributo
	String nome;
	
	//metodo construtor com um parametro
	public Animal(String nome) {
		if(nome.length() < 2) {
			this.nome = "Catita";
		} else {
		this.nome = nome;
		}
	}
	
	
}

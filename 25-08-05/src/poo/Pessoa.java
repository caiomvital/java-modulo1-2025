package poo;

public class Pessoa {

	String nome;
	int idade;
	double peso;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		if(idade >= 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa() {}
	
	void fazerAniversario() {
		idade++;
		System.out.printf("%s fez aniversário! Agora tem %d anos.", nome, idade);
	}
	
}

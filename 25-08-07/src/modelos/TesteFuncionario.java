package modelos;

public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario tadeu = new Funcionario();
	tadeu.nome = "Tadeu";
	tadeu.cargo = "Analista de Anúncios do OLX";
	tadeu.salario = 5000;
	System.out.println("Salario de " + tadeu.nome + ": " + tadeu.salario);
	tadeu.aumentarSalario(10);
	System.out.println("Salario de " + tadeu.nome + ": " + tadeu.salario);
	tadeu.aumentarSalario(10);
	System.out.println("Salario de " + tadeu.nome + ": " + tadeu.salario);
	
}
}

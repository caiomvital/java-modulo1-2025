package modelos;

public class Funcionario {

	String nome;
	String cargo;
	double salario;
	
	void aumentarSalario(double porcentagem) {
		System.out.println(porcentagem + "%");
		porcentagem = porcentagem / 100;
		
		System.out.println("Porcentagem: " + "\"" + porcentagem + "\"");
		double aumento = salario * porcentagem;
		System.out.println("Aumento: " + aumento);
		
		salario += aumento;
	}
	
	
	
	
}

package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {

		
		
		String nome = "Tadeu";
	List<String> nomes = new ArrayList<>();
	nomes.add("Tadeu");
	nomes.add("Jurema");
	nomes.add("Gervásio");
	nomes.add("Jessica");
System.out.println(nomes);
	System.out.println("Tamanho da Lista: " + nomes.size());
	System.out.println(nomes);

	//create
	//.add()
	nomes.add("Anacleto");
	//read
	//.get()
	System.out.println(nomes.get(4));
	//update
	//.set()
	nomes.set(4, "Aristides");
	System.out.println(nomes.get(4));
	//delete
	//.remove()
	nomes.remove("Jessica");
	System.out.println(nomes);

	
	
	
	}
}

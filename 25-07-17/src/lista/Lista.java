package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		List<Integer> valores = new ArrayList<>();
		
		
		
		lista.add("Tadeu"); // 0
		lista.add("Gervásio"); // 1
		lista.add("Genésia"); // 2
		lista.add("Geraldo"); // 3
		lista.add("Aurelina"); // 4
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		lista.addFirst("Amadeu");
		System.out.println(lista);
		lista.add(2, "Genésia");
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		// decimal -> double
		// logico -> boolean
		// textual -> String
		
		
		
		

	}
}

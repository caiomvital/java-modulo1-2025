package poo;

public class TesteConta {
public static void main(String[] args) {
	
	Conta contaDeTadeu = new Conta();
	Conta contaDeJeruza = new Conta();
	
	contaDeTadeu.setSaldo(1000);
	contaDeJeruza.setSaldo(100);
	System.out.println(contaDeTadeu.getSaldo());
	
	
	
}
}

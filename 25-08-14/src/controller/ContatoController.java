package controller;

import java.util.ArrayList;
import java.util.List;

import model.Contato;

public class ContatoController {

	private List<Contato> contatos = new ArrayList<>();
	
	public Contato adicionarContato(String nome, String telefone) {
		Contato contato = new Contato(nome, telefone);
		return contato;
	}
	
	public List<Contato> listarContatos(){
		return contatos;
	}
	
	public Contato buscarPorId(int id) {
		for(Contato c : contatos) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
		/*return contatos
				.stream()
				.filter(c -> c.getId() == id)
				.findFirst()
				.orElse(null);
		 * 
		 * */
	
	}
	
	public boolean atualizarContato(int id, String nome, String telefone) {
		Contato contato = buscarPorId(id);
		
		if(contato != null) {
			contato.setNome(nome);
			contato.setTelefone(telefone);
			return true;
		}
		return false;
		
	}
	
	public boolean removerContato(int id) {
		return contatos.removeIf(contato -> contato.getId() == id);
	}
	
	
	
}

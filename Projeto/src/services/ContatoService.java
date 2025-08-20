package services;

import java.util.List;

import model.Contato;
import repository.ContatoRepository;

public class ContatoService {

	ContatoRepository repository;
		
	public ContatoService(ContatoRepository repository) {
		this.repository = repository;
		
	}
	
	//CREATE - CRIAR REGISTRO
	public void adicionarContato(String nome) {
		if(nome.length() >= 2) {
			Contato contato = new Contato(nome);
			repository.contatos.add(contato);
			
		} else {
			System.out.println("Nome inválido!");
		}
		
	
		
	}
	
	//READ ALL - LISTAR REGISTROS
	public List<Contato> listarContatos(){
		return repository.contatos;
	}
	
	//READ - LOCALIZA REGISTRO
	public Contato localizarContatoPorNome(String nome) {
		
		for(Contato contato : listarContatos()) {
			if(contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}
	
	//UPDATE - ATUALIZA REGISTRO
	public boolean atualizarContato(String nomeAntigo, String nomeNovo) {
		Contato contatoAntigo = localizarContatoPorNome(nomeAntigo);
		if(contatoAntigo != null) {
			Contato novoContato = new Contato(nomeNovo);
			repository.contatos.set(repository.contatos.indexOf(contatoAntigo), novoContato);
			return true;
		}
		return false;
	}
	
	public boolean removerContato(String nome) {
		Contato contato = localizarContatoPorNome(nome);
		if(contato != null) {
			repository.contatos.remove(contato);
			return true;
		}
		return false;
	}
	
}
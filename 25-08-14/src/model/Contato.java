package model;

import java.util.ArrayList;
import java.util.List;

public class Contato extends Entidade {
    private String nome;
    private String telefone;
    private List<Compromisso> compromissos = new ArrayList<>();

    public Contato(String nome, String telefone) {
        super(); // gera o ID automaticamente
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public List<Compromisso> getCompromissos() { return compromissos; }

    @Override
    public String exibirResumo() {
        return "Contato " + getId() + ": " + nome + " (" + telefone + ")";
    }
}


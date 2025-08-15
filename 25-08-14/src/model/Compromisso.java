package model;

public class Compromisso extends Entidade {
    private String descricao;
    private String dataHora;
    private Contato contato;

    public Compromisso(String descricao, String dataHora, Contato contato) {
        super(); // gera o ID automaticamente
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.contato = contato;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }

    public Contato getContato() { return contato; }
    public void setContato(Contato contato) { this.contato = contato; }

    @Override
    public String exibirResumo() {
        return "Compromisso " + getId() + ": " + descricao + " - " + dataHora +
               " [Contato: " + contato.getNome() + "]";
    }
}

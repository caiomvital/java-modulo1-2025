package model;

public abstract class Entidade {
    private static int contador = 1; 
    private int id;

    public Entidade() {
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    public abstract String exibirResumo();
}

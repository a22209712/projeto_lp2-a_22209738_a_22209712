package pt.ulusofona.lp2.deisichess;

public class Peca {
    int id;
    int tipo;
    int equipe;
    String nome;

    public Peca(int id, int tipo, int equipe, String nome) {
        this.id = id;
        this.tipo = tipo;
        this.equipe = equipe;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }

    public int getTipo() {
        return tipo;
    }

    public int getEquipe() {
        return equipe;
    }

    public String getNome() {
        return nome;
    }
}
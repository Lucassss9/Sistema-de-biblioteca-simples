package br.com.biblioteca.modelo;

public class Membro {

    private String nome;
    private int idMembro;

    public Membro(String nome, int idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
    }

    public String getNome() {
        return nome;
    }

    public int getIdMembro() {
        return idMembro;
    }
}

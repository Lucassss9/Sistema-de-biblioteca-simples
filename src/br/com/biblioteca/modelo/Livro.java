package br.com.biblioteca.modelo;

import java.util.Objects;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDeRegistro;

    public Livro(String titulo, String autor, int numeroDeRegistro) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return numeroDeRegistro == livro.numeroDeRegistro && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, numeroDeRegistro);
    }
}

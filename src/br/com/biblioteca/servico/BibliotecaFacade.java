package br.com.biblioteca.servico;

import br.com.biblioteca.modelo.Livro;
import br.com.biblioteca.modelo.Membro;

public class BibliotecaFacade {

    private RegistroEmprestimo registro = new RegistroEmprestimo();

    public void realizarEmprestimo(Livro livro, Membro membro) {
        registro.emprestarLivro(livro, membro);
    }

    public void realizarDevolucao(Livro livro, Membro membro) {
        registro.devolverLivro(livro,membro);
    }

    public void verificarLivro(Livro livro) {
        registro.verificarDisponibilidade(livro);
    }
}

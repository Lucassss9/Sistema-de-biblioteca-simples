package br.com.biblioteca.servico;

import br.com.biblioteca.modelo.Livro;
import br.com.biblioteca.modelo.Membro;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class RegistroEmprestimo {

    private Map<Livro, Membro> emprestimos = new HashMap<>();

    void emprestarLivro(Livro livro, Membro membro) {
        if (emprestimos.containsKey(livro)) {
            System.out.println("ERRO: O livro '" + livro.getTitulo() + "' já esta emprestado.");
        } else {
            emprestimos.put(livro, membro);
            System.out.println("SUCESSO: O livro '" + livro.getTitulo() + "' foi emprestado para " + membro.getNome() + ".");
        }
    }

    void devolverLivro(Livro livro, Membro membro) {
        if (emprestimos.remove(livro, membro)) {
            System.out.println("O livro " + livro.getTitulo() + " foi devolvido por " + membro.getNome() + ".");
        } else {
            System.out.println("ERRO: Você não pegou este livro emprestado.");
        }
    }

    void verificarDisponibilidade(Livro livro) {
        if(emprestimos.containsKey(livro)){
            System.out.println("Este livro esta emprestado");
        } else {
            System.out.println("Este livro esta livre para empréstimo.");
        }
    }
}

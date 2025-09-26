package br.com.biblioteca.principal;

import br.com.biblioteca.modelo.Livro;
import br.com.biblioteca.modelo.Membro;
import br.com.biblioteca.servico.BibliotecaFacade;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("INICIANDO SISTEMA DE TESTES DA BIBLIOTECA");
        System.out.println("==============================================");

        BibliotecaFacade biblioteca = new BibliotecaFacade();

        Livro livroJava = new Livro("Java Efetivo", "Joshua Bloch", 101);
        Livro livroPython = new Livro("Python Fluente", "Luciano Ramalho", 202);

        Membro membroJoao = new Membro("João Silva", 1);
        Membro membroMaria = new Membro("Maria Souza", 2);

        System.out.println("\n--- CENÁRIO 1: Empréstimo e devolução (João e o livro de Java) ---");
        System.out.println("Verificando o livro de Java antes de tudo...");
        biblioteca.verificarLivro(livroJava);

        System.out.println("\nJoão tenta pegar o livro de Java...");
        biblioteca.realizarEmprestimo(livroJava, membroJoao);

        System.out.println("\nVerificando o livro de Java novamente...");
        biblioteca.verificarLivro(livroJava);

        System.out.println("\nJoão devolve o livro de Java...");
        biblioteca.realizarDevolucao(livroJava, membroJoao);

        System.out.println("\nVerificando o livro de Java pela última vez...");
        biblioteca.verificarLivro(livroJava);

        System.out.println("\n--- CENÁRIO 2: Tentativa de empréstimo duplicado (Maria e João pelo livro de Python) ---");
        System.out.println("Maria pega o livro de Python...");
        biblioteca.realizarEmprestimo(livroPython, membroMaria);

        System.out.println("\nAgora, João tenta pegar o mesmo livro de Python que está com a Maria...");
        biblioteca.realizarEmprestimo(livroPython, membroJoao);

        System.out.println("\n--- CENÁRIO 3: Tentativas de devolução inválidas ---");
        System.out.println("Primeiro, João tenta devolver o livro de Java (que já está na prateleira)...");
        biblioteca.realizarDevolucao(livroJava, membroJoao);

        System.out.println("\nAgora, João tenta devolver o livro de Python (que está com a Maria)...");
        biblioteca.realizarDevolucao(livroPython, membroJoao);

        System.out.println("\n--- CENÁRIO 4: Devolução correta do livro de Python ---");
        System.out.println("Maria, a pessoa correta, devolve o livro de Python...");
        biblioteca.realizarDevolucao(livroPython, membroMaria);

        System.out.println("\n--- VERIFICAÇÃO FINAL: Todos os livros devem estar disponíveis ---");
        biblioteca.verificarLivro(livroJava);
        biblioteca.verificarLivro(livroPython);

        System.out.println("\n==============================================");
        System.out.println("FIM DOS TESTES DO SISTEMA");
        System.out.println("==============================================");
    }
}

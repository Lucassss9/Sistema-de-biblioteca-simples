# 📚 Sistema de Gerenciamento de Biblioteca em Java

Este é um projeto de console simples em **Java** que simula as operações básicas de um sistema de biblioteca, como **empréstimo, devolução e verificação de disponibilidade de livros**.  

O principal objetivo deste projeto foi colocar em prática conceitos fundamentais de **Programação Orientada a Objetos (OOP)** e **Padrões de Projeto**, criando um sistema coeso, encapsulado e bem estruturado.

---

## 🚀 Conceitos Praticados

- **Programação Orientada a Objetos (OOP)**: Criação de classes e objetos (`Livro`, `Membro`) que representam entidades do mundo real.  
- **Organização de Pacotes**: Estruturação do código em pacotes lógicos (`modelo`, `servico`, `principal`) para separar responsabilidades.  
- **Modificadores de Acesso**: Uso de `public`, `private` e `default` para controlar a visibilidade e garantir o encapsulamento.  
- **Padrão de Projeto - Facade**: Utilização da classe `BibliotecaFacade` como um ponto de acesso único e simplificado para o subsistema de serviços, escondendo a complexidade interna.  
- **Java Collections Framework**: Uso de `HashMap` para gerenciar o estado dos empréstimos de forma eficiente.  
- **Contrato `equals()` e `hashCode()`**: Implementação correta dos métodos para permitir que objetos customizados (`Livro`) sejam usados como chaves em um `HashMap`.  
- **Gerenciamento de Estado**: Lógica para manter o estado da aplicação de forma consistente entre as operações.  

---

## 📂 Estrutura do Projeto

```bash
biblioteca/
└── src/
    └── br/
        └── com/
            └── biblioteca/
                ├── modelo/
                │   ├── Livro.java
                │   └── Membro.java
                ├── principal/
                │   └── Main.java
                └── servico/
                    ├── BibliotecaFacade.java
                    └── RegistroEmprestimo.java

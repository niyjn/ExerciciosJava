package ExerciciosConstrutor.Desafio;

import java.util.ArrayList;
import java.util.Scanner;

/*Monte um programa que:
– Usa Scanner para ler os dados de vários livros.
– Armazena cada livro em uma classe Livro com
construtor.
– Guarda os livros em um ArrayList.
– No fim, imprime todos os livros cadastrados. */

class Nome {
    private final String nome;

    public Nome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Autor {
    private final String autor;

    public Autor(String autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser vazio.");
        }
        this.autor = autor;
    }

    @Override
    public String toString() {
        return autor;
    }
}

class Livro {
    private final Nome nome;
    private final Autor autor;

    Livro(Nome nome, Autor autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public void pegarInformacoes() {
        System.out.println("Nome: " + nome.toString() + " | Autor: " + autor.toString());
    }
}

class Biblioteca {

    private final ArrayList<Livro> livros = new ArrayList<>();

    public void retornarLista() {
        for (Livro livro : livros) {
            livro.pegarInformacoes();
        }
    }
    
    public void adicionarLivro(Livro livro) {
            livros.add(livro);
    }
}

class Input {

    Scanner scanner = new Scanner(System.in);

    public String lerEntrada(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public boolean continuarLoop(String entrada) {
        return entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("S");
    }

}

class LivroService {

    private final Biblioteca biblioteca;

    public LivroService(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Livro criarLivro(String nome, String autor) {
        Nome nomeObj = new Nome(nome);
        Autor autorObj = new Autor(autor);
        return new Livro(nomeObj, autorObj);
    }

    public void exibirInformacoes(Livro livro) {
        livro.pegarInformacoes();
    }

    public void adicionarLivro(Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    public void retornarLista() {
        biblioteca.retornarLista();
    }
}

public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        Biblioteca biblioteca = new Biblioteca();
        LivroService livroService = new LivroService(biblioteca);
        
        boolean continuar = true;

        while (continuar) {

        try {

            String entrada = input.lerEntrada("Digite o nome: ");
            String entrada2 = input.lerEntrada("Digite o autor: ");

            Livro livro = livroService.criarLivro(entrada, entrada2);
            livroService.adicionarLivro(livro);
            livroService.exibirInformacoes(livro);

        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        } 
    
            String resposta = input.lerEntrada("Deseja continuar? (s/n)");
            continuar = input.continuarLoop(resposta);

            livroService.retornarLista();

        }
    }
}

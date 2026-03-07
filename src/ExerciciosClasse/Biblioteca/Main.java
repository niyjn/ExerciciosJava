package ExerciciosClasse.Biblioteca;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Classe Biblioteca ---");

        // Teste 1: Operações Válidas
        try {
            System.out.println("Teste 1 (Válido): Criando um livro válido...");
            Autor autor = new Autor("Bernardo Kuster");
            Titulo titulo = new Titulo("A vida do bernardo");
            Ano ano = new Ano(2026);

            Livro livro = new Livro(titulo, ano, autor);
            livro.exibirDetalhes();
            System.out.println("Teste 1 concluído com sucesso.\n");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado no Teste 1: " + e.getMessage() + "\n");
        }

        // Teste 2: Autor Inválido
        try {
            System.out.println("Teste 2 (Inválido): Criando autor com nome vazio...");
            new Autor("");
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado erro esperado (Autor): " + e.getMessage() + "\n");
        }

        // Teste 3: Titulo Inválido
        try {
            System.out.println("Teste 3 (Inválido): Criando título vazio...");
            new Titulo(" ");
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado erro esperado (Titulo): " + e.getMessage() + "\n");
        }

        // Teste 4: Ano Inválido
        try {
            System.out.println("Teste 4 (Inválido): Criando ano negativo...");
            new Ano(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado erro esperado (Ano): " + e.getMessage() + "\n");
        }
    }
}
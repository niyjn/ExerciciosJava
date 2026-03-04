package ExerciciosPOO2.ProjetoLocadora;

import ExerciciosPOO2.ProjetoLocadora.model.*;
import ExerciciosPOO2.ProjetoLocadora.model.vo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE LOCADORA === ");

        // setup inicial de dados (value objects)
        Cliente cliente = new Cliente(new Nome("Moacir Guedes"), new ClienteID(101));
        Filme filme1 = new Filme(new Nome("Bernardo"));
        Filme filme2 = new Filme(new Nome("Bordoga"));

        // testando perfil do cliente
        cliente.imprimirPerfil();

        // testando guard clause: listar sem empréstimos
        System.out.println("\n--- Teste: cliente sem empréstimos ---");
        cliente.listarEmprestimos();

        // testando empréstimo bem-sucedido
        System.out.println("\n--- Teste: realizando empréstimo ---");
        try {
            filme1.alugar(); 
            cliente.adicionarEmprestimo(new Emprestimo(filme1, cliente));
            System.out.println("Filme alugado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

        // testando validação de disponibilidade (o erro planejado)
        System.out.println("\n--- Teste: tentando alugar filme já alugado ---");
        try {
            filme1.alugar(); 
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: o sistema impediu o aluguel: " + e.getMessage());
        }

        // testando múltiplos empréstimos e listagem
        System.out.println("\n --- Teste: listagem final de empréstimos ---");
        filme2.alugar();
        cliente.adicionarEmprestimo(new Emprestimo(filme2, cliente));
        cliente.listarEmprestimos();

        // testando devolução e status visual
        System.out.println("\n --- Teste: devolvendo um filme ---");
        filme1.devolver();
        System.out.println("Status após devolução:");
        filme1.exibirTitulo();
    }
}

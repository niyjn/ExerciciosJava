package ExerciciosClasse.Notas;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Classe Notas (Regra: Máximo 10) ---");

        // Teste 1: Operações Válidas
        try {
            System.out.println("Teste 1: Adicionando 5 e depois 3...");
            Nome nome = new Nome("Bernardo");
            Aluno aluno = new Aluno(nome);
            aluno.adicionarNota(5);
            aluno.adicionarNota(3);
            aluno.consultarNota(); // Deve ser 8
            System.out.println("Teste 1 concluído.\n");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // Teste 2: Ultrapassando o limite de 10
        try {
            System.out.println("Teste 2: Tentando somar 7 + 4 (deve falhar)...");
            Aluno aluno = new Aluno(new Nome("Carlos"));
            aluno.adicionarNota(7);
            aluno.adicionarNota(4); 
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado erro esperado: " + e.getMessage() + "\n");
        }

        // Teste 3: Retirar mais do que possui
        try {
            System.out.println("Teste 3: Retirando 5 de quem só tem 3...");
            Aluno aluno = new Aluno(new Nome("Julia"));
            aluno.adicionarNota(3);
            aluno.retirarNota(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado erro esperado: " + e.getMessage() + "\n");
        }
    }
}
package ExerciciosPOO2.Faculdade;

import ExerciciosPOO2.Faculdade.model.Curso;
import ExerciciosPOO2.Faculdade.model.Aluno;
import ExerciciosPOO2.Faculdade.model.Professor;
import ExerciciosPOO2.Faculdade.model.values.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE FLUXO NORMAL ===");
        
        try {
            // criando dados do curso
            NomeCurso nomeSoftware = new NomeCurso("Engenharia de Software");
            Periodo periodo = new Periodo("03-B");
            DadosCurso dados = new DadosCurso(nomeSoftware, periodo);
            
            // inicializando o curso
            Curso curso = new Curso(dados);

            // criando alunos (nomes e ras originais)
            Aluno aluno1 = new Aluno(new Nome("Bernardo"), nomeSoftware, new RegistroAcademico(69696));
            Aluno aluno2 = new Aluno(new Nome("Amigo"), nomeSoftware, new RegistroAcademico(67676));

            // criando professor (nome, siape e matéria originais)
            Professor professor1 = new Professor(new Nome("Dr. Moacir"), new CodigoSiape(54321), new Materia("Programação"));

            // adicionando à equipe do curso
            curso.adicionarAluno(aluno1);
            curso.adicionarAluno(aluno2);
            curso.adicionarProfessor(professor1);

            // imprimindo relatório completo
            curso.imprimirRelatorio();

        } catch (Exception e) {
            System.err.println("Erro inesperado no fluxo normal: " + e.getMessage());
        }

        System.out.println("\n=== TESTE DE INTEGRIDADE (VALIDAÇÕES) ===");

        // teste: ra negativo
        try {
            System.out.print("Testando RA negativo (-1)... ");
            new RegistroAcademico(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Certo! Erro capturado: " + e.getMessage());
        }

        // teste: nome vazio
        try {
            System.out.print("Testando Nome vazio (\"\")... ");
            new Nome("");
        } catch (IllegalArgumentException e) {
            System.out.println("Certo! Erro capturado: " + e.getMessage());
        }

        // teste: siape zero
        try {
            System.out.print("Testando SIAPE zero (0)... ");
            new CodigoSiape(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Certo! Erro capturado: " + e.getMessage());
        }
        
        System.out.println("\n=== FIM DOS TESTES ===");
    }
}

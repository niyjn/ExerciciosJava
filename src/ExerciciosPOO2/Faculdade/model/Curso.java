package ExerciciosPOO2.Faculdade.model;

import ExerciciosPOO2.Faculdade.model.values.DadosCurso;

public class Curso {
    private final DadosCurso dados;
    private final Equipe equipe;

    public Curso(DadosCurso dados) {
        this.dados = dados;
        this.equipe = new Equipe();
    }

    public void adicionarAluno(Aluno aluno) {
        equipe.adicionarAluno(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        equipe.adicionarProfessor(professor);
    }

    public void imprimirRelatorio() {
        System.out.println("--- RELATÓRIO DO CURSO: " + dados + " ---");
        equipe.listar();
    }
}

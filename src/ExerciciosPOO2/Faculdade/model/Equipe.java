package ExerciciosPOO2.Faculdade.model;

import ExerciciosPOO2.Faculdade.model.listas.ListaDeAlunos;
import ExerciciosPOO2.Faculdade.model.listas.ListaDeProfessores;

public class Equipe {
    private final ListaDeAlunos alunos;
    private final ListaDeProfessores professores;

    public Equipe() {
        this.alunos = new ListaDeAlunos();
        this.professores = new ListaDeProfessores();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.adicionar(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.adicionar(professor);
    }

    public void listar() {
        alunos.listar();
        professores.listar();
    }
}

package ExerciciosPOO2.Faculdade.model;

import ExerciciosPOO2.Faculdade.model.values.Nome;
import ExerciciosPOO2.Faculdade.model.values.NomeCurso;
import ExerciciosPOO2.Faculdade.model.values.RegistroAcademico;

public class Aluno {
    private final Nome nome;
    private final NomeCurso curso;
    private final RegistroAcademico ra;

    public Aluno(Nome nome, NomeCurso curso, RegistroAcademico ra) {
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
    }

    public void imprimirDados() {
        System.out.println("Aluno: " + nome + ", RA: " + ra + ", Curso: " + curso);
    }
}

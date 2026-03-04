package ExerciciosPOO2.Faculdade.model.listas;

import java.util.ArrayList;
import ExerciciosPOO2.Faculdade.model.Aluno;

public class ListaDeAlunos {
    private final ArrayList<Aluno> alunos;

    public ListaDeAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listar() {
        for (Aluno aluno : alunos) {
            aluno.imprimirDados();
        }
    }
}

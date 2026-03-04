package ExerciciosPOO2.Faculdade.model.listas;

import java.util.ArrayList;
import ExerciciosPOO2.Faculdade.model.Professor;

public class ListaDeProfessores {
    private final ArrayList<Professor> professores;

    public ListaDeProfessores() {
        this.professores = new ArrayList<>();
    }

    public void adicionar(Professor professor) {
        professores.add(professor);
    }

    public void listar() {
        for (Professor professor : professores) {
            professor.imprimirDados();
        }
    }
}

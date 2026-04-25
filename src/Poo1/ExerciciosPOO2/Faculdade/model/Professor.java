package ExerciciosPOO2.Faculdade.model;

import ExerciciosPOO2.Faculdade.model.values.Nome;
import ExerciciosPOO2.Faculdade.model.values.CodigoSiape;
import ExerciciosPOO2.Faculdade.model.values.Materia;

public class Professor {
    private final Nome nome;
    private final CodigoSiape siape;
    private final Materia materia;

    public Professor(Nome nome, CodigoSiape siape, Materia materia) {
        this.nome = nome;
        this.siape = siape;
        this.materia = materia;
    }

    public void imprimirDados() {
        System.out.println("Professor: " + nome + ", SIAPE: " + siape + ", Matéria: " + materia);
    }
}

package ExerciciosPOO2.Faculdade.model.values;

public class Materia {
    private final String valor;

    public Materia(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("A matéria não pode ser vazia.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}

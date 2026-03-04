package ExerciciosPOO2.Faculdade.model.values;

public class NomeCurso {
    private final String valor;

    public NomeCurso(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode ser vazio.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}

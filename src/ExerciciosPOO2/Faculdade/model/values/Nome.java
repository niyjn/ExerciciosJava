package ExerciciosPOO2.Faculdade.model.values;

public class Nome {
    private final String valor;

    public Nome(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}

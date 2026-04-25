package ExerciciosPOO2.Faculdade.model.values;

public class CodigoSiape {
    private final int valor;

    public CodigoSiape(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O SIAPE deve ser um inteiro positivo.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}

package ExerciciosPOO2.Faculdade.model.values;

public class RegistroAcademico {
    private final int valor;

    public RegistroAcademico(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O RA deve ser um inteiro positivo.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}

package ExerciciosClasse.Biblioteca;

public class Ano {
    private final int data;

    public Ano(int data) {
        if (data < 0) {
            throw new IllegalArgumentException("O ano não pode ser negativo.");
        }
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
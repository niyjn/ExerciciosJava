package ExerciciosClasse.Biblioteca;

public class Titulo {
    private final String texto;

    public Titulo(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
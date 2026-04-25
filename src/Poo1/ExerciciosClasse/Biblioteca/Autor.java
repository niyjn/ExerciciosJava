package ExerciciosClasse.Biblioteca;

public class Autor {
    private final String nome;

    public Autor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do autor não pode ser vazio.");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
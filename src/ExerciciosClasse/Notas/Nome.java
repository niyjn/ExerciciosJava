package ExerciciosClasse.Notas;

public class Nome {
    private final String texto;

    public Nome(String texto) {
        if(texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
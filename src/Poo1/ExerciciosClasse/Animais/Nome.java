package ExerciciosClasse.Animais;

public class Nome {
    private final String nome;

    public Nome(String nome) {
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
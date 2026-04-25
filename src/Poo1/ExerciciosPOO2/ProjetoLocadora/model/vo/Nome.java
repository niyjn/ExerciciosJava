package ExerciciosPOO2.ProjetoLocadora.model.vo;

public class Nome {
    private final String valor;

    public Nome(String valor) {
        if (valor == null) {
            throw new NullPointerException("O nome não pode ser vazio.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}

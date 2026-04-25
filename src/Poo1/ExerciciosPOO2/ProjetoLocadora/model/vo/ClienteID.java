package ExerciciosPOO2.ProjetoLocadora.model.vo;

public class ClienteID {
    private final int valor;

    public ClienteID (int valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}

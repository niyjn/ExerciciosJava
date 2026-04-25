package ExerciciosClasse.Notas;

public class Nota {
    private final int pontos;

    public Nota(int pontos) {
        if (pontos < 0 || pontos > 10) {
            throw new IllegalArgumentException("A nota total deve estar entre 0 e 10. Tentativa: " + pontos);
        }
        this.pontos = pontos;
    }

    public Nota somar(int valor) {
        return new Nota(this.pontos + valor);
    }

    public Nota subtrair(int valor) {
        return new Nota(this.pontos - valor);
    }

    @Override
    public String toString() {
        return String.valueOf(pontos);
    }
}
package ExerciciosClasse.Animais;

public class Especie {
    private final String especie;

    public Especie(String especie) {
        if(especie == null || especie.isEmpty()) {
            throw new IllegalArgumentException("Especie não pode ser vazia ou nula");
        }
        this.especie = especie;
    }

    @Override
    public String toString() {
        return especie;
    }
}
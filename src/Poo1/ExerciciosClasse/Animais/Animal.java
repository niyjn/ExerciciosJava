package ExerciciosClasse.Animais;

public class Animal {
    private Nome nome;
    private final Especie especie;

    public Animal(Nome nome, Especie especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void consultarInformacoes() {
        System.out.println("Nome: " + nome.toString());
        System.out.println("Especie: " + especie.toString());
    }

    public void mudarNome(Nome nome) {
        this.nome = nome;
    }
}
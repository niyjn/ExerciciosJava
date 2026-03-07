package ExerciciosClasse.Animais;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal(new Nome("Bordoga"), new Especie("Cachorro"));
        cachorro.consultarInformacoes();
        cachorro.mudarNome(new Nome("Rex"));
        System.out.println("\n--- Após mudar o nome ---");
        cachorro.consultarInformacoes();
    }
}
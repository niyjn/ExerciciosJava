package ExerciciosConstrutor;

import java.util.ArrayList;
import java.util.Random;

public class ListaRandom {
    public static void main(String[] args) {

        ArrayList<String> aleatorio = new ArrayList<>(4);
        Random gerador = new Random();

        aleatorio.add("Bernardo");
        aleatorio.add("Moacir");
        aleatorio.add("Leo");
        aleatorio.add("Gab");

        int numero = gerador.nextInt(aleatorio.size());
        String nomeRandom = aleatorio.get(numero);
        System.out.println("Nome sorteado: " + nomeRandom);

    }
}

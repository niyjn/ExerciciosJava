package ExerciciosVetor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Crie um vetor de inteiros já preenchido. Peça para o
usuário digitar um número e verifique se esse
número existe no vetor, imprimindo "Encontrado" ou
"Não encontrado".*/

public class VetorCheio {
    public static void main(String[] args) {

        Scanner sfc = new Scanner(System.in);
        var val = -1;
        ArrayList<Integer> vetor = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) vetor.add(i);

        System.out.println("Digite um número para ver se está na lista, dica: ");

        for(var bernardo : vetor) {
            System.out.print(vetor.get(bernardo) + " ");
        }

        System.out.println("");

        try {
            val = sfc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nao é um valor.");
            sfc.nextLine();
            val = sfc.nextInt();
        } //nota: so pode errar uma vez, se errar 2 o programa explode, nao quis fazer loop

        if((vetor.contains(val))) {
            System.out.println("O valor " + val + " está contido.");
        } else {
            System.out.println("O valor " + val + " não está contido.");
        }



    }
}

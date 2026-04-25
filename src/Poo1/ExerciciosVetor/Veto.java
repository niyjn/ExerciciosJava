package ExerciciosVetor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Veto {
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da pirâmide:");
        Scanner sc = new Scanner(System.in);
        piramide(lerInteiro(sc));
    }

    private static void piramide(int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int lerInteiro(Scanner sc) {
        int valor;
        try {
            valor = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            sc.nextLine();
            valor = lerInteiro(sc);
        }
        return valor;
    }
}


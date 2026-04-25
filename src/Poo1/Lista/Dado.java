package Lista;

import java.util.Scanner;

public class Dado {
    private int valor;
    private int VALORMAXIMO = 6;
    private int VALORMINIMO = 1;

    public Dado() {
        valor = (int) (Math.random() * (VALORMAXIMO - VALORMINIMO + 1)) + VALORMINIMO;
    }

    public int rolar() {
        return valor;
    }

    static void main() {

        System.out.println("---JOGO DE DADOS---");

        int opc;
        Scanner sc = new Scanner(System.in);

        while(true) {

            Dado dado1 = new Dado();
            Dado dado2 = new Dado();

            int sum = Rolagem(dado1, dado2);

            imprimir(dado1, dado2, sum);

            if(resultado(sum)) {;
                break;
            }

            System.out.println("Deseja jogar novamente? (1-sim, 2-nao)");

            opc = sc.nextInt();

            if(opc == 2) {
                break;
            }
        }
    }

    private static void imprimir(Dado dado1, Dado dado2, int sum) {
        System.out.println("Dado 1: " + dado1.rolar());
        System.out.println("Dado 2: " + dado2.rolar());
        System.out.println("Soma: " + sum);
    }

    private static int Rolagem(Dado dado1, Dado dado2) {
        int sum = dado1.rolar() + dado2.rolar();
        return sum;
    }

    private static boolean resultado(int sum) {
        if(sum == 7 || sum == 11) {
            System.out.println("Ganhou!");
            return true;
        }

        if(sum == 2 || sum == 3 || sum == 12) {
            System.out.println("Perdeu!");
            return false;
        }

        if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
            System.out.println("Tente novamente.");
            return false;
        }

        return false;
    }
}

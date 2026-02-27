package ExerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;

/*Crie um programa que armazene as notas de 3
alunos em um vetor e exiba a média da turma.*/

public class Nota {

    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<>(3);
        Scanner sfc = new Scanner(System.in);

        pegarNotas(notas, sfc);

        exibir(notas);

        somar(notas);

    }

    private static void pegarNotas(ArrayList<Integer> notas, Scanner sfc) {
        System.out.println("Digite 3 notas: ");
        for(int i = 0; i < 3; i++) {
            notas.add(sfc.nextInt());
        }
    }

    private static void exibir(ArrayList<Integer> notas) {
        for(int i = 0; i < 3; i++) {
            System.out.println("Nota do aluno " + (i+1) + ": " + notas.get(i));
        }
        System.out.println("");
    }

    private static void somar(ArrayList<Integer> notas) {
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += notas.get(i);
        }
        System.out.println("Média: " + sum);
    }

}

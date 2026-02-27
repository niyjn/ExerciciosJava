package ExerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;

/*Crie um vetor com 10 números inteiros. Percorra o
vetor e exiba a quantidade de números pares e a
quantidade de números ímpares (Use if com o
operador %).*/

public class ParImpar {
    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) vetor.add(i);

        var par = 0;
        var impar = 0;

        for(var bernardo : vetor) {

            if(!(vetor.get(bernardo) % 2 == 0)) {
                impar++;
                continue;
            }
                par++;

        }

        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);
    }

}


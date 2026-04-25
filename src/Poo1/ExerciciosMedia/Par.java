package ExerciciosMedia;

import java.util.Scanner;

public class Par {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.println("DIGITE UM NUMERO RAPIDO: ");

    Integer numero = 0;

    numero = s.nextInt();

    if(numero % 2 == 0) {
        System.out.println("o numero é par");
    } else {
        System.out.println("O numero é impar");
    }
    }
}

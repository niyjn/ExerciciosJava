package ExerciciosMedia;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Double val1 = 0.0;
        Double val2 = 0.0;
        char uni;

        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        val1 = read.nextDouble();

        System.out.println("Escolha a operacao(+, -, * ou /): ");
        uni = read.next().charAt(0);
        
        switch (uni) {
            case '+':
                System.out.println("Digite o segundo valor: ");
                val2 = read.nextDouble();

                System.out.println(val1 + val2);
                break;

            case '-':
                System.out.println("Digite o segundo valor: ");
                val2 = read.nextDouble();

                System.out.println(val1 - val2);
                break;

            case '*':
                System.out.println("Digite o segundo valor: ");
                val2 = read.nextDouble();

                System.out.println(val1 * val2);
                break;

            case '/':
                System.out.println("Digite o segundo valor: ");
                val2 = read.nextDouble();

                if (val1 == 0) {
                    System.out.println("nao pode dividir por 0");
                    break;
                } else {
                    System.out.println(val1 / val2);
                    break;
                }
            default:
                System.out.println("que operacao é essa irmao wtf");
                break;
        }

        read.close();

    }
}

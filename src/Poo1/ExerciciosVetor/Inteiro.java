package ExerciciosVetor;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

class Vetor {
    
    private ArrayList<Integer> valores = new ArrayList<>();
    
    public void adicionar(int n) {
        this.valores.add(n);
    }
    
    public void exibirSoma() {
        int sum = 0;
        for(int n : valores) sum += n;
        System.out.println("Soma: " + sum);   
    }
    
    public void acharMaior() {
        int maior = valores.get(0);
        
        for(int i = 1; i < valores.size(); i++) {
            int temp = valores.get(i);
            if (temp > maior) maior = temp;
        }
        
        System.out.println("Maior numero: " + maior);
    }
}

public class Inteiro {
    
    /*Crie um programa que leia 5 números inteiros,
armazene-os em um vetor e, ao final, mostre a soma
total e qual foi o maior número digitado.*/

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor();
        Scanner sfc = new Scanner(System.in);
        System.out.println("Digite 5 números separados por espaço.");
        
        for(int i = 0; i < 5; i++) {
            boolean userBurro = false;
            
            while(!userBurro) {
                
            try{
            vetor.adicionar(sfc.nextInt()); 
            userBurro = true;
            } catch (Exception e) {
                System.out.println("A entrada deve ser um inteiro.");
                sfc.nextLine();
                }
            }            
        }
        
        vetor.exibirSoma();
        vetor.acharMaior();
    }


}

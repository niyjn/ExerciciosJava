package ExerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;

/*Crie um vetor com 10 números inteiros. Percorra o
vetor e exiba a quantidade de números pares e a
quantidade de números ímpares (Use if com o
operador %).*/

class ModuloDe2 {
    
    private final ArrayList<Integer> vetor = new ArrayList<>();
    
    public void inserir(int n) {
        this.vetor.add(n);
    }
    
    public void parOuImpar() {
        
        int par = 0;
        int impar = 0;
        
        for(int n : vetor) {
            if(!(n % 2 == 0)) {
                impar++;
                continue;
            } 
            par++;
        }
        
        System.out.println("Numero de impares: " + impar + "\nNumero de pares: " + par);
    }
    
}

public class ParImpar {
    public static void main(String[] args) {

        ModuloDe2 conjunto = new ModuloDe2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros: ");
        
        for(int i = 0; i < 10; i++) {
            boolean burro = false;
            
            while(!burro) {
                
                try{
                    conjunto.inserir(scanner.nextInt());    
                    burro = true;
                } catch (Exception e) {
                    System.out.println("Erro. Entrada Invalida.");
                    scanner.nextLine();
                }
            }
        }
        
        conjunto.parOuImpar();
    }

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Double peso = 0.0;
        Double altura = 0.0;
        Double imc = 0.0;

        boolean piaEsperto = false;
        
        Scanner sfc = new Scanner(System.in);
        
        System.out.println("Digite seu peso bernardo: ");
        
        
        while(piaEsperto != true) { 
        
            try {
                
                peso = sfc.nextDouble();
                piaEsperto = true;

            } catch(InputMismatchException e) {
            System.out.println("Parabens por digitar errado pqp ");
            sfc.nextLine();
        }  
    }

        System.out.println("Digite a altura do bernardo em METROS NAO PODE SER EM CM (PODE: 1,8 NAO PODE: 180): ");

        piaEsperto = false;
        while(piaEsperto != true) {
            
            try {
                altura = sfc.nextDouble();
                
                piaEsperto = true;
            } catch(InputMismatchException e) {
                System.out.println("parabens por digitar errado kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
                sfc.nextLine();
            }
        }
        
        imc = (peso/(altura*altura));

        System.out.printf("O imc do bernardo é: %.1f%n", imc);

        sfc.close();

    }
}

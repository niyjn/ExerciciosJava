package ExerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

/*Crie um programa que armazene as notas de 3
alunos em um vetor e exiba a média da turma.*/

public class Nota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoteDeValores lote = new LoteDeValores();
        
        System.out.println("Digite 3 notas: ");
        
        while(lote.temEspaco()) {
            try {   
                double notaLida = scanner.nextDouble();
                lote.adicionar(new Valor(notaLida));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
            } catch (Exception e) {
                System.out.println("Entrada invalida.");
                scanner.nextLine();
            } 
            
        }
        
        Media mediaTurma = new Media(lote);
        System.out.println("Media final: " + mediaTurma.calcular());
        
    }

}

class Valor {
    private final double valor;
    
    public Valor(double valor) {
        if (valor < 0 || valor > 10) throw new IllegalArgumentException("A nota deve estar no intervalo de 0 a 10.");
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
}

class LoteDeValores {
    private final List<Valor> valores = new ArrayList<>();
    private static final int limite = 3;
    
    public void adicionar(Valor valor) {
        if(!temEspaco()) {
            throw new IllegalArgumentException("Todas as notas ja foram passadas.");
        }
        this.valores.add(valor);
    }
    
    public List<Valor> getTodas() {
        return Collections.unmodifiableList(valores);
    }
    
    public boolean temEspaco() {
        return  valores.size() < limite;
    }
}

class Media {
    
    private final LoteDeValores lote;
    
    public Media(LoteDeValores lote) {
        this.lote = lote;
    }
    
    public double calcular() {
        double total = 0;
        
        List<Valor> todasAsNotas = lote.getTodas();
        
        for(Valor nota : todasAsNotas) {
            total += nota.getValor();
        }
        
        if (todasAsNotas.isEmpty()) return 0;
        
        return total / todasAsNotas.size();
    }
    
}

package ExerciciosConstrutor;

public class Produto {
    private final String nome;
    private final int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        if(preco < 0) {
            System.out.println("O  valor nao pode ser negativo.");
            preco = 0; 
        }
        this.preco = preco;
    }

    public Produto() {
        this("Bernardo", 10);
    }

}
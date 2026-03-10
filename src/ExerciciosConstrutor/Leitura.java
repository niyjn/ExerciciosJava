package ExerciciosConstrutor;

import java.util.Scanner;

/*Crie a classe Pessoa com atributos nome e idade.
• No main, use o Scanner para ler esses dados do
teclado.
• Instancie um objeto da classe Pessoa com os dados
lidos. */

class Pessoa {
    private final int idade;
    private final String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void getNome() {
        System.out.println("Nome: " + nome);
    }

    public void getIdade() {
        System.out.println("Idade: " + idade);
    }
}

public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int valor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        Pessoa bernardo = new Pessoa(valor, nome);

        System.out.println("Pessoa criada com sucesso. ");
        bernardo.getIdade();
        bernardo.getNome();

    }
}

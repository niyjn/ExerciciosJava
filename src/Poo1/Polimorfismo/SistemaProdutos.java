package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
/*• Criar classe Produto com nome, preço e quantidade.
• Sobrescrever toString() para mostrar "Produto:
Nome (Qnt) - Preço".
• Criar lista de produtos e imprimir. */
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isEmpty() || preco < 0 || quantidade < 0) {
            throw new IllegalArgumentException("Argumentos invalidos.");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s (%d) - R$ %.2f", nome, quantidade, preco);
    }
}

public class SistemaProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado Mechanical", 250.00, 10));
        produtos.add(new Produto("Mouse Gamer", 120.50, 5));
        produtos.add(new Produto("Monitor 144hz", 1200.00, 2));

        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
    }
}
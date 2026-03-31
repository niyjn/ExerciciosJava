package Lista2;

import java.util.ArrayList;
import java.util.List;

class item {
    private String nome;
    private double preco;

    public item(String nome, double preco) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome inválido.");
        if (preco < 0) throw new IllegalArgumentException("Preço inválido.");
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item: " + this.nome + " | R$ " + this.preco;
    }
}

public class CarrinhoCompras {
    public static void main() {
        List<item> mercado = new ArrayList<>();
        mercado.add(new item("bernardo", 30.50));
        mercado.add(new item("moacir", 10.00));
        mercado.add(new item("pedro", 5.00));

        for (item i : mercado) {
            System.out.println(i);
        }
    }
}

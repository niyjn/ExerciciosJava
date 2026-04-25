class Estoque {
    private String nome;
    private Double precoCusto;
    private Double precoVenda;
    private int qtdEstoque;

    public Estoque(String nome, Double precoCusto, Double precoVenda, int qtdEstoque) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public Double lucroPresumido() {
        return (precoVenda - precoCusto) * qtdEstoque;
    }

    public void vender(int qtd) {
        if (qtd > qtdEstoque)
            System.out.println("Estoque insuficiente.");
        qtdEstoque -= qtd;
    }

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Bernardo", 100.0, 150.0, 10);

        estoque.lucroPresumido();

        estoque.vender(1);
        System.out.println("Venda realizada!");
        estoque.vender(10);

    }
}

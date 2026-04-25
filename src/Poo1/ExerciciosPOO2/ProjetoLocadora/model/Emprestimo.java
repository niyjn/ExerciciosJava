package ExerciciosPOO2.ProjetoLocadora.model;

public class Emprestimo {
    private Filme filme;
    private Cliente cliente;

    public Emprestimo(Filme filme, Cliente cliente) {
        this.filme = filme;
        this.cliente = cliente;
    }

    public void exibirDetalhes() {
        filme.exibirTitulo();
    }
}

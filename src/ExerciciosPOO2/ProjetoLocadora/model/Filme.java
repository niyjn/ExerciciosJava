package ExerciciosPOO2.ProjetoLocadora.model;

import ExerciciosPOO2.ProjetoLocadora.model.vo.*;

public class Filme {
    private Nome nome;
    private Disponibilidade disponibilidade;

    public Filme(Nome nome) {
        this.nome = nome;
        this.disponibilidade = new Disponibilidade();
    }

    public void exibirTitulo() {
        System.out.println(disponibilidade + " | Filme: " + nome);
    }

    public void alugar() {
        disponibilidade.registrarEmprestimo();
    }

    public void devolver() {
        disponibilidade.registrarDevolucao();
    }
}

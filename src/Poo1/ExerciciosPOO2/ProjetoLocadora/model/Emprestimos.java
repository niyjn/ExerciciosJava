package ExerciciosPOO2.ProjetoLocadora.model;

import ExerciciosPOO2.ProjetoLocadora.model.vo.*;
import java.util.*;

public class Emprestimos {
    private final List<Emprestimo> lista;

    public Emprestimos() {
        this.lista = new ArrayList<>();
    }

    public void adicionar(Emprestimo emprestimo) {
        this.lista.add(emprestimo);
    }

    public void ListarPara(Nome nome) {
        if(lista.isEmpty()) {
            System.out.println(nome + " Não possui emprestimos.");
            return;
        }

        imprimirItens(nome);
    }

    private void imprimirItens(Nome nome) {
        System.out.println("Emprestimo de " + nome + ": ");
        for (Emprestimo emprestimo : lista) {
            emprestimo.exibirDetalhes();
        }
    }
}

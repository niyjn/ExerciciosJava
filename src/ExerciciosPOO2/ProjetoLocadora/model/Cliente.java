package ExerciciosPOO2.ProjetoLocadora.model;

import ExerciciosPOO2.ProjetoLocadora.model.vo.*;

public class Cliente {
    private Nome nome;
    private ClienteID id;
    private Emprestimos emprestimos;

    public Cliente(Nome nome, ClienteID id) {
        this.nome = nome;
        this.id = id;
        this.emprestimos = new Emprestimos();
    }

    public void imprimirPerfil() {
        System.out.println("ID: " + id + " | Cliente: " + nome);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.adicionar(emprestimo);
    }

    public void listarEmprestimos() {
        emprestimos.ListarPara(this.nome);
    }
}

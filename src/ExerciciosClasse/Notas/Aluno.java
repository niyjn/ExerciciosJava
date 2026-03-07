package ExerciciosClasse.Notas;

public class Aluno {
    private final Nome nome;
    private Nota saldo;

    public Aluno(Nome nome) {
        this.nome = nome;
        this.saldo = new Nota(0);
    }

    public void adicionarNota(int pontos) {
        if (pontos <= 0) {
            throw new IllegalArgumentException("O valor a adicionar deve ser positivo.");
        }
        this.saldo = this.saldo.somar(pontos);
    }

    public void retirarNota(int pontos) {
        this.saldo = this.saldo.subtrair(pontos);
    }

    public void consultarNota() {
        System.out.println("Aluno: " + nome + " | Saldo: " + saldo);
    }
}
package ExerciciosPOO2.ProjetoLocadora.model.vo;

public class Disponibilidade {
    private boolean status;

    public Disponibilidade() {
        this.status = true;
    }

    public void registrarEmprestimo() {
        if(!status) {
            throw new IllegalArgumentException("Filme já alugado.");
        }
        this.status = false;
    }

    public void registrarDevolucao() {
        this.status = true;
    }

    @Override
    public String toString() {
        return status ? "[ ] Disponível" : "[X] Alugado";
    }
}

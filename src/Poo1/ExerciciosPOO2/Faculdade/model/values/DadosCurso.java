package ExerciciosPOO2.Faculdade.model.values;

public class DadosCurso {
    private final NomeCurso nome;
    private final Periodo periodo;

    public DadosCurso(NomeCurso nome, Periodo periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return nome + " (" + periodo + ")";
    }
}

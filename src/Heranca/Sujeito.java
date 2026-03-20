import java.util.HashSet;
import java.util.Set;

abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        if (nome == null || nome.isEmpty())
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        this.nome = nome;
    }

    public abstract String getNome();

    @Override
    public String toString() {
        return String.format("Nome: %s", nome);
    }
}

class Aluno extends Pessoa {
    private Matricula matricula;

    public Aluno(String nome, Matricula matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Matricula: %s", nome, matricula.NomeDaMatricula());
    }

}

class Matricula {
    private final int matricula;

    public Matricula(int numeroMatricula, RegistroDeMatriculas matriculas) {

        if (numeroMatricula <= 0 || matriculas.contem(numeroMatricula)) {
            throw new IllegalArgumentException("Número de matricula inválido.");
        }
        this.matricula = numeroMatricula;
        matriculas.adicionar(numeroMatricula);

    }

    public String NomeDaMatricula() {
        return String.valueOf(matricula);
    }
}

class RegistroDeMatriculas {
    private final Set<Integer> matriculas = new HashSet<>();

    public boolean contem(int id) {
        return matriculas.contains(id) ? true : false;
    }

    public void adicionar(int id) {
        matriculas.add(id);
    }

}

public class Sujeito {
    public static void main(String[] args) {

        RegistroDeMatriculas registroGeral = new RegistroDeMatriculas();

        try {

            Pessoa[] p = {
                    new Aluno("Bernardo", new Matricula(10101, registroGeral)),
                    new Aluno("Pedro", new Matricula(10102, registroGeral)),
                    new Aluno("Amigo", new Matricula(10103, registroGeral)),
                    new Aluno("Matheus", new Matricula(10102, registroGeral))
            };

            for (Pessoa a : p) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

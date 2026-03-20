class Funcionario {
    protected String nome;
    protected int SalarioCentavos;

    public Funcionario(String nome, int SalarioCentavos) {
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do pia não pode ser nulo.");
        }

        if(SalarioCentavos <= 0 ) {
            throw new IllegalArgumentException("O salario não pode ser nulo.");
        }

        this.nome = nome;
        this.SalarioCentavos = SalarioCentavos;
    }

    public void NomeDoFuncionario() {
        System.out.println("Nome: " + nome);
    }

    public void SalarioDoFuncionario() {
        System.out.println("Salario: R$ " + (SalarioCentavos/100.0));
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, int SalarioCentavos, String setor) {
        
        super(nome, SalarioCentavos);

        if(setor == null || setor.isEmpty()) {
            throw new IllegalArgumentException("O setor não pode ser nulo.");
        }

        this.setor = setor;
    }

    public void SetorDaGerencia() {
        System.out.println("Setor: " + setor);
    }
}

public class Empresa {
    public static void main(String[] args) {
        
        Gerente bernardo = new Gerente("Bernardo", 500000, "ti");
        
        bernardo.NomeDoFuncionario();
        bernardo.SalarioDoFuncionario();
        bernardo.SetorDaGerencia();

    }

}
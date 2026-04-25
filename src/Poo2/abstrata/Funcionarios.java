package Poo2.abstrata;

abstract class Funcionario {
    private String nome;
    private int salarioCents;  // Sempre armazenar em centavos (int)

    protected Funcionario(String nome, int salarioReais) {
        this.nome = nome;
        this.salarioCents = salarioReais * 100;  // Converte para centavos
    }

    public int calcularSalario() {
        return salarioCents;  // Retorna em centavos diretamente
    }

    public String getCargo(){return "";}

    public String getSalarioFormatado() {
        int reais = calcularSalario() / 100;
        int centavos = calcularSalario() % 100;
        return String.format("R$ %d,%02d", reais, Math.abs(centavos));
    }
}

class gerente extends Funcionario {
    public gerente(String nome, int salarioCents) {
        super(nome, salarioCents);
    }

    @Override
    public int calcularSalario() {
        return super.calcularSalario() + 150000;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }

}

class vendedor extends Funcionario {
    public vendedor(String nome, int salarioCents) {
        super(nome, salarioCents);
    }

    @Override
    public int calcularSalario() {
        return super.calcularSalario() + 50000;
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }
}

public class Funcionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new gerente("João", 5000);
        funcionarios[1] = new vendedor("Maria", 1500);

        for(Funcionario funcionario : funcionarios){
           System.out.println("Cargo: " + funcionario.getCargo());
           System.out.println("Salário: " + funcionario.getSalarioFormatado());
        }
    }
}

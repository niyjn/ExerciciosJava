class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public int getIdade() { return idade; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
}

class Conta {
    private String agencia;
    private int numero;
    private double saldo;
    private Cliente titular; 

    public Conta(String agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0; 
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public void exibirExtrato() {
        System.out.println("\n--- EXTRATO BANCÁRIO ---");
        System.out.println("Titular: " + titular.getNome() + " (CPF: " + titular.getCpf() + ")");
        System.out.println("Agência: " + agencia + " | Conta: " + numero);
        System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
    }
}

public class SistemaBancoConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Moacir Guedes", "123.456.789-00", 28);
        Conta conta1 = new Conta("001", 12345, cliente1);

        conta1.depositar(1000.00);
        conta1.sacar(200.00);
        conta1.exibirExtrato();
    }
}

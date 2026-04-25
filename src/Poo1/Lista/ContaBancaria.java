package Lista;

class ContaBancaria {

    private Double saldo;
    private Double limite;
    private Double chequeEspecial;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
        this.limite = 0.0;
        this.chequeEspecial = 0.0;
    }

    public void depositar(Double saldo) {
        this.saldo += saldo;
    }

    public void sacar(Double valor) {
        if (valor >= this.saldo) {
            Double temp = valor - this.saldo;
            this.saldo = 0.0;
            this.chequeEspecial += temp;
        }
        this.saldo -= valor;
    }

    public boolean usaChequeEspecial() {
        return chequeEspecial != 0.0;
    }

    public void exibirChequeEspecial() {
        System.out.println("Cheque especial: " + chequeEspecial);
    }

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(0.0);

        conta.depositar(1000.0);

        conta.sacar(1100.0);

        if (conta.usaChequeEspecial()) {
            conta.exibirChequeEspecial();
        }

    }
}

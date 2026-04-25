class Termometro {
    private Double temperaturaAtual;

    public Termometro() {
        this.temperaturaAtual = 0.0;
    }

    public void aumentarValor(Double valor) {
        if (!(valor == null))
            this.temperaturaAtual += valor;
    }

    public void diminuirTemp(Double valor) {
        if (!(valor == null))
            this.temperaturaAtual -= valor;
    }

    public Double exibirFahrenheit() {
        return (this.temperaturaAtual * 1.8 + 32);
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.aumentarValor(10.0);
        termometro.diminuirTemp(5.0);
        System.out.println("Temperatura em fahrenheit: " + termometro.exibirFahrenheit());
    }
}

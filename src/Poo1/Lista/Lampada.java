class Lampada {
    private int potencia;
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
        this.potencia = 0;
    }

    public void ligar() {
        this.ligada = true;
        this.potencia = 100;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void meiaLuz() {
        if (this.ligada) {
            this.potencia = 50;
        }
    }

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.ligar();
        System.out.println("Potência: " + lampada.potencia); // Potência: 100
        lampada.meiaLuz();
        System.out.println("Potência: " + lampada.potencia); // Potência: 50
        lampada.desligar();
        System.out.println("Ligada: " + lampada.ligada); // Ligada: false
    }
}
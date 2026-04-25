package Poo2.abstrata;

abstract class Veiculo {
    private String marca;
    private String modelo;

    protected Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){}
    public void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

class Carro extends Veiculo{

    Carro(String marca, String modelo) {
       super(marca, modelo);
    }

    public void acelerar(){
        System.out.println("Vrum Vrum");
    }
    public void exibirDados(){}
}

class Moto  extends Veiculo{
    Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar(){
        System.out.println("Vrau");
    }
    public void exibirDados(){}
}

public class Veiculos {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro("Fiat", "Uno");
        veiculos[1] = new Moto("Honda", "CB500");

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
            veiculo.exibirDados();
        }
    }
}

package Polimorfismo;

/*• Criar classe Veiculo com método mover().
• Criar Carro e Bicicleta sobrescrevendo mover().
• Criar método que recebe Veiculo e chama mover().
• Testar passando diferentes objetos. */

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        if(marca == null || modelo == null || ano == 0 || marca.isEmpty() || modelo.isEmpty()) {
            throw new IllegalArgumentException("Argumentos invalidos.");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void mover() {};

    @Override
    public String toString() {
        return String.format(" Marca: %s | Modelo: %s | Ano: %d", marca, modelo, ano);
    }
}

class Carro  extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("O carro de" + super.toString() +  " está se movendo.");
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta de" + super.toString() +  " está se movendo.");
    }
}

public class Carrinho {
    static void main() {
        Veiculo veiculos[] = {
                new Carro("Toyota", "Corolla", 2020),
                new Bicicleta("Caloi", "Mountain Bike", 2019)
        };

        for(Veiculo v : veiculos) {
            v.mover();
        }
    }
}

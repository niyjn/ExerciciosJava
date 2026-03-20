package Polimorfismo;

/*Criar classe Forma com método area().
• Criar Retangulo e Circulo sobrescrevendo area().
• Criar uma lista de Forma com vários objetos e somar
as áreas. */

abstract class Polimorfismo {
    private String nome;

    public Polimorfismo(String nome) {
        if(nome == null && nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }

        this.nome = nome;
    }

    public Double calcularArea() {return 0.0;}

    @Override
    public String toString() {
        return "Forma: " + nome + "\nArea: " + calcularArea();
    }
}

class Circulo extends Polimorfismo{
    private Double radio;

    public Circulo(String nome, Double radio) {
        super(nome);
        if(radio == 0) throw new IllegalArgumentException("Valor invalido.");
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Retangulo extends Polimorfismo{
    private Double base;
    private Double altura;

    public Retangulo(String nome, Double altura, Double largura) {
        super(nome);

        if(largura == 0) throw new IllegalArgumentException("Valor invalido.");
        if(altura == 0) throw new IllegalArgumentException("Valor invalido.");

        this.base = altura;
        this.altura = largura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }
}


//extra


class Triangulo extends Retangulo{
    private Double base;
    private Double altura;
    private String cor;

    public Triangulo(String nome, Double altura, Double largura, String cor) {
        super(nome, altura, largura);

        if(largura <= 0) throw new IllegalArgumentException("Valor invalido.");
        if(altura <= 0) throw new IllegalArgumentException("Valor invalido.");
        if(cor == null) throw new IllegalArgumentException("Valor invalido.");

        this.base = altura;
        this.cor = cor;
        this.altura = largura;
    }

    @Override
    public Double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCor: " + cor;
    }
}


public class Formas {
    public static void main() {
        Polimorfismo formas[] = {
                new Circulo("Circulo de Raio 1", 1.0),
                new Retangulo("Retangulo de altura 5 e base 10", 5.0, 10.0),
                new Triangulo("Triangulo de altura 5 e base 10", 5.0, 10.0, "Vermelho")
        };

        for(Polimorfismo p : formas) {
            System.out.println(p);
        }
    }

}

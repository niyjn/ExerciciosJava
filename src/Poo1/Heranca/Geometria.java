abstract class Forma {
    protected String cor;
    protected Boolean preenchido;

    public Forma(String cor, Boolean preenchido) {
        
        if(cor == null || cor.isEmpty()) throw new IllegalArgumentException("A cor não pode ser nula.");

        this.cor = cor;
        this.preenchido = preenchido;

    }

    public abstract Double calcularArea();

    public abstract String getNome();

    public String estaPreenchido() {
        return preenchido ? "Sim" : "Nao";
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Área: %.2f | Cor: %s | Preenchido: %s", getNome(), calcularArea(), cor, estaPreenchido());
    }
}

class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo(Double largura, Double altura, String cor, Boolean preenchido) {
        
        super(cor, preenchido);

        if(largura <= 0 ) throw new IllegalArgumentException("Nao pode ser nulo ou negativo.");
        
        if(altura <= 0 ) throw new IllegalArgumentException("Nao pode ser nulo ou negativo.");

        this.largura = largura;
        this.altura = altura;

        
    }

    @Override
    public Double calcularArea() {
        return (altura*largura);
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }
}

class Circulo extends Forma {
    private Double raio;

    public Circulo(Double raio, String cor, Boolean preenchido) {
        super(cor, preenchido);

        if(raio <= 0) throw new IllegalArgumentException("O raio não pode ser nulo.");

        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return  (3.14159 * (raio * raio));
    }

    @Override
    public String getNome() {
        return "circulo";
    }
}

public class Geometria {
    public static void main(String[] args) {
        
        Forma[] formas = {
            new Retangulo(10.0, 15.0, "Amarelo", true),
            new Circulo(5.0, "Verde", false)
        };

        for(Forma f : formas) {
            System.out.println(f);
        }
    }
}
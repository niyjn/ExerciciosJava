package Lista2;

abstract class passagem {
    protected double precoBase;

    public passagem(double precoBase) {
        if (precoBase < 0) throw new IllegalArgumentException("Preço base inválido.");
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
}

class economica extends passagem {
    public economica(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 1.10;
    }
}

class executiva extends passagem {
    public executiva(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 1.50;
    }
}

class primeiraClasse extends passagem {
    public primeiraClasse(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 2;
    }
}

public class PassagensAereas {
    public static void main() {
        passagem passagens[] = {
                new economica(1000),
                new executiva(1000),
                new primeiraClasse(1000)
        };

        for (passagem p : passagens) {
            System.out.println("Preço final da passagem: R$ " + p.calcularPrecoFinal());
        }
    }
}

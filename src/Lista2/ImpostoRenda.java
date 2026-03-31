package Lista2;

import java.util.ArrayList;
import java.util.List;

abstract class contribuinte {
    protected double rendaBruta;

    public contribuinte(double rendaBruta) {
        if (rendaBruta < 0) throw new IllegalArgumentException("Renda inválida.");
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();
}

class pessoaFisica extends contribuinte {
    public pessoaFisica(double rendaBruta) {
        super(rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return this.rendaBruta * 0.15;
    }
}

class pessoaJuridica extends contribuinte {
    public pessoaJuridica(double rendaBruta) {
        super(rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return this.rendaBruta * 0.10;
    }
}

public class ImpostoRenda {
    public static void main() {
        List<contribuinte> contribuintes = new ArrayList<>();
        contribuintes.add(new pessoaFisica(5000));
        contribuintes.add(new pessoaJuridica(10000));
        contribuintes.add(new pessoaFisica(3000));

        double totalImposto = 0;
        for (contribuinte c : contribuintes) {
            totalImposto += c.calcularImposto();
        }

        System.out.println("Total de imposto arrecadado: R$ " + totalImposto);
    }
}

package Lista2;

abstract class operacao {
    public double executar(double a, double b) {
        return 0;
    }
}

class soma extends operacao {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}

class divisao extends operacao {
    @Override
    public double executar(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero.");
        return a / b;
    }
}

class exponenciacao extends operacao {
    @Override
    public double executar(double a, double b) {
        return Math.pow(a, b);
    }
}

public class CalculadoraCientifica {
    public static void main() {
        operacao operacoes[] = {
                new soma(),
                new divisao(),
                new exponenciacao()
        };

        double a = 10, b = 2;

        for (operacao op : operacoes) {
            System.out.println("Resultado: " + op.executar(a, b));
        }
    }
}

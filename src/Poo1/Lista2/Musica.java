package Lista2;

abstract class instrumento {
    private String nome;

    public instrumento(String nome) {
        if(nome == null || nome.isEmpty()) throw new IllegalArgumentException("Valor invalido.");

        this.nome = nome;

    }

    public void tocar() {
        System.out.println("Tocando " + this.nome);
    }
}

class violao extends instrumento {
    public violao(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Acorde de Dó Maior");
    }
}

class bateria extends instrumento {
    public bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tum pá tum tum pá");
    }
}


public class Musica {
    static void main() {
        instrumento instrumentos[] = {
                new violao("Violão"),
                new bateria("Bateria")
        };

        for(instrumento i : instrumentos) {
            i.tocar();
        }
    }
}

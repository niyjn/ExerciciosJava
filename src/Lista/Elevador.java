class Elevador {
    Andar andar;
    Capacidade capacidade;

    public Elevador(Andar andar, Capacidade capacidade) {
        this.capacidade = capacidade;
        this.andar = andar;
    }

    public void entrar(double pesoPessoa) {
        capacidade.adicionar(pesoPessoa);
    }

    public void sair(double pesoPessoa) {
        capacidade.remover(pesoPessoa);
    }

    public void subir() {
        capacidade.validarPeso();
        System.out.println("Subindo para o andar: " + (andar.atual + 1));
        andar.subir();
    }

    public void descer() {
        capacidade.validarPeso();
        System.out.println("Descendo para o andar: " + (andar.atual - 1));
        andar.descer();
    }

    public static void main(String[] args) {

        Andar andar = new Andar(10, 0);
        Capacidade capacidade = new Capacidade(600.0);

        Elevador elevador = new Elevador(andar, capacidade);

        try {

            elevador.entrar(100);

            elevador.subir();

            elevador.entrar(500);

            elevador.descer();

            elevador.sair(100);

            elevador.subir();

            elevador.entrar(200);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Andar {
    int atual;
    int maximo;
    int minimo;

    public Andar(int maximo, int minimo) {
        this.maximo = maximo;
        this.minimo = minimo;
        atual = 0;
    }

    public void validarSubida() {
        if (this.atual >= this.maximo) {
            throw new IllegalArgumentException("Não há mais andares para subir.");
        }
    }

    public void subir() {
        atual++;
    }

    public void descer() {
        atual--;
    }
}

class Capacidade {
    double atual;
    double maxima;

    public Capacidade(double maxima) {
        this.atual = 0.0;
        this.maxima = maxima;
    }

    public void validarPeso() {
        if (this.atual > this.maxima) {
            throw new IllegalArgumentException("O elevador está com excesso de peso.");
        }
    }

    public void remover(Double valor) {
        if (valor < atual)
            atual -= valor;
        throw new IllegalArgumentException("O peso excede o atual existente.");
    }

    public void adicionar(Double valor) {
        if ((valor + atual) > maxima) {
            throw new IllegalArgumentException("Peso máximo atingido, por favor nao entre.");
        }
        valor += atual;
    }
}

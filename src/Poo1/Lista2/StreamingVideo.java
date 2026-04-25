package Lista2;

abstract class conteudo {
    protected String titulo;

    public conteudo(String titulo) {
        if (titulo == null || titulo.isEmpty()) throw new IllegalArgumentException("Título inválido.");
        this.titulo = titulo;
    }

    public double getPreco() {
        return 0.0;
    }
}

class filme extends conteudo {
    public filme(String titulo) {
        super(titulo);
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}

class serie extends conteudo {
    private int qtdEpisodios;

    public serie(String titulo, int qtdEpisodios) {
        super(titulo);
        if (qtdEpisodios < 1) throw new IllegalArgumentException("Quantidade de episódios inválida.");
        this.qtdEpisodios = qtdEpisodios;
    }

    @Override
    public double getPreco() {
        return 2.0 * qtdEpisodios;
    }
}

class documentario extends conteudo {
    public documentario(String titulo) {
        super(titulo);
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}

public class StreamingVideo {
    public static void main() {
        conteudo conteudos[] = {
                new filme("bernardo"),
                new serie("moacir", 62),
                new documentario("pedro")
        };

        for (conteudo c : conteudos) {
            System.out.println("Conteúdo: " + c.titulo + " | Preço: R$ " + c.getPreco());
        }
    }
}

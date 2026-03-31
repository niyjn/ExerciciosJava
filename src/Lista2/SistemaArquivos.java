package Lista2;

import java.util.ArrayList;
import java.util.List;

abstract class arquivo {
    protected String nome;
    protected int tamanho;

    public arquivo(String nome, int tamanho) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome inválido.");
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public abstract void abrir();
}

class imagem extends arquivo {
    public imagem(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir() {
        System.out.println("Mostrando foto: " + this.nome);
    }
}

class texto extends arquivo {
    public texto(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir() {
        System.out.println("Lendo texto: " + this.nome);
    }
}

class video extends arquivo {
    public video(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir() {
        System.out.println("Dando play: " + this.nome);
    }
}

class pasta {
    private List<arquivo> arquivos = new ArrayList<>();

    public void adicionarArquivo(arquivo a) {
        arquivos.add(a);
    }

    public void abrirTodos() {
        for (arquivo a : arquivos) {
            a.abrir();
        }
    }
}

public class SistemaArquivos {
    public static void main() {
        pasta minhaPasta = new pasta();
        minhaPasta.adicionarArquivo(new imagem("bernardo", 2048));
        minhaPasta.adicionarArquivo(new texto("moacir", 500));
        minhaPasta.adicionarArquivo(new video("pedro", 512000));

        minhaPasta.abrirTodos();
    }
}

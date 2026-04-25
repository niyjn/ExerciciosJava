package ExerciciosClasse.Biblioteca;

public class Livro {
    private final Titulo titulo;
    private final Ano ano;
    private final Autor autor;

    public Livro(Titulo titulo, Ano ano, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor:  " + autor);
        System.out.println("Ano:    " + ano);
    }
}
class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void exibirInfo(Musica musica) {
        System.out.println("Titulo: " + this.titulo +
                " | Artista: " + artista + " | " + musica.getDuracaoFormatada());
    }

    public String getDuracaoFormatada() {
        int min = duracao / 60;
        int seg = duracao % 60;
        return "Tempo: " + min + ":" + seg;
    }

    public static void main(String[] args) {

        Musica musica = new Musica("5 noites com o bernardo", "bernardo", 350);

        musica.exibirInfo(musica);

    }
}

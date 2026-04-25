class Contato {
    private String nome;
    private Telefone telefone;

    public Contato(String nome, Telefone telefone) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.telefone = telefone;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void exibirContato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
    }

    public static void main(String[] args) {
        Telefone telefone = new Telefone("12345678");
        Contato contato = new Contato("João", telefone);
        contato.exibirContato();
        contato.setNome("Maria");
        contato.setTelefone(new Telefone("87654321"));
        contato.exibirContato();
    }

}

class Telefone {
    private final String telefone;

    public Telefone(String telefone) {
        if (telefone == null || telefone.isEmpty() || telefone.length() < 8) {
            throw new IllegalArgumentException("Telefone não pode ser nulo ou vazio");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return this.telefone;
    }
}

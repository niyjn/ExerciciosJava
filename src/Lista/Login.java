package Lista;

public class Login {

    private String usuario;
    private Senha senha;
    private Validar validarTentativa;

    public Login(String usuario, Senha senha) {

        this.usuario = usuario;
        this.senha = senha;
        this.validarTentativa = new Validar();
    }

    public String autenticar(String usuario, String senha) {

        if(this.validarTentativa.excedeuLimite()) {
            return "Conta bloqueada.";
        }

        if(this.usuario.equals(usuario) && this.senha.toString().equals(senha)) {
            return "Login realizado com sucesso, bem vindo " + this.usuario + "!";
        }

        this.validarTentativa.registrarFalha();
        return "Entrada incorreta. Restam: " + this.validarTentativa.restantes() + " tentativas.";
    }

    static void main() {

        try {
            Login login = new Login("usuario123", new Senha("senha1234"));

            System.out.println(login.autenticar("usuario123", "senha1234"));
            System.out.println(login.autenticar("usuario123", "senha12345"));
            System.out.println(login.autenticar("usuario123", "senha123456"));
            System.out.println(login.autenticar("usuario123", "senha1234567"));

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}

class Senha {
    private final String senha;

    public Senha(String senha) {
        if(senha.length() < 8 && senha.contains(" ")) {
            throw new IllegalArgumentException("Senha deve ter pelo menos 8 caracteres e não pode conter espaços");
        }
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.senha;
    }
}

class Validar {
    private int total = 0;
    private static final int MAX_TENTATIVAS = 3;
    private boolean bloqueado;

    public void registrarFalha() {
        if (this.total < MAX_TENTATIVAS) {
            this.total++;
        }
    }

    public boolean excedeuLimite() {
        return this.total >= MAX_TENTATIVAS;
    }

    public int restantes() {
        return MAX_TENTATIVAS - this.total;
    }

}
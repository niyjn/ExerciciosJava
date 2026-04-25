package Lista2;

abstract class redeSocial {
    protected String usuario;

    public redeSocial(String usuario) {
        if (usuario == null || usuario.isEmpty()) throw new IllegalArgumentException("Usuário inválido.");
        this.usuario = usuario;
    }

    public abstract void postar(String mensagem);
}

class instagram extends redeSocial {
    public instagram(String usuario) {
        super(usuario);
    }

    @Override
    public void postar(String mensagem) {
        System.out.println("Postou foto no feed: " + mensagem);
    }
}

class twitter extends redeSocial {
    public twitter(String usuario) {
        super(usuario);
    }

    @Override
    public void postar(String mensagem) {
        if (mensagem.length() <= 280) {
            System.out.println("Tweetou: " + mensagem);
        } else {
            System.out.println("Texto muito longo");
        }
    }
}

public class SocialMedia {
    public static void main() {
        redeSocial redes[] = {
                new instagram("bernardo"),
                new twitter("moacir")
        };

        for (redeSocial r : redes) {
            r.postar("Olá, esta é uma mensagem de teste!");
        }
    }
}

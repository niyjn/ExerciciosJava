package Lista2;

abstract class metodoPagamento {
    public abstract void processar(double valor);
}

class credito extends metodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Cobrando R$ " + valor + " no cartão... Taxa de 5%");
    }
}

class debito extends metodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Cobrando R$ " + valor + " no débito... Sem taxa");
    }
}

class criptomoeda extends metodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Convertendo R$ " + valor + " para Bitcoin...");
    }
}

class loja {
    public void finalizarCompra(metodoPagamento metodo, double valor) {
        metodo.processar(valor);
        System.out.println("Compra finalizada!");
    }
}

public class GatewayPagamento {
    public static void main() {
        loja minhaLoja = new loja();

        minhaLoja.finalizarCompra(new credito(), 100.0);
        minhaLoja.finalizarCompra(new debito(), 50.0);
        minhaLoja.finalizarCompra(new criptomoeda(), 2000.0);
    }
}

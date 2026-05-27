### **Analise o código:**

  ```
  public class Cliente {
  void cadastrar() { }
  void calcularDesconto() { }
  void enviarEmailPromocional() { }
  }
  ```

  
## Onde há baixa coesão? Como dividir a classe?

Os métodos _cadastrar_, _calcularDesconto_ e _enviarEmailPromocional_, apesar de fazerem sentido dentro do contexto do cliente, afinal ele pode ser cadastrado, receber desconto e receber emails, não devem ser agrupadas dentro da mesma classe por coesão, a baixa coesão é vista no momento que funções que fazem coisas diferentes são acopladas na mesma classe. 




A classe deveria ser fragmentada em 4, a Classe de Registro, que conteria algo como:

```
class RegistroService { 
void cadastrar(Cliente C){ }
void remover(Cliente C) { }
} 
```

A classe de Desconto:

```
class DescontoService {
void calcularDesconto(Cliente C) { }
}
```

A classe Promocional:

```
interface MessageService {
void EnviarMensagem(String destino, String conteudo)
}

class EmailService implements MessageService {
@Override
void EnviarMensagem() {}
}

class TelegramService implements MessageService {
@Override
void EnviarMensagem() {}
}
```

E então: 

```
class NotificacaoService {
    private MessageService canal;

    public NotificacaoService(MessageService canal) {
        this.canal = canal;  // recebe o canal de fora
    }

    void enviarPromocional(Cliente c, String conteudo) {
        canal.enviarMensagem(c.getContato(), conteudo);
    }
}
```

Só então a relação entre cliente transitaria, com um cliente sendo algo como:

```
public record Cliente(String nome, String email);
```

___

### **Reescreva a classe abaixo aplicando injeção de dependencia:**

```
public class Relatorio {
 private BancoDeDados bd = new BancoDeDados();
 void gerar() { bd.lerDados(); }
}
```

vira ->

```

class Relatorio {

  private BancoDeDados bd;
  
  public Relatório(BancoDeDados bd) {
    this.bd = bd;
  }

  void gerarRelatorio() { bd.lerDados(); }
}

```

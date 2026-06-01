### ***Refatore a classe abaixo para aplicar o SRP e o OCP:***


```
public class RelatorioFinanceiro {
2 void gerarPDF() { }
3 void gerarExcel() { }
4 void enviarEmail() { }
5 }
```


O Relatório deveria em ultima instancia, chamar todas as outras classes, que, deveriam cada uma ter o próprio escopo:
```
interface EnviarMensagem {
  public void enviarMensagem(Usuario usuario);
}

class Email implements EnviarMensagem {
  @Override
  public void enviarMensagem(Usuario usuario) {
    System.out.println("Mensagem de email enviada para: " + usuario.getNome());
  }
}

interface GerarRelatorio {
  void gerar();
}

class Excel implements GerarRelatorio { 
  @Override
  public void gerar() {
    System.out.println("Gerando relatorio em excel.");
  }
}

class PDF implements GerarRelatorio {
  @Override
  public void gerar() {
    System.out.println("Gerando relatorio em PDF.");
  }
}

public class Relatorio {
  GerarRelatorio gerador;
  EnviarMensagem canal;

  public Relatorio(GerarRelatorio gerador, EnviarMensagem canal) {
    this.gerador = gerador;
    this.canal = canal;
  }

  public void gerar() {
    gerador.gerar();
  }

  public void enviar(Usuario usuario) {
    canal.enviarMensagem(usuario);
  }
}
```

### Crie um exemplo de violação do LSP e proponha uma solução.

Violação: Criar um método numa interface que é usado apenas por uma das implementações, tornando-a inutil nas outras, exemplo:
```
inteface GerarRelatorio{
  void gerar();
  void assinarPDF(); \\ Método que só PDF usa
}
```
Só um pdf pode ser assinado, porém:
```
class Excel implements GerarRelatorio {
  @Override
  public void gerar() { ... }
  public void assinarPDF() { System.out.println("Excels não podem ser assinados."); } \\ <-- B.O, excel mente que precisa e usa
}
```

O excel diz que é assinavel, pois o pai dele, o GerarRelatorio, é, porém, quando ele usa o assinar, ele explode, ele não pode herdar um contrato e assinar pela metade, ou assina, ou não existe.

Se corrige com:

```
interface GerarRelatorio {
  void gerar();
}

class PDF implements GerarRelatorio {
  Boolean isAssinado = false;
  private void assinar() { isAssinado = true } \\ só existe dentro do próprio método.

  @Override 
  public void gerar() { assinar(); }
}
```

### Explique com suas palavras como o DIP reduz o acoplamento e melhora os testes.

Ele abstrai as funções tal que, as regras de negócio dependem apenas de interfaces.

Jeito errado segundo o DIP:

```
public class Relatorio {
  PDF pdf;
  Email email;
}
```

E se amanhã precisar de sms? Ou de whatsapp? Teria que mudar a classe inteira apenas para poder implementar essa feature, isso facilita muito em testes unitários também.

O jeito correto:

```
public class Relatorio {
  GerarRelatorio gerador;
  EnviarMensagem metodo;
}
```

Como é uma interface, você pode passar um pdf por sms, um excel por email, um sheets por whatsapp, o método sempre estará ali. Como o Relatorio depende de uma interface, no teste você injeta uma implementação falsa no lugar da real para testar.

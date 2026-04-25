package Projeto_Escola;

public class Disciplina {
  
  private String nome;
  private int codigo;
  private int limiteVagas;
  
  public Disciplina(String nome, int codigo, int limiteVagas) {
    this.nome = nome;
    this.codigo = codigo;
    this.limiteVagas = limiteVagas;
  }
  
  public String getNome() { return nome; }
  public int getCodigo() { return codigo; }
  public int getVagas() { return limiteVagas; }
  
}

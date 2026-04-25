package Projeto_Escola;

public class Aluno {
  private int idade;
  private String nome;
  private String matricula;
  
  public Aluno(int idade, String nome, String matricula) {
    this.idade = idade;
    this.nome = nome;
    this.matricula = matricula;
 }
  
  public int getIdade() { return idade; }
  public String getNome() { return nome; }
  public String getMatricula() { return matricula; }
  
}

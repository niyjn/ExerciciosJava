package Projeto_Escola;

public class Registro {
    
  private Disciplina disciplina;
  private Aluno aluno;
  
  private double nota;
  private int falta;
  
  public Registro(Aluno aluno, Disciplina disciplina) {
    this.aluno = aluno;
    this.disciplina = disciplina;   
  }
  
  public Aluno getAluno() { return aluno; }
  public Disciplina getDisciplina() { return disciplina; }
  public void setNota(double nota) { this.nota = nota; }
  
  @Override
    public String toString() {
        return String.format("Aluno: %-15s | Disciplina: %-15s | Nota: %.2f", 
                             aluno.getNome(), disciplina.getNome(), nota);
    } 
    
}

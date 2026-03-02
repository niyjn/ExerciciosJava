import java.util.*;

class Aluno {
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

class Disciplina {
  
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

class Registro {
    
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

class SistemaEscolar {
    
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Registro> registros = new ArrayList<>();
    
    public void cadastrarAluno(int idade, String nome, String mat) {
        alunos.add(new Aluno(idade, nome, mat));
        System.out.println("Aluno cadastrado!");
    }
    
    public void cadastrarDisciplina(String nome, int cod, int vagas) {
        disciplinas.add(new Disciplina(nome, cod, vagas));
        System.out.println("Disciplina adicionada.");
    }
    
    public Aluno buscarAluno(String matricula) {
        for (Aluno a : alunos) if (a.getMatricula().equals(matricula)) return a;
        return null;
    }
    
    public Disciplina buscarDisciplina(int codigo) {
        for (Disciplina d : disciplinas) if (d.getCodigo() == codigo) return d;
        return null;
    }
    
    public void matricular(Aluno a, Disciplina b) {
        registros.add(new Registro(a, b));
    }
    
    public void atribuirNota(String matricula, int codigoDisciplina, double novaNota) {
    for (Registro r : registros) {
        
        if (r.getAluno().getMatricula().equals(matricula) && 
            r.getDisciplina().getCodigo() == codigoDisciplina) {
            
            r.setNota(novaNota);
            System.out.println("Nota atualizada com sucesso para: " + r.getDisciplina().getNome());
            return;
        }
    }
    System.out.println("Erro: O aluno não está matriculado nesta disciplina.");
}
    
    public void listarTudo() {
        System.out.println("\n--- RELATÓRIO DE DISCIPLINAS ---");
        for (Disciplina d : disciplinas) {
            System.out.println("Cod: " + d.getCodigo() + " | Nome: " + d.getNome());
        }
    }
    
    public void exibirBoletim() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
            return;
        }
        registros.forEach(System.out::println);
    }
    
    public void deletarAluno(String matricula) {
        alunos.removeIf(a -> a.getMatricula().equals(matricula));
        registros.removeIf(r -> r.getAluno().getMatricula().equals(matricula));
        System.out.println("Aluno e seus registros removidos.");
    }
}

public class GerenciamentoEscola {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SistemaEscolar sistema = new SistemaEscolar();
      int opc = -1;
      
     while(opc != 0) {
            System.out.println("\n--- MENU ACADÊMICO ---");
            System.out.println("1. Cadastrar Aluno | 2. Deletar Aluno | 3. Consultar Aluno");
            System.out.println("4. Atribuir Nota   | 5. Cadastrar Disciplina | 6. Atrelar Disciplina");
            System.out.println("7. Relatório Geral | 8. Boletim Geral | 0. Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine(); 

            switch (opc) {
                case 1:
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Matrícula: "); String mat = sc.nextLine();
                    System.out.print("Idade: "); int idade = sc.nextInt();
                    sistema.cadastrarAluno(idade, nome, mat);
                    break;
                case 2:
                    System.out.print("Matrícula para deletar: ");
                    sistema.deletarAluno(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Matrícula: ");
                    Aluno a = sistema.buscarAluno(sc.nextLine());
                    if (a != null) System.out.println("Nome: " + a.getNome());
                    else System.out.println("Não encontrado.");
                    break;
               case 4:
                    System.out.print("Matrícula do Aluno: ");
                    String matNota = sc.nextLine();
                    
                    System.out.print("Código da Disciplina: ");
                    int codDiscNota = sc.nextInt(); 
                    
                    System.out.print("Nova Nota: ");
                    double nota = sc.nextDouble();
                    sistema.atribuirNota(matNota, codDiscNota, nota);
                    break;
                case 5:
                    System.out.print("Nome Disciplina: "); String nD = sc.nextLine();
                    System.out.print("Código: "); int cD = sc.nextInt();
                    System.out.print("Vagas: "); int vD = sc.nextInt();
                    sistema.cadastrarDisciplina(nD, cD, vD);
                    break;
                case 6:
                    System.out.print("Matrícula Aluno: "); String mAlu = sc.nextLine();
                    System.out.print("Código Disciplina: "); int cDis = sc.nextInt();
                    Aluno alu = sistema.buscarAluno(mAlu);
                    Disciplina dis = sistema.buscarDisciplina(cDis);
                    if (alu != null && dis != null) {
                        sistema.matricular(alu, dis);
                        System.out.println("Matrícula realizada!");
                    } else System.out.println("Erro: Aluno ou Disciplina não existem.");
                    break;
                case 7: sistema.listarTudo(); break;
                case 8: sistema.exibirBoletim(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Inválido.");
            }
        }
        
        sc.close();
 
     }
}

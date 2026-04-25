package Projeto_Escola;

import Projeto_Escola.SistemaEscolar;
import Projeto_Escola.Aluno;
import Projeto_Escola.Disciplina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SistemaEscolar sistema = new SistemaEscolar();
      int opc = -1;
      
     while(opc != 0) {
            System.out.println(" MENU ACADÊMICO ---");
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

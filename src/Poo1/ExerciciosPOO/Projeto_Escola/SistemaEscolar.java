package Projeto_Escola;

import java.util.ArrayList;

public class SistemaEscolar {
    
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
        System.out.println("RELATÓRIO DE DISCIPLINAS ---");
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

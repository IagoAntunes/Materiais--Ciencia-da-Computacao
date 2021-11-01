package Exercicio18;

import java.util.ArrayList;

public class Sala {

    private int idSala;
    private aluno aluno;
    private static int maiorNota=0;
    private static int qtd = 0;
    //Iago Antunes Ferreira
    private ArrayList<aluno> Alunos = new ArrayList<aluno>();

    public Sala(int idSala){
        setIdSala(qtd);

        this.idSala = idSala;
        qtd++;
    }

    public ArrayList<aluno> getAlunos() {
        return Alunos;
    }

    public void adicionarPessoa(aluno aluno){
        Alunos.add(aluno);
    }
    public void removerAluno(aluno aluno){
        this.Alunos.remove(aluno);
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public aluno getAluno() {
        return aluno;
    }
    public int getIdSala() {
        return idSala;
    }
    //Iago Antunes Ferreira
    public aluno getmelhorNota(){
        aluno alunoNota = Alunos.get(0);//Define aluno 0 como melhor
        int  maxNota = alunoNota.getNota();
    
        for (aluno aluno : Alunos) {
          int notaAluno = aluno.getNota();
          if (notaAluno > maxNota) {
            alunoNota = aluno;
          }
        }
        return alunoNota;
    }
}
package Exercicio18;

import java.util.ArrayList;

public class Sala {

    private aluno aluno;
    private int qtdAlunos;

    ArrayList<aluno> Alunos = new ArrayList<>();

    public ArrayList<aluno> getAlunos() {
        return Alunos;
    }

    public void adicionarPessoa(aluno aluno){
        Alunos.add(aluno);
    }
    public void removerAluno(aluno aluno){
        Alunos.remove(aluno);
    }

    public void setqtdAlunos(int qtdAlunos){
        this.qtdAlunos = qtdAlunos;
    }
    public aluno getAluno() {
        return aluno;
    }
    

}

package Exercicio18;

import java.util.ArrayList;

public class Classe {

    private aluno aluno;
    private int qtdAlunos;

    ArrayList<aluno> Alunos;


    public void adicionarPessoa(aluno aluno){
        Alunos.add(aluno);
    }
    public void removerAluno(aluno aluno){
        Alunos.remove(aluno);
    }

    public void setqtdAlunos(int qtdAlunos){
        this.qtdAlunos = qtdAlunos;
    }


}

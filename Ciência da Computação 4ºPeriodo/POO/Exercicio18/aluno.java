package Exercicio18;

import java.util.Set;

public class aluno {
    
    private String nome;
    private int idade;
    //Iago Antunes Ferreira
    private Sexo sexo;
    private int nota;
    private int idAluno;
    private static int maxNota=0;
    private static int qtd = 1;

    public aluno(String nome,int idade,Sexo sexo,int nota) {
        setIdAluno(qtd);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nota = nota;
        qtd ++;
    }
    public static int getmaxNota() {
        return maxNota;
    }
    public static void setmaxNota(int maxNota) {
        aluno.maxNota = maxNota;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public Sexo getSexo() {
        return sexo;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    //Iago Antunes Ferreira
    public String imprimir(){
        return "Id:"+idAluno + "\nNome:"+nome+"\nIdade:"+idade+"\nSexo:"+sexo+"\nNota:"+nota;
    }
}

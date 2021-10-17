package Exercicio18;

import java.util.Set;

public class aluno {
    
    private String nome;
    private int idade;

    private String sexo;
    private Nota Nota;

    public aluno(String nome, int idade,String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

 
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    
    public String getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public Nota getNota() {
        return Nota;
    }



    @Override
    public String toString() {
        return "\nNome:"+nome+"\nIdade:"+idade+"\nSexo:"+sexo+"Nota:"+getNota().getNota();
    }


}

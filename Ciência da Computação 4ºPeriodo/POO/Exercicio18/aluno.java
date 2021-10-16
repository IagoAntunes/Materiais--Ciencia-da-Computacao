package Exercicio18;

import java.util.Set;

public class aluno {
    
    private String nome;
    private String idade;
    private String sexo;
    private Nota Nota;

 
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




}

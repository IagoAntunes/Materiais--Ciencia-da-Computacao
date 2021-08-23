package ExercicioInicial.Exercicio4;

public class Pessoa {

    //Atributos
    public String nome;
    public String endereco;
    public String telefone;

    //SET---
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    //GET--
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    //Printar
    public String imprimir(){
        return ("\nNome: "+getNome()+
        "\nEndereco: "+getEndereco()+
        "\nTelefone: "+getTelefone());
    }




}

package ExercicioHerançaPolimorfismo;
/*
1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters)
 e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores
  conforme sua percepção. Atributos: String nome; String endereço; String telefone;
*/
public  class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    //Iago Antunes Ferreira
    public Pessoa(String nome,String endereco,String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Pessoa(String nome,String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "\nNome:"+getNome()+
        "\nEndereco: "+getEndereco()+
        "\nTelefone: "+getTelefone();
    }

}

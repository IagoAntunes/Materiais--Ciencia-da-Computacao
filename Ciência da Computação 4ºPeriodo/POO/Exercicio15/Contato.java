package Exercicio15;

public class Contato {
  
    private String nome;
    private int telefone;
    private String cidade;
    public static int idContador;
    private boolean ativo;

    public Contato(String nome,int telefone,String cidade){
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
        this.ativo = false;

        idContador ++;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome:"+getNome() + "\nTelefone:"+getTelefone() + "\nCidade:"+getCidade();
    }
    //Iago Antunes Ferreira
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setIdContador(int idContador) {
        this.idContador = idContador;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public String getCidade() {
        return cidade;
    }
    public int getidContador() {
        return idContador;
    }
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public Boolean getAtivo(){
        return this.ativo;
    }

    public void ativarContato(){
        this.ativo = true;
    }
    public void bloquearContato(){
        this.ativo = false;
    }
}

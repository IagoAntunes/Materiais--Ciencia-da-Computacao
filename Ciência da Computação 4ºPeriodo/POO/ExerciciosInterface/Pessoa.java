package ExerciciosInterface;

abstract class Pessoa {
    protected String nome;
    protected String endereco;

    //Iago Antunes Ferreira
    public Pessoa(String nome,String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    protected abstract String Escrever();

    public abstract String mostraTipo();
}

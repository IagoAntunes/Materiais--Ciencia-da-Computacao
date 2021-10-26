package Exercicio20;

public class Produto {

    private int idProduto;
    private String nome;
    private int qtdeAtual;
    private int qtdeMinima;

    public Produto(String nome,int qtdeMinima,int qtdeAtual){
        this.nome = nome;
        this.qtdeAtual = qtdeAtual;
        this.qtdeMinima = qtdeMinima;
    }
    public Produto(){
        this.nome = "vazio";
        this.qtdeAtual = 0;
        this.qtdeMinima = 0;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public String getNome() {
        return nome;
    }
    public int getQtdeAtual() {
        return qtdeAtual;
    }
    public int getQtdeMinima() {
        return qtdeMinima;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtdeAtual(int qtdeAtual) {
        this.qtdeAtual = qtdeAtual;
    }
    public void setQtdeMinima(int qtdeMinima) {
        this.qtdeMinima = qtdeMinima;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void repoe(int qtdeAtual){
        this.qtdeAtual = qtdeAtual;
    }
    public void diminuiProduto(int qtd){
        if(this.qtdeAtual - qtd > 0)
            this.qtdeAtual = qtdeAtual - qtd;
    }
    @Override
    public String toString() {
        return "\nNome:"+nome+"\nQtdeAtual:"+qtdeAtual+"\nQtdeMinima:"+qtdeMinima+"\n";
    }



}

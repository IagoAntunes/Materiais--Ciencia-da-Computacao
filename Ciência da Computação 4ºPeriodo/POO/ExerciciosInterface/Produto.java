package ExerciciosInterface;
public class Produto {
    public String nomeProduto;
    public double valorProduto;
//Iago Antunes Ferreira
    public Produto(String nomeProduto,int valorProduto) {
        setNome(nomeProduto);
        setValor(valorProduto);
    }
    public String getNome() {
        return nomeProduto;
    }
    public double getValor() {
        return valorProduto;
    }
    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setValor(double valorProduto) {
        if(valorProduto > 0)
            this.valorProduto = valorProduto;
    }
}

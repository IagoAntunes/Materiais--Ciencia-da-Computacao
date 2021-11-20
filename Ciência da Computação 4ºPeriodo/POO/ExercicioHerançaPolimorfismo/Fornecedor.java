package ExercicioHerançaPolimorfismo;
/*
-Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
-Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa,
-os atributos LimiteCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida
-(montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos
seletores e modificadores, um método ObterSaldoRestante() que devolve quanto ainda se pode comprar à prazo
com o fornecedo. 
Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permit
verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
Os métodos get e set são adequados? O valor da Dívida deve ser alterado ou incrementado? Pense nestas situações
 neste e nos demais exercícios.
*/
public class Fornecedor extends Pessoa {
    private Integer LimiteCredito;
    private Integer valorDivida;
    //Iago Antunes Ferreira
    public Fornecedor(String nome,String endereco,String telefone,Integer LimiteCredito,Integer valorDivida){
        super(nome, endereco, telefone);
        this.LimiteCredito = LimiteCredito;
        this.valorDivida = valorDivida;
    }
    public Integer ObterSaldoRestante(){
        return getLimiteCredito() - getValorDivida();
    }
    public Integer getLimiteCredito() {
        return LimiteCredito;
    }
    public Integer getValorDivida() {
        return valorDivida;
    }
    public void setLimiteCredito(Integer LimiteCredito){
        this.LimiteCredito = LimiteCredito;
    }
    public void setvalorDivida(Integer valorDivida){
        this.valorDivida = valorDivida;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome:"+getNome()+
        "\nEndereco: "+getEndereco()+
        "\nTelefone: "+getTelefone()+
        "\nLimiteCredito: "+getLimiteCredito()+
        "\nValorDivida: "+getValorDivida()+
        "\nSaldoRestante: "+ObterSaldoRestante();
    }
}

package ExercicioInicial.Exercicio5;

public class Produto {
    
    private String nome;
    private Double precoCusto;
    private Double precoVenda;
    private Double margemLucro;

    //SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPrecoCusto(Double precoC){
        this.precoCusto = precoC;
    }
    public void setPrecoVenda(Double precoV){
        if(precoV < getPrecoCusto()){
            System.out.println("Você tera prejuizo!!");
        }else{
            this.precoVenda = precoV;
        }
    }
    //GET
    public String getNome(){
        return this.nome;
    }
    public Double getPrecoCusto(){
        return this.precoCusto;
    }
    public Double getPrecoVenda(){
        return this.precoVenda;
    }
    public Double getMargemLucro(){
        return this.margemLucro;
    }
    //Outros
    public void calcularMargemLucro(){
        this.margemLucro = precoVenda - precoCusto;
    }
    public Double getMargemLucroPorcentagem(){
        return ((this.margemLucro * 100)/(getPrecoCusto()));
    }
    //Printar
    public String imprimir(){
        return ("\n\nNome: "+getNome()+
        "\nPreco de Custo: "+getPrecoCusto()+
        "\nPreco de Venda: "+getPrecoVenda()+
        "\nMargem em Moeda: "+getMargemLucro()+
        "\nMargem em percentual: "+getMargemLucroPorcentagem());
    }







}

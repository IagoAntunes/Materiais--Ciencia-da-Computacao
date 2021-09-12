package ExercicioAvaliativo.Exercicio5;

public class mochila {
    private String nome;
    private Integer qtdItensAtual=0;
    private Integer qtdItensMax;
    private Double pesoAtual=0.0;
    private Double pesoMaximo;

    public mochila(String nome,Double pesoMaximo,Integer qtdItensMax){
        this.nome = nome;
        this.pesoMaximo = pesoMaximo;
        this.qtdItensMax = qtdItensMax;
    }
    public void inserirItens(Double peso){
        setPesoAtual(peso);
    }
    public String situacao(){
        return "PesoAtual:"+getPesoAtual()+"\nPesoMaximo:"+this.pesoMaximo+"\nQtdItens:"+this.qtdItensAtual+"\nQtdItensMax:"+this.qtdItensMax;
    }
    public void setPesoAtual(Double pesoAtual) {
        if(getPesoAtual() + pesoAtual <= this.pesoMaximo){
            this.pesoAtual = getPesoAtual() + pesoAtual;
            setQtdItensAtual();
        }
    }
    public void setQtdItensAtual(){
        if(getQtdItensAtual() < this.qtdItensMax){
            this.qtdItensAtual = getQtdItensAtual() + 1;
        }
    }
    public Double getPesoAtual() {
        return pesoAtual;
    }
    public Integer getQtdItensAtual() {
        return qtdItensAtual;
    }



}

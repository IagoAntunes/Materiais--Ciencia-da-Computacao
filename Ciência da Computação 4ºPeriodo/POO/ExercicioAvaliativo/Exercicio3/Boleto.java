package ExercicioAvaliativo.Exercicio3;

public class Boleto {
    
    private int vencimento;
    private Double valor;
    private Integer desconto;
    private boolean isPago;
    private String nome;


    public Boleto(Integer vencimento,Double valor,Integer desconto,String nome){
        this.vencimento = vencimento;
        this.valor = valor;
        this.desconto = desconto;
        this.isPago = false;
        this.nome = nome;
    }

    public Double valorLiquido(){
        return (getValor() * this.desconto)/100;
    }
    public void pagar(){
        if(getIsPago() == false){
            this.isPago = true;
        }else{
            this.isPago = false;
        }
    }
    public Double getValor() {
        return valor;
    }
    public Boolean getIsPago(){
        return this.isPago;
    }
    
}

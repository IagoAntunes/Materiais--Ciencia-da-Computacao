package ExercicioInicial.Exercicio3;

public class boleto {
    
    public Integer vencimento;
    public Double valor;
    public Double desconto;
    public Boolean pago;
    public String nome;
    public Double Vliquido;

    //Construtor
    public void inicializando(int vencimento, Double valor, Double desconto, Boolean pago, String nome){
        this.vencimento = vencimento;
        this.valor = valor;
        this.desconto = desconto;
        this.pago = pago;
        this.nome = nome;
        this.Vliquido = valor - desconto;
    }
    public String getNome(){
        return this.nome;
    }
    public Boolean getPago(){
        return this.pago;
    }
    public Double getValor(){
        return this.Vliquido;
    }
    //Retorna valor liquido
    public Double desconto(){
        return this.Vliquido;
    }
    //Metodo para pagar
    public void pagar(){
        this.pago = true;
    }
}
/*Crie a classe Boleto com os atributos vencimento, valor, desconto, um booleano se está 
pago e nome do cliente. Crie um construtor para que todos dados sejam passados no 
momento da instanciação dos objetos. Crie um método que retorne o valor líquido do boleto. 
Crie também um método pagar que altera o boleto para pago.
*/
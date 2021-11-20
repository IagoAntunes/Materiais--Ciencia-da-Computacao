package ExercicioHerançaPolimorfismo;
/*
-Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem,
-para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base)
-e imposto (porcentagem retida dos impostos). 
Implemente a classe Empregado com métodos seletores e modificadores e
um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. Existem métodos para realiza
aumento de salário? Por valor ou percentual?
*/
public abstract class Empregado extends Pessoa {
    //Variaveis
    private Integer codigoSetor;
    private Integer imposto;
    //Iago Antunes Ferreira
    private Double salarioBase;
    public Double salario;
    public Double salarioLiquido;
    //Construtor
    public Empregado(String nome,String endereco,String telefone,Integer codigoSetor){
        super(nome, endereco, telefone);
        setSalarioBase(2000.00);
        setImposto(10);
        this.salario = salarioBase;
        setCodigoSetor(codigoSetor);
        calcularSalario();
    }
    //Set
    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public void setImposto(Integer imposto) {
        this.imposto = imposto;
    }
    protected void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    protected void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    //Get
    public Integer getCodigoSetor() {
        return codigoSetor;
    }
    public Integer getImposto() {
        return imposto;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public Double getSalarioLiquido() {
        return salarioLiquido;
    }
    public Double getSalario() {
        return salario;
    }
    
    public abstract void calcularSalario();
    public abstract void aumentarSalario();
    public void alterarSalarioBase(double salarioBase){
        setSalarioBase(salarioBase);
        this.salario = salarioBase;
        calcularSalario();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome: "+getNome()+
        "\nEndereco: "+getEndereco()+
        "\nTelefone: "+getTelefone()+
        "\nCodigoSetor: "+getCodigoSetor()+
        "\nSalarioLiquidoA: "+getSalarioLiquido()+
        "\nSalario: "+getSalario()+
        "\nSalarioBase: "+getSalarioBase();
    }
}

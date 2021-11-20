package ExercicioHerançaPolimorfismo;
/*
-Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como atributos, 
-para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas (correspondente ao valor
-monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado ao 
-vencimento base do Vendedor). 
Note que deverá redefinir nesta subclasse o método herdado calcularSalario 
(o salário de um vendedor é equivalente ao salário de um empregado usual acrescido da referida comissão). 
Escreva um programa de teste adequado para esta classe.
*/
public class Vendedor extends Empregado {
    private double valorVendas;
    private static int comissao=5;
    //Iago Antunes Ferreira
    public Vendedor(String nome,String endereco,String telefone,//Pessoa
        Integer codigoSetor,double valorVendas){//Empregado
        super(nome, endereco, telefone, codigoSetor);
        setValorVendas(valorVendas);
    }
    public int getComissao() {
        return comissao;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    @Override
    public void aumentarSalario(){//Aumenta
        salario = salario + (int)(salario * 0.50);
        calcularSalario();
    }
    @Override
    public void calcularSalario(){//Metodo retornar salario
        this.salarioLiquido = getSalario() + 
        (getValorVendas() *((double)getComissao()/100)) -
        (getSalario() * ((double)getImposto()/100));
    }
}

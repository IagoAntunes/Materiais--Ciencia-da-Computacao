package ExercicioHerançaPolimorfismo;
/*
Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos,
para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao
(que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
Note que deverá redefinir nesta subclasse o método herdado **calcularSalario** (o salário de um operário é
equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado 
para esta classe.
*/
public class Operario extends Empregado {
    public int valorProducao;
    private static int comissao = 5;
    //Iago Antunes Ferreira
    public Operario(String nome,String endereco,String telefone,
        int codigoSetor,int valorProducao){
        super(nome, endereco, telefone, codigoSetor);
        setValorProducao(valorProducao);//<--------
    }
    public int getValorProducao() {
        return valorProducao;
    }
    public int getComissao() {
        return comissao;
    }
    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }
    @Override
    public void aumentarSalario(){
        salario = salario + (int)(salario * 0.50);
        calcularSalario();
    }
    @Override
    public void calcularSalario(){
        this.salarioLiquido = getSalario() +
        ((getValorProducao() * ((double)getComissao()/100)) -
        (getSalario() * ((double)getImposto()/100)));
    }
}

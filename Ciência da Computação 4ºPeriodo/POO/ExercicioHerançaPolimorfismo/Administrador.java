package ExercicioHerançaPolimorfismo;
/*
Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem como atributos,
para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens,
estadias, ...). Note que deverá redefinir na classe Administrador o método herdado calcularSalari
(o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda de custo). 
Escreva um programa de teste adequado para esta classe.
*/
public class Administrador extends Empregado {
    
    private static int ajudaDeCusto=15;//Ajuda 15% da renda
    //Iago Antunes Ferreira
    public Administrador(String nome,String endereco,String telefone,//Pessoa
        Integer codigoSetor){//Empregado)
        super(nome, endereco, telefone, codigoSetor);
    }
    public int getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    @Override
    public void aumentarSalario(){//Aumenta
        salario = salario + (int)(salario * 0.50);
        calcularSalario();
    }
    @Override
    public void calcularSalario(){//Calcula salario Liquido
        this.salarioLiquido = getSalario() +
        ((getSalario() * ((double)getAjudaDeCusto()/100)) -
        (getSalario() *((double)getImposto()/100)));
    }
}


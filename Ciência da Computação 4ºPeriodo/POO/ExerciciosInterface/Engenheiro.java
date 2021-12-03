package ExerciciosInterface;

public class Engenheiro extends Funcionario{
    //Iago Antunes Ferreira
    private int numeroCREA;

    public Engenheiro(String nome,String endereco,String codigo,Double salario,int numeroCREA) {
        super(nome,endereco,codigo,salario);
        setNumeroCREA(numeroCREA);
    }
    private void setNumeroCREA(int numeroCREA) {
        this.numeroCREA = numeroCREA;
    }
    public int getNumeroCREA() {
        return numeroCREA;
    }
    @Override
    public String Escrever(){
        return super.Escrever() + "\nNumeroCREA:"+numeroCREA;
    }
}

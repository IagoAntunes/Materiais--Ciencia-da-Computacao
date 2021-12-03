package ExerciciosInterface;

public class Motorista extends Funcionario {

    private int numeroCNH;
//Iago Antunes Ferreira
    public Motorista(String nome,String endereco,String codigo,Double salario,int numeroCNH) {
        super(nome,endereco,codigo,salario);
        setNumeroCNH(numeroCNH);
    }
    private void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    public int getNumeroCNH() {
        return numeroCNH;
    }
    @Override
    public String Escrever(){
        return super.Escrever() + "\nNumeroCNH:"+numeroCNH;
    }
}

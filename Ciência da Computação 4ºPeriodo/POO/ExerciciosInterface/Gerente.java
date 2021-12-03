package ExerciciosInterface;

public class Gerente extends Funcionario implements IPrioridade {
    //Iago Antunes Ferreira
    private String nomeDepartamento;

    public Gerente(String nome,String endereco,String codigo,Double salario,String nomeDepartamento){
        super(nome,endereco,codigo,salario);
        this.nomeDepartamento = nomeDepartamento;
    }
    @Override
    public boolean autentica() {
        if(nomeDepartamento.equalsIgnoreCase("RH") ||
        nomeDepartamento.equalsIgnoreCase("Compras")||
        nomeDepartamento.equalsIgnoreCase("Departamento Pessoal")){
            return true;
        };
        return false;
    }
    @Override
    public String Escrever(){
        return super.Escrever() + "\nNomeDepartamento:"+nomeDepartamento;
    }
}

   
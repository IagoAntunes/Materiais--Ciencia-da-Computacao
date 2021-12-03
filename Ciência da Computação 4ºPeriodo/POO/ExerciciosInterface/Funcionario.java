package ExerciciosInterface;

//Iago Antunes Ferreira
public class Funcionario extends Pessoa {
    protected String codigo;
    protected Double salario;
    public Funcionario(String nome,String endereco,String codigo,Double salario) {
        super(nome,endereco);
        setCodigo(codigo);
        setSalario(salario);
    }
    public String getCodigo() {
        return codigo;
    }
    public Double getSalario() {
        return salario;
    }
    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public String mostraTipo() {
        return "Funcionario";
    }
    public String Escrever(){
        return "\n\nNome:"+nome+"\nEndereco:"+endereco+"\nCodigo:"+codigo+"\nSalario:"+salario;
    }
}

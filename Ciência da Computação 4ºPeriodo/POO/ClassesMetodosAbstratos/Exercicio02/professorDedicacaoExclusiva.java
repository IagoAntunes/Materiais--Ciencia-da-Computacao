package ClassesMetodosAbstratos.Exercicio02;

public class professorDedicacaoExclusiva extends professor {
    
    protected int salarioFixo;
    public professorDedicacaoExclusiva(int matricula,String nome,String sexo,String dataNascimento,String dataContrato) {
        super(matricula,nome,sexo,dataNascimento,dataContrato);
        setSalarioFixo(2000);
    }//Iago Antunes Ferreira
    private void setSalarioFixo(int salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    @Override
    public int retornaSalario() {
        return salarioFixo;
    }
}

package ClassesMetodosAbstratos.Exercicio02;

public class professorHorista extends professor{
    
    public int horasTrabalhadas;
    public int valorpHora;
    
    public professorHorista(int matricula,String nome,String sexo,String dataNascimento,String dataContrato,
        int horasTrabalhadas,int valorpHora) {//professorHorista
        super(matricula,nome,sexo,dataNascimento,dataContrato);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorpHora(valorpHora);
    }
    protected int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    protected int getValorpHora() {
        return valorpHora;
    }
    protected void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    protected void setValorpHora(int valorpHora) {
        this.valorpHora = valorpHora;
    }
    @Override
    public int retornaSalario() {
        return getHorasTrabalhadas() * getValorpHora();
    }
}

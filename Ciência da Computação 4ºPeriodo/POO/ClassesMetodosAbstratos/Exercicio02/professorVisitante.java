package ClassesMetodosAbstratos.Exercicio02;

public class professorVisitante extends professorHorista {   
    private String nomeFaculdade;
    public professorVisitante(int matricula,String nome,String sexo,String dataNascimento,String dataContrato,
        int horasTrabalhadas,int valorpHora,
        String nomeFaculdade) {//professorHorista
        super(matricula,nome,sexo,dataNascimento,dataContrato,horasTrabalhadas,valorpHora);
        setNomeFaculdade(nomeFaculdade);
    }
    public void setNomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }
}



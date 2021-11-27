package ClassesMetodosAbstratos.Exercicio02;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
/*
Criar a classe professor com atributos matricula, nome, sexo, dataNascimento, dataContrato. 
Além dos métodos get e set, deverá conter um método que retorne a quantidade de anos que falta para o professor
se aposentar que deverá considerar que para aposentar deve-se ter 65 anos de idade e 35 de atuação para homens
e 60 anos de idade e 30 de atuação para mulheres. Criar o método abstrato salário que retorna quanto o professor recebe. 
 
Criar a classe professor Dedicação Exclusiva que herda de professor e recebe um salário fixo; 
 
Criar a classe professor Horista que recebe um valor por hora trabalhada; 
 
Criar a classe professor Visitante que herda de horista e tem o nome da faculdade que ele está vinculado. 
 
Criar a classe testaProfessor que contem uma coleção de professores. Insira professores de todos os tipos e percorra
esta coleção mostrando o nome e salário de cada um deles. 
*/
public abstract class professor {
    private int matricula;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String dataContrato;

    Date date = new Date();
    ZoneId timeZone = ZoneId.systemDefault();
    LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
    
    public professor(int matricula,String nome,String sexo,String dataNascimento,String dataContrato) {
        setMatricula(matricula);
        setNome(nome);
        setSexo(sexo);
        setDataNascimento(dataNascimento);
        setDataContrato(dataContrato);
        anosAposentar();
    }

    public String getNome() {
        return nome;
    }
    public String getDataContrato() {
        return dataContrato;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getSexo() {
        return sexo;
    }

    private void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }
    private void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public abstract int retornaSalario();

    public String anosAposentar(){
        int idade = (getLocalDate.getYear()) - (Integer.parseInt(dataNascimento.substring(0, dataNascimento.indexOf('/'))));
        int anosDeTrabalho = (getLocalDate.getYear()) - Integer.parseInt(dataContrato.substring(0,dataContrato.indexOf('/')));

        if(getSexo().equals("M")){
            if(idade >= 65 && anosDeTrabalho >= 35){
                return "Voce ja pode aposentar !";
            }else{
                return "Falta "+ (65 - idade) + " Anos de idade e "+((35 - anosDeTrabalho > 0)?35 - anosDeTrabalho: 0)+" anos de trabalho!";
            }
        }else if(getSexo().equals("F")){
            if(idade >= 60 && anosDeTrabalho >= 30){
                return "Voce ja pode aposentar";
            }else{
                return "Falta "+ (60 - idade) + " Anos de idade e "+((30 - anosDeTrabalho > 0)?30 - anosDeTrabalho: 0) + " anos de trabalho!";
            }
        }
        return "";
    }
}

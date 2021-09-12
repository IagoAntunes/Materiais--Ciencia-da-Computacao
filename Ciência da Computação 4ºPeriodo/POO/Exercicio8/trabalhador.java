package Exercicio8;

public class trabalhador {
    

    private Integer matricula;
    private String nome;
    private Double salario;


    public void trabalhador(Integer matricula,String nome,Double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        if(salario < 1100){
            this.salario = 1100.00;
        }else{
            this.salario = salario;
        }
    }







}

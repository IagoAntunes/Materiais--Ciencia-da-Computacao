package ExercicioInicial.Exercicio1;

public class trab {
    
    public Integer matricula;
    public String nome;
    public Double salario;

    public void iniciar(){
        this.matricula = 0;
        this.nome = " ";
        this.salario = 1200.00;
    }


    public void setTudo(Integer matricula , String nome, Double salario){
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
        this.salario = salario;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public Double getSalario(){
        return this.salario;
    }
    public String printar(){
        return ("Matricula: "+getMatricula() +
        "\nNome: " + getNome() +
        "\nSalario: "+ getSalario());
    }
}

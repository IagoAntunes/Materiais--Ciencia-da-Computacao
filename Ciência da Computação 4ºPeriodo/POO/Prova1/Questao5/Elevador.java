package Prova1.Questao5;

import Exercicio4.pessoa;

public class Elevador {
    //Variaveis
    public int andarAtual;
    public int totalAndares;
    public int capacidadeElevador;
    public int pessoasElevador;
    //Metodos
    public Elevador(int capacidadeElevador,int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;

        this.andarAtual = 0;
        this.pessoasElevador = 0;
    }
    public void Entra(){
        if(getPessoasElevador() < this.capacidadeElevador){
            this.pessoasElevador ++;
        }
    }
    public void Sai(){
        if(getPessoasElevador() >= 1){
            this.pessoasElevador --;
        }
    }
    public void Sobe(){
        if(getAndarAtual() < this.totalAndares){
            this.andarAtual ++;
        }
    }
    public void Desce(){
        if(getAndarAtual() >= 1){
            this.andarAtual --;
        }
    }
    //Outros
    public String Mensagem(){
        return ("Andar Atual: "+getAndarAtual()+"\nTotal de Andares: "+getTotalAndares()+"\nCapacidadeElevador: "+getCapacidadeElevador()+"\nPessoas no Elevador: "+getPessoasElevador()+"\n\n\n\n\n");
    }
    //Get
    public int getTotalAndares(){
        return this.totalAndares;
    }
    public int getCapacidadeElevador(){
        return this.capacidadeElevador;
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public int getPessoasElevador() {
        return pessoasElevador;
    }
    //Set
    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
    }
    public void setCapacidadeElevador(int capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }
    public void setAndarAtual(int andarAtual){
        this.andarAtual = andarAtual;
    }
    public void setPessoaElevador(int pessoasElevador){
        this.pessoasElevador = pessoasElevador;
    }

}

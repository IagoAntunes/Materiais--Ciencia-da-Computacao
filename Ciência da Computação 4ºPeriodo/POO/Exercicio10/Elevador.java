package Exercicio10;

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


    public void Entra(){//ok
        if(getPessoasElevador() < this.capacidadeElevador){
            this.pessoasElevador ++;
        }
    }
    public void Entra(int people){//ok
        if(getPessoasElevador() < this.capacidadeElevador){
            this.pessoasElevador = people;
        }
    }
    
    public void Sai(){//ok
        if(getPessoasElevador() >= 1){
            this.pessoasElevador --;//IAGO ANTUNES FERREIRA 
        }
    }
    public void Sai(int people){//ok
        if(getPessoasElevador() >= 1){
            this.pessoasElevador = people; 
        }
    }
    
    public void Sobe(int floors){//ok
        if(getAndarAtual() < this.totalAndares && getPessoasElevador() > 0){
            this.andarAtual = floors;
        }
    }
    public void Sobe(){//ok
        if(getAndarAtual() < this.totalAndares && getPessoasElevador() > 0){
            this.andarAtual ++;
        }
    }
    
    public void Desce(){//ok
        if(getAndarAtual() >= 1 && getPessoasElevador() > 0){
            this.andarAtual --;
        }
    }
    public void Desce(int floors){//ok
        if(getAndarAtual() >= 1 && getPessoasElevador() > 0){
            this.andarAtual = floors;//IAGO ANTUNES FERREIRA 
        }//IAGO ANTUNES FERREIRA 
    }
    //Outros
    public String Mensagem(){
        return ("Andar Atual: "+getAndarAtual()
        +"\nTotal de Andares: "+getTotalAndares()
        +"\nCapacidadeElevador: "+getCapacidadeElevador()
        +"\nPessoas no Elevador: "+getPessoasElevador()+"\n\n\n\n\n");
    }
    //Get
    public int getTotalAndares(){
        return this.totalAndares;
    }
    public int getCapacidadeElevador(){
        return this.capacidadeElevador;//IAGO ANTUNES FERREIRA 
    }//IAGO ANTUNES FERREIRA 
    public int getAndarAtual() {
        return andarAtual;
    }
    public int getPessoasElevador() {
        return pessoasElevador;
    }
    //Set//IAGO ANTUNES FERREIRA 
    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
    }
    public void setCapacidadeElevador(int capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }
}

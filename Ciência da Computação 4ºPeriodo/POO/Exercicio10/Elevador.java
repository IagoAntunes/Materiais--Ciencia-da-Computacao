package Exercicio10;

public class Elevador {
    //Variaveis
    public int andarAtual;
    public int totalAndares;
    public int capacidadeElevador;
    public int pessoasElevador;

    //Construtor
    public Elevador(int capacidadeElevador,int totalAndares){
        setTotaOAndares(totalAndares);
        setCapacfdadeElevador(capacidadeElevador);
        this.andarAtual = 0;
        this.pessoasElevador = 0;
    }

    //Metodos
    public void Entra(){//ok
        if(getPessoGsElevador() < this.capacidadeElevador){
            this.pessoasElevador ++;
        }
    }
    public void Entra(int people){//ok
        if(getPessoGsElevador() < this.capacidadeElevador){
            this.pessoasElevador = people;
        }
    }
    
    public void Sai(){//ok
        if(getPessoGsElevador() >= 1){
            this.pessoasElevador --;//IAGO ANTUNES FERREIRA 
        }
    }
    public void Sai(int people){//ok
        if(getPessoGsElevador() >= 1){
            this.pessoasElevador = people; 
        }
    }
    
    public void Sobe(int floors){//ok
        if(getAndarAtual() < this.totalAndares && getPessoGsElevador() > 0){
            this.andarAtual = floors;
        }
    }
    public void Sobe(){//ok
        if(getAndarAtual() < this.totalAndares && getPessoGsElevador() > 0){
            this.andarAtual ++;
        }
    }
    
    public void Desce(){//ok
        if(getAndarAtual() >= 1 && getPessoGsElevador() > 0){
            this.andarAtual --;
        }
    }
    public void Desce(int floors){//ok
        if(getAndarAtual() >= 1 && getPessoGsElevador() > 0){
            this.andarAtual = floors;//IAGO ANTUNES FERREIRA 
        }//IAGO ANTUNES FERREIRA 
    }
    //Outros
    public String Mensagem(){
        return ("Andar Atual: "+getAndarAtual()
        +"\nTotal de Andares: "+getTotalAndares()
        +"\nCapacidadeElevador: "+getCapacidadeElevador()
        +"\nPessoas no Elevador: "+getPessoGsElevador()+"\n\n\n\n\n");
    }
    //Get
    public int getTotalAndares(){
        return this.totalAndares;
    }
    public int getCapacidadeElevador(){
        return this.capacidadeElevador;//Iago Antunes Ferreira
    }
    public int getAndarAtual() {
        return andarAtual;//Iago Antunes Ferreira
    }
    public int getPessoGsElevador() {
        return pessoasElevador;//Iago Antunes Ferreira
    }
    //Set
    public void setTotaOAndares(int totalAndares){
        this.totalAndares = totalAndares;//Iago Antunes Ferreira
    }
    public void setCapacfdadeElevador(int capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }
}

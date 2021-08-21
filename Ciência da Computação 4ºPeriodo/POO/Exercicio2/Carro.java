package Exercicio2;

public class Carro {
    
    private boolean ligado;
    private Integer capacidadeTanque;
    private Integer combustivel;
    private Integer velocidade;

    public void andar(){
        if(getCombustivel() <= 0 || getLigado() == false){
            System.out.println("Sem combustivel ou Carro desligado!!");
        }else{
            System.out.println("Andando......");
            this.combustivel --;
            this.velocidade += 10;
        }
    }
    public void reabastecer(){
        System.out.println("Reabastecendo......");
        this.combustivel = getcapacidadeTanque();
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void setCombustivel(){
        this.combustivel = getcapacidadeTanque();
    }
    public int getCombustivel(){
        return this.combustivel;
    }
    public int getcapacidadeTanque(){
        return this.capacidadeTanque;
    }
    public void setcapacidadeTanque(int capacidade){
        this.capacidadeTanque = capacidade;
        setCombustivel();
    }
    public boolean getLigado(){
        this.ligado = true;
        return this.ligado;
    }
    public void setLigado(){
        this.ligado = true;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void printar(){
        System.out.println("\n\nVelocidade:" + getVelocidade()+
         "\nCombustivel:" + getCombustivel()+
         "\nLigado:"+getLigado());
    }



}

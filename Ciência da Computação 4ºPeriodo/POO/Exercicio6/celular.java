package Exercicio6;
import java.util.Random;

public class celular {
    

    private String modelo;
    private Integer nivelBateria;
    private Boolean ligado;
    private Integer som;


    public void celular(String modelo, Integer nivelBateria, Integer som){
        setModelo(modelo);
        setNivelBateria(nivelBateria);
        setLigado(false);
        setSom(som);
    }
    //Set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setNivelBateria(Integer nivelBateria){
        this.nivelBateria = nivelBateria;
    }
    public void setLigado(Boolean ligado){
        this.ligado = ligado;
    }
    public void setSom(Integer som){
        this.som = som;
    }
    //Get
    public String getModelo(){
        return this.modelo;
    }
    public Integer getNivelBateria(){
        return this.nivelBateria;
    }
    public Boolean getLigado(){
        return this.ligado;
    }
    public Integer getSom(){
        return this.som;
    }
    //Funcoes
    public void carregarCelular(){
        if(getNivelBateria() < 100){
            this.nivelBateria = 100;
        }else{
            System.out.println("BATERIA CHEIA");
        }



    }
    public void aumentaSom(){
        if(bateria() == 1 || getLigado() == false){
            System.out.println("Celular desligado...");
        }else{
            if(getSom() >= 100){
                System.out.println("SOM MAXIMO");
            }else{
                this.som ++;
            }
        }
    }
    public void diminuiSom(){
        if(bateria() == 1 || getLigado() == false){
            System.out.println("Celular desligado...");
        }else{
            if(getSom() <= 0 ){
                System.out.println("SOM MINIMO");
            }else{
                this.som --;
            }
        }
    }
    public void Ligar(){
        if(getLigado() == true){
            System.out.println("Telefone Ligado");
        }else{
            this.ligado = true;
        }
    }
    public void Desligar(){
        if(getLigado() == false){
            System.out.println("TELEFONE DESLIGADO");
        }else{
            this.ligado = false;
        }
    }
    public String Jogar(Integer escolha){
        if(bateria() == 1 || getLigado() == false){
            return "Celular desligado...";
        }else{
            Random gerador = new Random();
            Integer num = gerador.nextInt(100);
            this.nivelBateria -=10;
            if(num % 2 == 0){
                if(escolha == 0){
                    return "Você Acertou!!" + num;
                }
            }else{
                if(escolha == 1){
                    return "Voce Acertou!!" + num;
                }
            }
            return "Você Errou...." + num;
        }
    }

    //Outros
    public Integer bateria(){
        if(getNivelBateria() <= 0){
            return 1;
        }
        return 0;
    }
    public String printar(){
        return "\nModelo:"+getModelo()+
        "\nNivel Bateria:"+getNivelBateria()+
        "\nLigado:"+getLigado()+
        "\nSom:"+getSom();



    }

}

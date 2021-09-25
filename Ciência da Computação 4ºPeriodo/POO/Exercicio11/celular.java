package Exercicio11;
import java.util.Random;

public class celular {
    
    private String modelo;
    private Integer nivelBateria;
    private Boolean ligado;
    private Integer som;
    private static int nInstancias = 0;
    private static Integer idCelular;

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
    //Funcoes//IAGO ANTUNES FERREIRA 
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
        }else{//IAGO ANTUNES FERREIRA 
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
            Integer num = gerador.nextInt(3);
            this.nivelBateria -=10;
            if(escolha == num){
                return "Empate";
            }else if(escolha == 0 && num == 1){
                return "Voce Perdeu !!";
            }else if(escolha == 0 && num == 2){
                return "Voce Ganhou !!";
            }else if(escolha == 1 && num == 0){
                return "Voce Ganhou !!";
            }else if(escolha == 1 && num == 2){
                return "Voce Perdeu !!";
            }else if(escolha == 2 && num == 0){
                return "Voce Perdeu !!";
            }else if(escolha == 2 && num == 1){
                return "Voce ganhou !!";
            }
            return "osh";
        }
    }
    
    public Integer mostraQtdeCelulares(){
        return this.nInstancias;
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

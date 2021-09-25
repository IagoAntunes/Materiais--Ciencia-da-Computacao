package Exercicio11;
import java.util.Random;

public class celular_2 {
    
    private String model;
    private Integer battery_level;
    private Boolean connected;
    private Integer sound;
    private static int nInstancias=0 ;
    private static Integer idCellphone=0;

    public void celular(String model, Integer battery_level, Integer sound){
        setmodel(model);
        setbattery_level(battery_level);
        setconnected(false);
        setsound(sound);

        idCellphone += 1;//Coloca id celular
        nInstancias ++;//Calcula numero instancias
    }
    //Set
    public void setmodel(String model){
        this.model = model;
    }
    public void setbattery_level(Integer battery_level){
        this.battery_level = battery_level;
    }
    public void setconnected(Boolean connected){
        this.connected = connected;
    }
    public void setsound(Integer sound){
        this.sound = sound;
    }
    //Get
    public String getmodel(){
        return this.model;
    }
    public Integer getbattery_level(){
        return this.battery_level;
    }
    public Boolean getconnected(){
        return this.connected;
    }
    public Integer getsound(){
        return this.sound;
    }
    //Functions//IAGO ANTUNES FERREIRA 
    public void carregarCelular(){
        if(getbattery_level() < 100){
            this.battery_level = 100;
        }else{
            System.out.println("FULL BATTERY");
        }
    }
    public void aumentasound(){
        if(bateria() == 1 || getconnected() == false){
            System.out.println("Celphone desconnected...");
        }else{//IAGO ANTUNES FERREIRA 
            if(getsound() >= 100){
                System.out.println("sound max");
            }else{
                this.sound ++;
            }
        }
    }
    public void diminuisound(){
        if(bateria() == 1 || getconnected() == false){
            System.out.println("Celphone desconnected...");
        }else{
            if(getsound() <= 0 ){
                System.out.println("sound MIN");
            }else{
                this.sound --;
            }
        }
    }
    public void Ligar(){
        if(getconnected() == true){
            System.out.println("Cellphone connected");
        }else{
            this.connected = true;
        }
    }
    public void Desligar(){
        if(getconnected() == false){
            System.out.println("Cellphone desconnected");
        }else{
            this.connected = false;
        }
    }
    public String Jogar(Integer choice){
        if(bateria() == 1 || getconnected() == false){
            return "Cellphone desconnected or Low Battery";
        }else{
            Random gerador = new Random();
            Integer num = gerador.nextInt(3);
            this.battery_level -=10;
            if(choice == num){
                return "Empate";
            }else if(choice == 0 && num == 1){
                return "You Lose !! "+choice+" vs "+num ;
            }else if(choice == 0 && num == 2){
                return "You Won !! "+choice+" vs "+num ;
            }else if(choice == 1 && num == 0){
                return "You Won !! "+choice+" vs "+num ;
            }else if(choice == 1 && num == 2){
                return "You Lose !! "+choice+" vs "+num ;
            }else if(choice == 2 && num == 0){
                return "You Lose !! "+choice+" vs "+num ;
            }else if(choice == 2 && num == 1){
                return "You Won !! "+choice+" vs "+num ;
            }
            return "osh";
        }
    }
    
    public static Integer mostraQtdeCelulares(){
        return nInstancias;
    }
    //Outhers
    public Integer bateria(){
        if(getbattery_level() <= 0){
            return 1;
        }
        return 0;
    }
    public String printar123(){
        return "\nmodel:"+getmodel()+
        "\nNivel Bateria:"+getbattery_level()+
        "\nconnected:"+getconnected()+
        "\nsound:"+getsound();
    }
}

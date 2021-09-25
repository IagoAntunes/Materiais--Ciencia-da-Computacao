package Exercicio9;

public class Moeda {
    
    public static Double real = 1.00;
    public static Double dolar = 5.34;

    public Double getDolar() {
        return dolar;
    }
    public Double getReal() {
        return real;
    }
    public static Double conversao(int money,int id ){
        if(id == 1)
            return money / dolar;
        else if(id == 2){
            return money * dolar;
        }
        return 0.0;
    }


}

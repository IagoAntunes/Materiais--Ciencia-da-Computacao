package Exercicio9;

public class Moeda {

    public static Double dolar = 5.34;

    public static Double realTOdolar(int money){
        return money / dolar;
    }
    public static Double dolarTOreal(int money){
        return money * dolar;
    }
}

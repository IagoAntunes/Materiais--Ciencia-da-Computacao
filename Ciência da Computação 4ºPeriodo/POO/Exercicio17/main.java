package Exercicio17;

public class main {
    public static void main(String args[]) { 
        int dinheiro = 20,precoTamagochis=12,qtdTamagochis = 0;
        while(dinheiro - precoTamagochis >= 0){
            dinheiro = dinheiro - precoTamagochis;
            qtdTamagochis++;
            if(precoTamagochis != 1)precoTamagochis--;
        }
        System.out.println("Voce comprou "+ qtdTamagochis + " e sobrou " + dinheiro + "reais");
    }
}


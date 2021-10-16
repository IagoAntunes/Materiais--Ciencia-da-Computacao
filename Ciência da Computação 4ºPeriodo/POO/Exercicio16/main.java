package Exercicio16;
import java.util.Random;

public class main {
    public static void main(String args[]) { 
        Random gerador = new Random();

        String[] numeros = new String[7];
        int[] vetor = new int[7];

        int numero = 0;
        vetor[0] = 7;
        int total = 0;
        String comparar;
        do{
            for(int i =1;i<=6;i++){
                do{
                    numero = gerador.nextInt(2);
                    if(vetor[i-1] != numero){ 
                        vetor[i] = numero;
                    }
                }while(vetor[i-1] == numero);
                
            }
            comparar = "" +vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6];
            for(int j =1;j<=6;j++){
                int diferente;
                if(!comparar.equals(numeros[j])){
                    numeros[total] = comparar;
                    
                }
            }
            total++;

            
        }while(total < 6);
        for(int i = 1;i<=6;i++){
            System.out.println(numeros[i]);
        }

    }
}


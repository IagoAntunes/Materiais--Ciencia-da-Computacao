package Exercicio12;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class main {
    
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int[] vetor = new int[100];
        int maior=0;
        

        for(int i =0;i<vetor.length;i++){
            vetor[i] = gerador.nextInt(100);
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println("Maior numero e: "+maior);





    }
}

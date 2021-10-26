package Exercicio23;

import java.util.Random;
import java.util.Arrays;

public class main
{
    public static void main(String[] args) {
        //Iago Antunes Ferreira
        int[] vetor = new int[10];//Vetor
        Random random = new Random();//Random
        for(int i=0;i<10;i++){
             vetor[i]=random.nextInt(100);//Entre 0 e 100
        }
        //Antes de Ordenar
        for(int a: vetor){
            System.out.print(a+" ");
        }
        Arrays.sort(vetor);
        System.out.println("\n\n");
        //Depois de Ordenar
        for(int a: vetor)
            System.out.print(a+" ");
        }
}
import java.util.Scanner;
import java.util.Random;
public class Exercicio04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		
        int tam = input.nextInt();

        int[] vetor = new int[tam];

        System.out.println("Opcao");
        int opcao = input.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Crescente");
                Crescente(vetor);break;
            case 2:
                System.out.println("Decrescente");
                Decrescente(vetor);
                break;
            case 3:
                System.out.println("Aleatorio");
                Aleatorio(vetor);
                break;
        }
        for(int i =0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }

    public static void Crescente(int[] vetor){
        Scanner input = new Scanner(System.in);
        for(int i =0;i<vetor.length;i++){
            vetor[i] = input.nextInt();
        }
    }
    public static void Decrescente(int[] vetor){
        Scanner input = new Scanner(System.in);
        for(int i = vetor.length-1;i>=0;i--){
            vetor[i] = input.nextInt();
        }
    }
    public static void Aleatorio(int[] vetor){
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);
        for(int i =0;i<vetor.length;i++){
            int pos = gerador.nextInt(vetor.length-1);
            if(vetor[pos] == null){

            }
            vetor[pos] = input.nextInt();
        }
    }



}
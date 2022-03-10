package Exercicio05;
import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] vetorT1 = new int[50];
        int[] vetorT2 = new int[500];
        int[] vetorT3 = new int[5000];

        Crescente(vetorT1, vetorT2, vetorT3);
        LimparVetor(vetorT1, vetorT2, vetorT3);
        DeCrescente(vetorT1, vetorT2, vetorT3);
        LimparVetor(vetorT1, vetorT2, vetorT3);
        Aleatorio(vetorT1, vetorT2, vetorT3);
    }
    //Preenchendo vetor
    public static void Crescente(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        for (int i = 0; i < 50; i++) {
            vetorT1[i] = i;
        }
        for (int i = 0; i < 500; i++) {
            vetorT2[i] = i;
        }
        for (int i = 0; i < 5000; i++) {
            vetorT3[i] = i;
        }
        System.out.println("----------------------------------------------");
        System.out.println("\t---CRESCENTE---:");
        Comparacao(vetorT1, vetorT2, vetorT3);
    }
    public static void DeCrescente(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        for (int i = 50 - 1; i >= 0; i--) {
            vetorT1[i] = i;
        }
        for (int i = 500 - 1; i >= 0; i--) {
            vetorT2[i] = i;
        }
        for (int i = 5000 - 1; i >= 0; i--) {
            vetorT3[i] = i;
        }
        System.out.println("----------------------------------------------");
        System.out.println("\t-----DECRESCENTE----:");
        Comparacao(vetorT1, vetorT2, vetorT3);
        //Iago Antunes Ferreira
    }
    public static void Aleatorio(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        Random gerador = new Random();
        int aux;
        boolean cond = true;
        for (int i = 0; i < 50; i++) {
            aux = gerador.nextInt(199);
            if(vetorT1[i] == 0){
                vetorT1[i] = aux;
            }
            else {
                while (cond) {
                    aux = gerador.nextInt(199);
                    if (vetorT1[i] == 0) {
                        vetorT1[i] = aux;
                        cond = false;
                    }
                }
            }
        }
        for (int i = 0; i < 500; i++) {
            aux = gerador.nextInt(199);
            if(vetorT2[i] == 0){
                vetorT2[i] = aux;
            }
            else {
                while (cond) {
                    aux = gerador.nextInt(199);
                    if (vetorT2[i] == 0) {
                        vetorT2[i] = aux;
                        cond = false;
                    }
                }
            }
        }
        for (int i = 0; i < 5000; i++) {
            aux = gerador.nextInt(199);
            if(vetorT3[i] == 0){
                vetorT3[i] = aux;
            }
            else {
                while (cond) {
                    aux = gerador.nextInt(199);
                    if (vetorT3[i] == 0) {
                        vetorT3[i] = aux;
                        cond = false;
                    }
                }
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("\t-----ALEATORIO----:");
        Comparacao(vetorT1, vetorT2, vetorT3);

    }

    //Comparações
    public static void Comparacao(int[] vetorT1, int[] vetorT2, int[] vetorT3){
        int count = 0;
        long startTime = 0;
        long endTime = 0;

        //#region
        startTime = System.nanoTime();
        for (int i = 0; i < 50; i++) {
            if (vetorT1[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime(); 

        System.out.println("Qtd Comparacao50:  " + count );
        long timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        pesquisarNumero(78, vetorT1);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            if (vetorT2[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime();
        //Iago Antunes Ferreira
        System.out.println("Qtd Comparacao500:  " + count ); 
        timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        pesquisarNumero(78, vetorT2);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            if (vetorT3[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime();

        System.out.println("Qtd Comparacao5000:  " + count ); 
        timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        pesquisarNumero(78, vetorT3);
        //#endregion
    }
    /*
    public static void ComparacaoDecr(int[] vetorT1, int[] vetorT2, int[] vetorT3){
        int count = 0;
        long startTime = 0;
        long endTime = 0;

        //#region
        startTime = System.nanoTime();
        for (int i = 50-1; i >= 0; i--) {
            if (vetorT1[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime(); 

        System.out.println("Qtd Comparacao50:  " + count );
        long timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.nanoTime();
        for (int i = 500-1; i >= 0; i--) {
            if (vetorT2[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime();

        System.out.println("Qtd Comparacao500:  " + count ); 
        timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.nanoTime();
        for (int i = 5000-1; i >= 0; i--) {
            if (vetorT3[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.nanoTime();

        System.out.println("Qtd Comparacao5000:  " + count ); 
        timeElapsed = endTime - startTime;
        System.out.printf("\tTempo em nano: %d\n" , timeElapsed);
        //#endregion
    }
    */
    public static void pesquisarNumero(int x, int[] numeros) {
        int inicio = 0;         //Posição inicial do vetor.
        int meio = 0;          //Posição do meio do vetor.
        int fim = numeros.length - 1;  //Posição final do vetor.
        System.out.println("\tPesquisa Binaria");
        long startTime = System.nanoTime();
        while(inicio <= fim) {
          meio = (fim + inicio) / 2; 
          
          if(numeros[meio] == x) {
            System.out.println("\t\tEncontrou o número " + x);
            break;
          }

          if(numeros[meio] < x) {
            inicio = meio + 1;
          } else {
            fim = meio - 1;
          }
        }
        long endTime = System.nanoTime();
        System.out.printf("\t\tTempo em nano: %d\n" , endTime - startTime);
    }
        //Iago Antunes Ferreira

    //Limpar vetor
    public static void LimparVetor(int[] vetorT1, int[] vetorT2, int[] vetorT3){
        for(int i =0;i<50;i++){
            vetorT1[i] = 0;
        }
        for(int i =0;i<500;i++){
            vetorT2[i] = 0;
        }
        for(int i =0;i<5000;i++){
            vetorT3[i] = 0;
        }
    }

}

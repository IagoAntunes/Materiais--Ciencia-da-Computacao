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
        for (int i = 0; i < 50; i++) {
            vetorT1[i] = 50 - i;
        }
        for (int i = 0; i < 500; i++) {
            vetorT2[i] = 500 - i;
        }
        for (int i = 0; i < 5000; i++) {
            vetorT3[i] = 5000 - i;
        }
        System.out.println("----------------------------------------------");
        System.out.println("\t-----DECRESCENTE----:");
        Comparacao(vetorT1, vetorT2, vetorT3);
        //Iago Antunes Ferreira
    }
    public static void Aleatorio(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        Random gerador = new Random();
        gerador.setSeed(3);
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
        String resultString;
        Long result2;

        //#region
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            if (vetorT1[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.currentTimeMillis();
        result2 = endTime - startTime;
        resultString = Long.toString(result2);
        System.out.println("Qtd Comparacao50:  " + count );
        System.out.printf("\t\t Inicio Milisegundos: %d \n" , startTime);
        System.out.printf("\t\t Fim Milisegundos: %d \n" , endTime);
        System.out.println("\t\t Result Milisegundos:"+ resultString);
        pesquisarNumero(78, vetorT1);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            if (vetorT2[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.currentTimeMillis();
        result2 = endTime - startTime;
        resultString = Long.toString(result2);
        //Iago Antunes Ferreira
        System.out.println("Qtd Comparacao500:  " + count ); 
        System.out.printf("\t\t Inicio Milisegundos: %d \n" , startTime);
        System.out.printf("\t\t Fim Milisegundos: %d \n" , endTime);
        System.out.println("\t\t Result Milisegundos:"+ resultString);
        pesquisarNumero(78, vetorT2);
        //#endregion
        count = 0;
        startTime = 0;
        endTime = 0;
        //#region
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            if (vetorT3[i] == 78) {
                break;
            }
            count++;
        }
        endTime = System.currentTimeMillis();
        result2 = endTime - startTime;
        resultString = Long.toString(result2);
        System.out.println("Qtd Comparacao5000:  " + count ); 
        System.out.printf("\t\t Inicio Milisegundos: %d \n" , startTime);
        System.out.printf("\t\t Fim Milisegundos: %d \n" , endTime);
        System.out.println("\t\t Result Milisegundos:"+ resultString);
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
        boolean isDesc = true;
        int count = 0;
        System.out.println("\tPesquisa Binaria");
        long startTime = System.currentTimeMillis();
        while(inicio <= fim) {
          meio = (fim + inicio) / 2; 
          count++;
          if(numeros[meio] == x) {
            System.out.println("\t\tEncontrou o número " + x);
            break;
          }

          int maior = numeros[0];
          for(int i =1;i<numeros.length;i++){
              if(numeros[i] > maior ){
                  isDesc = false;
                  break;
              }
          }

            if(!isDesc){
                if(numeros[meio] < x) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }else if(isDesc){
                if(numeros[meio] > x) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long r = (endTime - startTime);
        String result = Long.toString(r);
        System.out.println("\t\t Qtd Comparacao: " + count);
        System.out.printf("\t\t Inicio Milisegundos: %d \n" , startTime);
        System.out.printf("\t\t Fim Milisegundos: %d \n" , endTime);
        System.out.println("\t\t Result Milisegundos:"+ result);
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

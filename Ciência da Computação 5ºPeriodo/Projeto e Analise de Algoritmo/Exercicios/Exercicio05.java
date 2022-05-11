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

    // Preenchendo vetor
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
        Comparacao(vetorT1, vetorT2, vetorT3,"cresc");
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
        Comparacao(vetorT1, vetorT2, vetorT3,"decre");
        // Iago Antunes Ferreira
    }
    public static void Aleatorio(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        Random gerador = new Random();
        gerador.setSeed(3);

        for (int i = 0; i < 50; i++) {
            vetorT1[i] = gerador.nextInt(199);
        }
        for (int i = 0; i < 500; i++) {
            vetorT2[i] = gerador.nextInt(199);
        }
        for (int i = 0; i < 5000; i++) {
            vetorT3[i] = gerador.nextInt(199);
        }
        System.out.println("----------------------------------------------");
        System.out.println("\t-----ALEATORIO----:");
        Comparacao(vetorT1, vetorT2, vetorT3,"aleat");
    }

    // Comparações
    public static void Comparacao(int[] vetorT1, int[] vetorT2, int[] vetorT3,String tipo) {
        int count = 0;
        long inicioTempo = 0;
        long fimTempo = 0;

        // #region Tam = 50
        inicioTempo = System.nanoTime();
        for (int i = 0; i < 50; i++) {
            if (vetorT1[i] == 78) {
                break;
            }
            count++;
        }
        fimTempo = System.nanoTime();
        System.out.println("Qtd Comparacao50:  " + count);
        Imprimir(inicioTempo, fimTempo);
        if(tipo != "aleat")
            PesqBinaria(78, vetorT1);
        // #endregion
        count = 0;
        inicioTempo = 0;
        fimTempo = 0;
        // #region Tam = 500
        inicioTempo = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            if (vetorT2[i] == 78) {
                break;
            }
            count++;
        }
        fimTempo = System.nanoTime();
        System.out.println("Qtd Comparacao500:  " + count);
        Imprimir(inicioTempo, fimTempo);
        if(tipo != "aleat")
            PesqBinaria(78, vetorT2);
        // #endregion
        count = 0;
        inicioTempo = 0;
        fimTempo = 0;
        // #region TaM = 5000
        inicioTempo = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            if (vetorT3[i] == 78) {
                break;
            }
            count++;
        }
        fimTempo = System.nanoTime();
        System.out.println("Qtd Comparacao5000:  " + count);
        Imprimir(inicioTempo, fimTempo);
        if(tipo != "aleat")
            PesqBinaria(78, vetorT3);
        // #endregion
    }
    public static void PesqBinaria(int x, int[] numeros) {
        int inicio = 0; // Posição inicial do vetor.
        int meio = 0; // Posição do meio do vetor.
        int fim = numeros.length - 1; // Posição final do vetor.
        boolean isDesc = true;
        int count = 0;
        long inicioTempo = 0;
        long fimTempo = 0;
        System.out.println("\t\tPesquisa Binaria....");
        inicioTempo = System.nanoTime();
        long result = 0;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            count++;
            if (numeros[meio] == x) {
                break;
            }
            int maior = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    isDesc = false;
                    break;
                }
            }
            if (!isDesc) {
                if (numeros[meio] < x) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            } else if (isDesc) {
                if (numeros[meio] > x) {
                    inicio = meio + 1;
                }else {
                    fim = meio - 1;
                }
            }
        }
        fimTempo = System.nanoTime();
        result = fimTempo - inicioTempo;
        System.out.println("\t\t\tQtd Comparacao5000:  " + count);
        System.out.printf("\t\t\t Inicio NanoSegundos: %d \n", inicioTempo);
        System.out.printf("\t\t\t Fim NanoSegundos: %d \n", fimTempo);
        System.out.println("\t\t\t Result NanoSegundos:" + result);
    }
    // Iago Antunes Ferreira

    // Outros
    public static void LimparVetor(int[] vetorT1, int[] vetorT2, int[] vetorT3) {
        for (int i = 0; i < 50; i++) {
            vetorT1[i] = 0;
        }
        for (int i = 0; i < 500; i++) {
            vetorT2[i] = 0;
        }
        for (int i = 0; i < 5000; i++) {
            vetorT3[i] = 0;
        }
    }
    public static void Imprimir(long inicioTempo, long fimTempo) {
        long result = fimTempo - inicioTempo;
        System.out.printf("\t\t Inicio NanoSegundos: %d \n", inicioTempo);
        System.out.printf("\t\t Fim NanoSegundos: %d \n", fimTempo);
        System.out.println("\t\t Result NanoSegundos:" + result);
    }

}


/*  ##################################### #####################################
      Crescente   Decrescent   Aleatorio     Crescente   Decrescent   Aleatorio
    ##################################### ##################################### 
    #           #            #           # #           #           #           #
    #  50       #   50       #  50       # # 6         #  5        #           #
    #  0,0014   #   0,0036   #  0,0072   # # 0,0018    #  0,0015   #    X      #
    #           #            #           # #           #           #           #
    ##################################### ##################################### 
    #           #            #           # #           #           #           #
    #  78       #  422       #  500      # # 8         #  9        #           #             
    #  0,0016   #  0,0416    #  0,0431   # # 0,0019    #  0,0021   #    X
    #           #            #           # #           #           #           #
    ##################################### #####################################      
    #           #            #           # #           #           #           #
    #  78       #  4922       #  191     # # 12        #  12        #          #
    #  0,0016   #  0,4053    #  0,0175   # # 0,0025    #  0,0026   #    X      #
    #           #            #           # #           #           #           #
    ##################################### ##################################### 

*/


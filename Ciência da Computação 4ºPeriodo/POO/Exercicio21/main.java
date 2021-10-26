package Exercicio21;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/*
Questão 2 – 2 pts. Escreva uma classe Principal que possui um array de inteiros de tamanho 10. 
Preencha este vetor com números aleatórios. Após receber os números,
 escreva os mesmos de forma ordenada.
*/
public class main {
    public static void main(String args[]) {
        Random gerador = new Random();
        ArrayList<Integer> teste = new ArrayList<Integer>(10);

        for(int i=1;i<11;i++){
            teste.add(gerador.nextInt(100));
        }
        //Sem ser ordenado
        for(int a : teste){
            System.out.print(a +" ");
        }
        System.out.println("\n");
        Collections.sort(teste);
        //Ordenado
        for(int x : teste){
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}

package ExercicioAvaliativo.Exercicio5;
import java.util.Scanner;
public class main {
    public static void main(String args[]) { 
        mochila mochila = new mochila("Karga", 120.00, 12);

        mochila.inserirItens(50.00);
        mochila.inserirItens(50.00);
        mochila.inserirItens(50.00);
        System.out.println(mochila.situacao());

    }
}


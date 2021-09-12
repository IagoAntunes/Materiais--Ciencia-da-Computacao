package ExercicioAvaliativo.Exercicio3;
import java.util.Scanner;
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);

        Boleto boleto = new Boleto(2018, 2000.00, 10, "Luz");

        boleto.pagar();
        System.out.println(boleto.valorLiquido());


    }
}


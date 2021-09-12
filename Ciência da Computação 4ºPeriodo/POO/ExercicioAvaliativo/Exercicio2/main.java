package ExercicioAvaliativo.Exercicio2;
import java.util.Scanner;
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        Eleitor eleitor = new Eleitor();

        System.out.println("-Eleitores:");
        System.out.println(eleitor.Sistema());

    }


}

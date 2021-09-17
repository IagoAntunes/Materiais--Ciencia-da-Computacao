package ExercicioAvaliativo.Exercicio4;
import java.sql.Time;
import java.util.Scanner;
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do time: ");
        String time1 = input.nextLine();
        System.out.println("Digite a serie:");
        String serie1 = input.nextLine();
        System.out.println("Numero de jogadores:");
        Integer nJogadores1 = input.nextInt();
        time time = new time(time1, serie1,nJogadores1);
        time.mensagem();

        System.out.println("Digite o nome do time: ");
        String time2 = input.nextLine();
        System.out.println("Digite a serie:");
        String serie2 = input.nextLine();
        System.out.println("Numero de jogadores:");
        Integer nJogadores2 = input.nextInt();
        time timedois = new time(time2, serie2, nJogadores2);
        timedois.mensagem();

    }
}

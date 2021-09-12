package ExercicioAvaliativo.Exercicio1;
import java.util.Scanner;
public class main {
    
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);

        trabalhador[] trabalhador = new trabalhador[3];

        System.out.println("-Trabalhadores:");
        for(int i =0;i<3;i++){
            System.out.println("T"+i+" Nome: ");
            trabalhador[i].setNome(input.nextLine());
            System.out.println("T"+i+" Salário: ");
            trabalhador[i].setSalario(input.nextDouble());
            System.out.println("T"+i+" Matricula: ");
            trabalhador[i].setMatricula(input.nextInt());
        }

    }
}

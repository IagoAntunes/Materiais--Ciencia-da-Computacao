package Exercicio8;
import java.util.Scanner;

import ExercicioInicial.Exercicio1.trab;


public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);

        trabalhador[] trabalhador = new trabalhador[3];
        Eleitor eleitor = new eleitor();

        System.out.println("-Trabalhadores:");
        for(int i =0;i<3;i++){
            System.out.println("T"+i+" Nome: ");
            trabalhador[i].setNome(input.nextLine());
            System.out.println("T"+i+" Salário: ");
            trabalhador[i].setSalario(input.nextDouble());
            System.out.println("T"+i+" Matricula: ");
            trabalhador[i].setMatricula(input.nextInt());
        }
        System.out.println("-Eleitores:");
        System.out.println(eleitor.Sistema());

        System.out.println("-Boletos:");



    }
}

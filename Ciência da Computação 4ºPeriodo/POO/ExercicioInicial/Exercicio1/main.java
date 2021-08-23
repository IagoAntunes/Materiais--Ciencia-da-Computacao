package ExercicioInicial.Exercicio1;
import java.util.Scanner;

public class main {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in); 
        trab trab1 = new trab();
        trab trab2 = new trab();
        trab trab3 = new trab();

        //Trabalhador 1
        System.out.println("Nome do Trabalhador: ");
        trab1.setNome(input.nextLine());
        System.out.println("Matricula: ");
        trab1.setMatricula(input.nextInt());
        System.out.println("Salario:");
        trab1.setSalario(input.nextDouble());
        if(trab1.getSalario() < 1200.00){
            trab1.setSalario(1200.00);
        }

        //Trabalhador 2
        System.out.println("\nNome do Trabalhador: ");
        trab2.setNome(input.next());
        System.out.println("Matricula: ");
        trab2.setMatricula(input.nextInt());
        System.out.println("Salario:");
        trab2.setSalario(input.nextDouble());
        if(trab2.getSalario() < 1200.00){
            trab2.setSalario(1200.00);
        }


        //trabalhador 3
        System.out.println("\nNome do Trabalhador: ");
        trab3.setNome(input.next());
        System.out.println("Matricula: ");
        trab3.setMatricula(input.nextInt());
        System.out.println("Salario:");
        trab3.setSalario(input.nextDouble());
        if(trab3.getSalario() < 1200.00){
            trab3.setSalario(1200.00);
        }

        System.out.println("Nome: "+trab1.getNome() +"  Matricula: " + trab1.getMatricula() +"  Salario: " + trab1.getSalario());
        System.out.println("Nome: "+trab2.getNome() +"  Matricula: " + trab2.getMatricula() +"  Salario: " + trab2.getSalario());
        System.out.println("Nome: "+trab3.getNome() +"  Matricula: " + trab3.getMatricula() +"  Salario: " + trab3.getSalario());



    }
}


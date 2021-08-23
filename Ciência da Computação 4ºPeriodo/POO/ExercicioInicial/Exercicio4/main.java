package ExercicioInicial.Exercicio4;

import java.util.Scanner;
public class main {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //Pessoa1
        pessoa1.setNome(input.nextLine());
        pessoa1.setEndereco(input.nextLine());
        pessoa1.setTelefone(input.nextLine());

        //Pessoa2
        pessoa2.setNome(input.nextLine());
        pessoa2.setEndereco(input.nextLine());
        pessoa2.setTelefone(input.nextLine());

        System.out.println(pessoa1.imprimir());
        System.out.println(pessoa2.imprimir());


    }
}

/*
Crie a classe Eleitor com os atributos idade, sexo, nome e numero do título. Faça um 
método que retorne se a pessoa é Obrigada, Desobrigada ou impedida de votar. Crie outra 
classe para testar. 
*/




package ExercicioInicial.Exercicio2;
import java.util.Scanner;
public class main {
    
    public static void main(String args[]){

        eleitor eleitor  = new eleitor();
        Scanner input = new Scanner(System.in); 

        eleitor.setNome(input.nextLine());
        eleitor.setIdade(input.nextInt());
        eleitor.setSexo(input.nextLine());
        eleitor.setNumero(input.nextInt());

        if(eleitor.getIdade() <16){
            System.out.println("Você não pode votar");
        }else if(eleitor.getIdade() < 18){
            System.out.println("Desobrigada a votar");
        }else if(eleitor.getIdade() >= 18){
            System.out.println("Obrigado a votar!!");
        }
    }
}

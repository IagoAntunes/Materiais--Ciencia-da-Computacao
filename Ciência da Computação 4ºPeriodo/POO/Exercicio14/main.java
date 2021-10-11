package Exercicio14;
import java.util.ArrayList;
import java.util.Scanner;
/*
Criar um arraylist de string chamado contatinhos.
Criar um menu para:
inserir contatos
remover contatos pelo nome
mostrar a quantidade de contatos
listar todos contatos
*/

public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        //Iago Antunes Ferreira
        ArrayList<String> contatinhos = new ArrayList<>();
        int opc=0;
        do{
            System.out.println("\n\nOpcoes:");
            opc = input.nextInt();
            switch(opc){

                case 1://Inserir Contatos
                    System.out.println("Adicionar Contato:");
                    contatinhos.add(input.next());
                    break;
                case 2://Remover Contatos
                    System.out.println("Remover contato:");
                    contatinhos.remove(input.next());
                    break; 
                case 3://Mostrar quantidade de contatos
                    System.out.println("Quantidade de contatos:");
                    System.out.println(contatinhos.size());
                    break;
                case 4://Listar todos os contatos
                    System.out.println("Todos Contatos:");
                    for(String x : contatinhos){
                        System.out.println(x);
                    }
                break;
            }
        }while(opc != 9);
    }
}

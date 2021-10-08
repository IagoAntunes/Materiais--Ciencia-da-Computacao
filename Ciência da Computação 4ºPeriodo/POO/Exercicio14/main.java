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

        ArrayList<String> valor = new ArrayList<>();
        int opc;
        do{
            System.out.println("Opcoes");
            opc = input.nextInt();
            switch(opc){

                case 1:
                    System.out.println("Adicionar Contato:");
                    String nome = input.next();
                    valor.add(nome);
                    break;
                case 2:
                    System.out.println("Remover contato;");
                    String nomeRemover = input.next();
                    valor.remove(nomeRemover);
                    break; 
                case 3:
                    System.out.println("Mostrar qtd contatos:");
                    System.out.println(valor.size());
                    break;
                case 4:
                    System.out.println("Todos Contatos:");
                    for(String x : valor){
                        System.out.println(x);
                    }
                break;
                case 9:
                    break;
                
            }
        }while(opc != 9);




    }
}

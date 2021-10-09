package Exercicio15;
import java.util.ArrayList;
import java.util.Scanner;
/*
(feito)Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa
, id autoincremento e também um booleano ativo.

(feiot)Crie uma classe Testa que possui um arrayList de contatos. 

Crie um menu para adicionar, remover, listar, listar inativos,
ativar contato, bloquear contato, buscar por nome, listar por cidade, limpar agenda.

 Obs. Listar, listar por cidade e listar por nome só devem exibir os ativos.
*/
public class Testa {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        int i =0;
        ArrayList<Integer> contatinhos = new ArrayList<>();
        Contato[] contatinhos2 = new Contato[10];
        int opc = 0;
        do{
            System.out.println("\nOpções");
            opc = input.nextInt();
            switch(opc){
                case 1://Adicionar
                    System.out.println("Nome:");
                    String nome = input.next();
                    System.out.println("Telefone:");
                    int telefone = input.nextInt();
                    System.out.println("Cidade:");
                    String cidade = input.next();
                    contatinhos2[i] = new Contato(nome,telefone,cidade);
                    contatinhos.add(contatinhos2[i].idContador);
                    i++;
                    break;

                case 2://Remover
                    System.out.println("Remover Contato:");
                    contatinhos.remove(input.nextInt());
                    break;
                
                case 3://Listar
                    for(int j=0;j<i;j++)
                        System.out.println(contatinhos2[j].toString());
                    break;
                
                case 4://Listar Inativos
                    for(int j=0;j<i;j++){
                        if(contatinhos2[j].getAtivo() == false){
                            System.out.println(contatinhos2[j].toString());
                        }
                    }
                    break;

                case 5://Ativar Contato
                    System.out.println("ID contato:");
                    contatinhos2[input.nextInt()].ativarContato();
                    break;

                case 6://Bloquear Contato
                    break;
                
                case 7://Buscar por nome
                    break;
                
                case 8://Listar por cidade
                    break;

                case 9://Limpar agenda
                    break;
            }

        }while(opc != 9);


    }
}

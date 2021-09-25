package Exercicio10;
import java.util.Scanner;

import Exercicio10.Elevador;
/*
Refazer o exercício do elevador da prova para 
(feito) ele não poder subir ou descer sem pessoas dentro do elevador. 
Modifique as opções para que possa escolher:
(feito)quantos andares subir ou descer
e 
(feito)quantas pessoas irão entrar ou sair 
atravésde sobrecarga.
*/
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        int opc,pessoas,andar;
        System.out.println("Capacidade do Elevador:");
        int capacidadeElevador = input.nextInt();
        System.out.println("Total Andares: ");
        int totalAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeElevador, totalAndares);
        //IAGO ANTUNES FERREIRA 
        do{
            System.out.println("[1]Entrar\n[2]Sair\n[3]Subir\n[4]Descer");
            opc = input.nextInt();
            switch(opc){
                case 1://IAGO ANTUNES FERREIRA 
                    System.out.println("Num pessoas que vai entrar/OU/numero negativo");
                    pessoas = input.nextInt();
                    if(pessoas < 0)elevador.Entra();
                    else{elevador.Entra(pessoas);}
                    break;
                case 2://IAGO ANTUNES FERREIRA 
                    System.out.println("Num pessoas que vai sair/OU/numero negativo");
                    pessoas = input.nextInt();
                    if(pessoas < 0)elevador.Sai();
                    else{elevador.Sai(pessoas);}
                    break;
                case 3://IAGO ANTUNES FERREIRA 
                    System.out.println("Num andares que vai subir/OU/numero negativo");
                    andar = input.nextInt();
                    elevador.Sobe(andar < 0 ? null : andar);
                    if(andar < 0)elevador.Sobe();
                    else elevador.Sobe(andar);
                    break;
                case 4:
                    System.out.println("Num andares que vai descer/OU/numero negativo");
                    andar = input.nextInt();
                    if(andar < 0)elevador.Desce();
                    else{elevador.Desce(andar);}
                    break;
                default:
                    System.out.println("Algo de Errado :P");
            }
            System.out.println(elevador.Mensagem());
        }while(opc != 5);
    }
}

/*
Crie uma classe denominada Elevador para armazenar as informações de um 
elevador dentro de um prédio.

(FEITO) A classe deve armazenar o andar atual (térreo = 0), total de andares 
no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. 

A classe deve também disponibilizar os seguintes métodos: 
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de 
andares no prédio (os elevadores sempre começam no térreo e vazio); 
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); 
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); 
Sobe: para subir um andar (não deve subir se já estiver no último andar); 
Desce: para descer um andar (não deve descer se já estiver no térreo); 
Encapsular todos os atributos da classe (criar os métodos set e get)
*/

package Prova1.Questao5;
import java.sql.Time;
import java.util.Scanner;
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        int opc;
        System.out.println("Capacidade do Elevador:");
        int capacidadeElevador = input.nextInt();
        System.out.println("Total Andares: ");
        int totalAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeElevador, totalAndares);

        do{
            System.out.println("[1]Entrar\n[2]Sair\n[3]Subir\n[4]Descer");
            opc = input.nextInt();
            switch(opc){
                case 1:
                    elevador.Entra();
                    break;
                case 2:
                    elevador.Sai();
                    break;
                case 3:
                    elevador.Sobe();
                    break;
                case 4:
                    elevador.Desce();
                    break;
                default:
                    System.out.println("Algo de Errado :P");
            }
            System.out.println(elevador.Mensagem());
        }while(opc != 5);
    }
}


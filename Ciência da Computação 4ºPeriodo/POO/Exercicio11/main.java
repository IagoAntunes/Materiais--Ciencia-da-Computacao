package Exercicio11;
import java.util.Scanner;
/*
Modifique a classe celular e altere o jogo para poder jogar Pedra, Papel e Tesoura.
Também deverá ser criado um campo Id celular que deverá ser incrementado automaticamente e também 
 um método estático mostraQtdeCelulares() que retorna quantos celulares estão instanciados!
*/
public class main {
    public static void main(String args[]) { 
        Integer opc=0,on = 0;
        Scanner input = new Scanner(System.in);
        celular celular = new celular();

        System.out.println("Modelo: ");
        String modelo = input.nextLine();
        System.out.println("Nivel Bateria: ");
        Integer nivelBateria = input.nextInt();
        System.out.println("Som: ");
        Integer Som = input.nextInt();
        celular.celular(modelo, nivelBateria, Som);
        do{
            System.out.println("-------------------------------------");
            System.out.println(celular.printar());
            System.out.println("[1]Ligar\n[2]Desligar\n[3]AumentarSom\n[4]DiminuirSom\n[5]Jogar");
            opc = input.nextInt();
            switch(opc){

                case 1:
                    celular.Ligar();
                    on = 1;
                    break;
                case 2:
                    celular.Desligar();
                    on = 0;
                    break;
                case 3:
                    celular.aumentaSom();
                    break;
                case 4://IAGO ANTUNES FERREIRA 
                    celular.diminuiSom();
                    break;
                case 5://IAGO ANTUNES FERREIRA 
                    if(on == 1){
                        System.out.println("[0]Pedra  [1]Papel [2]Tesoura");
                        Integer escolha = input.nextInt();
                        System.out.println(celular.Jogar(escolha));
                    }
                    break;
                case 6:
                    System.out.println("Numero Errado...");
            }
        }while(opc != 7);
    }
}

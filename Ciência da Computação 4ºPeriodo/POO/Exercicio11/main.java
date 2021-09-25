package Exercicio11;
import java.util.Scanner;

import Exercicio11.celular_2;
/*
Modifique a classe celular e altere o jogo para poder jogar Pedra, Papel e Tesoura.
Também deverá ser criado um campo Id celular que deverá ser incrementado automaticamente e também 
 um método estático mostraQtdeCelulares() que retorna quantos celulares estão instanciados!
*/
public class main {
    public static void main(String args[]) { 
        Integer opc=0,on = 0;
        Scanner input = new Scanner(System.in);
        celular_2 celular = new celular_2();
        celular_2 celular2 = new celular_2();
        celular_2 celular3 = new celular_2();
        System.out.println("Modelo: ");
        String modelo = input.nextLine();
        System.out.println("Nivel Bateria: ");
        Integer nivelBateria = input.nextInt();
        System.out.println("Som: ");
        Integer Som = input.nextInt();

        //3 INSTANCIAS AQUI
        celular.celular(modelo, nivelBateria, Som);
        celular2.celular("Xiaomi", 70, 70);
        celular3.celular("Apple", 20, 15);
        do{
            System.out.println("-------------------------------------");
            System.out.println(celular.printar123());
            System.out.println("[1]turn on\n[2]turn off\n[3]turn up sound\n[4]turn down sound\n[5]Play[6]show cell phones");
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
                    celular.aumentasound();
                    break;
                case 4://IAGO ANTUNES FERREIRA 
                    celular.diminuisound();
                    break;
                case 5://IAGO ANTUNES FERREIRA 
                    if(on == 1){
                        System.out.println("[0]Pedra  [1]Papel [2]Tesoura");
                        Integer escolha = input.nextInt();
                        System.out.println(celular.Jogar(escolha));
                    }
                    break;
                case 6:
                    System.out.println("\n\nNumero de Instancias:"+celular_2.mostraQtdeCelulares());
                    break;
                case 7:
                    System.out.println("Algo de errado...-'");
                    break;
            }
        }while(opc != 7);
        //Aqui imprime a quantidade instancias
        System.out.println("\n\nNumero de Instancias:"+celular_2.mostraQtdeCelulares());
    }
}

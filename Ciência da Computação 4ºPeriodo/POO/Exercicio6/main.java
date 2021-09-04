package Exercicio6;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Criar uma classe celular com os seguintes
 campos: modelo, nivelBateria, 
 ligado (tipo boolean) e som.


 O usuário pode carregar o celular,
 aumentar e diminuir o som e jogar, ao 
 jogar ele poderá escolher o jogo e a
 bateria deverá gastar quando jogar.

O jogo deverá ser um par ou impar onde 
o usuário escolher (par ou impar) e 
o sistema gera um número aleatorio e diz
se ganhou ou perdeu.

 O usuário somente poderá controlar o som
 e jogar se o celular estiver ligado.
 Criar uma classe TestaCelular e criar 
 um menu para o usuário interagir.

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
                case 4:
                    celular.diminuiSom();
                    break;
                case 5:
                    if(on == 1){
                        System.out.println("[0]Par ou [1]Impar");
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

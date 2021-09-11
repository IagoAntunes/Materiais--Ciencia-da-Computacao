package Exercicio7;
import java.util.Scanner;
/*
(FEITO) Crie uma classe Televisao com métodos que podem controlar o volume e trocar os canais da televisão.


 A TV só funciona ligada e deve ter limites de volume e canais. 
 Os canais ao chegar no último volta para o primeiro. 
 
 Crie os seguintes controles:
(feito)aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; 
(FEITO) aumentar e diminuir o número do canal em uma unidade 
(FEITO) trocar para um canal indicado ou subir um canal caso não seja informado o canal;
(FEITO) consultar o valor do volume de som e o canal selecionado. 

(feito)crie dois construtores para a TV,um que recebe apenas a marca da TV e outro que recebe a marca, 
quantidade de canais e volume máximo.

Crie o método toString que mostrará a marca da TV, o volume e o canal atual. 
(Feito) Crie menu para interagir com a TV. Utilize métodos Get e Set.*/

public class main {
    
    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in);
        int opc=0,canal;

        System.out.println("Marca: ");
        String marca = input.nextLine();
        System.out.println("Quantidade de canais: ");
        Integer qtdCanais = input.nextInt();
        System.out.println("Volume Maximo: ");
        Integer volumeMaximo = input.nextInt();

        tv televisao = new tv(marca,qtdCanais,volumeMaximo);

        do{
            System.out.println("[1]Aumentar\n[2]Diminuir\n[3]TrocarCanal\n[4]ReceberValores");
            opc = input.nextInt();
            switch(opc){
                case 1://aumentar volume
                    televisao.aumentaVolume();
                    break;
                case 2://Diminuir volume
                    televisao.diminuiVolume();
                    break;
                case 3://Trocar para canal
                    System.out.println("Escolha o canal ou digite numero negativo:");
                    canal = input.nextInt();
                    if(canal > 0){
                        televisao.aumentaCanal();
                    }else{
                        televisao.aumentaCanal(canal);
                    }
                    break;
                case 4:
                    System.out.println("Escolha o canal ou digite numero negativo:");
                    canal = input.nextInt();
                    if(canal > 0){
                        televisao.diminuiCanal();
                    }else{
                        televisao.diminuiCanal(canal);
                    }
                    break;
                case 5://Receber valores
                    System.out.println(televisao.consulta());
                    break;
            }
        }while(opc != 9);
    }
}

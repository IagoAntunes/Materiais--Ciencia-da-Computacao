package Exercicio13;
import java.util.Scanner;
import Exercicio13.computador;
/*
 (feito)Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da
 (feito)RAM, número de processadores e fabricante. 
 
 (feito)Crie métodos de acesso público e reimplemente o método toString() da classe. 
 (feito)Crie um construtor para passar todos os atributos durante a criação do objeto.
 
 (feito)Crie o atributo booleano ligado e um método para ligar e desligar ocomputador.
 (feito)Todo computador quando for criado deve estar desligado. 
 (feito)Crie o método estadoComputador que retorna se ele está ligado ou desligado.
 
 (feito)Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores
 que irá receber os dados do computador pelo usuário.
 
(feito)Depois imprima os dadosdos computadores que possuem mais que 512Mb de Ram
 usando o método toString.
 
  Se conseguir fazer o cadastro por menu é muito bom. Boa sorte.
 */
public class TestaComputador {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        //Iago Antunes Ferreira
        computador[] computador = new computador[3];

        for(int i =0;i<computador.length;i++){

            System.out.println("Computador..."+(i+1));

            System.out.println((i+1)+ "- Fabricante:");
            String Fabricante = input.nextLine();
            input.nextLine();
            System.out.println((i+1)+ "- Tamanho HD:");
            int tamanhoHD = input.nextInt();
            input.nextLine();
            System.out.println((i+1)+ "- Tamanho RAM:");
            int tamanhoRAM = input.nextInt();
            input.nextLine();
            System.out.println((i+1)+ "- Numero Processadores:");
            int nProcessadores = input.nextInt();
            input.nextLine();
            computador[i] = new computador(tamanhoHD, tamanhoRAM, nProcessadores, Fabricante) ;
        }
        for(int i=0;i<computador.length;i++){
            if(computador[i].getTamanhoRAM() >computador[i].RAMestatica){
                System.out.println(computador[i].toString());
            }
        }
    }
}

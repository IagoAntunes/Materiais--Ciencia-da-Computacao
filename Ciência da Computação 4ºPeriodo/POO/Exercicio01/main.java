package Exercicio01;
import java.util.Scanner;

class exercicio1 {  



    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in); 
        caneta caneta1 = new caneta();

        caneta1.inicializando();
        System.out.println("Cor da Caneta:");
        String cor = input.nextLine();
        caneta1.setColor(cor);
        System.out.println("Tamanho da Caneta:");
        String marca = input.nextLine();
        caneta1.setMarca(marca);
        System.out.println("Quantidade de Canetas:");
        int qtd = input.nextInt();
        caneta1.setQtd(qtd);
        int opc=0;
        while(opc != 1){
            System.out.println("[0]-AlterarValores [1]-Sair");
            opc = input.nextInt();

            if(opc == 0){
                System.out.println("[0]-Cor \n[1]-Marca \n[2]-Quantidade");
                int opc2 = input.nextInt();
                if(opc2 == 0){
                    System.out.println("Cor da Caneta:");
                    cor = input.nextLine();
                    caneta1.setColor(cor);
                }else if(opc2 == 1){
                    System.out.println("Tamanho da Caneta:");
                    marca = input.nextLine();
                    caneta1.setMarca(marca);
                }else if(opc2 == 2){
                    System.out.println("Quantidade de Canetas:");
                    qtd = input.nextInt();
                    caneta1.setQtd(qtd);
                }else{
                    System.out.println("Valor Invalido:");
                }
            }
        }
        
        caneta1.printar();


    }
 } 
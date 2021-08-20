package Exercicio2;
import java.util.Scanner;

class exercicio2 {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in); 
        Carro carro1 = new Carro();

        //Carro1
        System.out.println("Velocidade Atual:");
        carro1.setVelocidade(input.nextInt());
        System.out.println("Capacidade Tanque:");
        carro1.setcapacidadeTanque(input.nextInt());
        carro1.setLigado();

        carro1.andar();

        carro1.printar();


        //CARRO2
        Carro carro2 = new Carro();
        
        System.out.println("Velocidade Atual:");
        carro2.setVelocidade(input.nextInt());
        System.out.println("Capacidade Tanque:");
        carro2.setcapacidadeTanque(input.nextInt());
        carro2.setLigado();
        
        carro2.andar();
        carro2.andar();
        carro2.andar();
        carro2.printar();

 





    }
 } 
package Exercicio5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
(FEITO)Criar um projeto de  carro (novamente), onde, quando
acelerar o carro, caso ele entre na reserva
(10% ou menos do tanque), avisar o usuário.

(FEITO)Criar o campo velocidade máxima, e o carro 
deverá respeitar esse valor. 

(FEITO) <------ Veja que carros que tem motor mais potente
gastam mais gasolina. Lembre-se que
o carro só anda ligado e com gasolina,
que ele precisa abastecer, etc.


Você é livre para escolher os atributos do
carro, mas alguns são obrigatórios, como
apresentado anteriormente.

(FEITO)  <-------------  Ao criar o carro é preciso informar no 
construtor o modelo, capacidade do tanque,
velocidade máxima e potencia do motor(1.0,
1.4, 1.8, etc).

(FEITO) <--------         No método main, receba as informações
iniciais do carro e crie um menu para o
usuário interagir com o carro como...
acelerar
frear
ligar
abastecer
etc....
*/
class Exercicio5 {
    public static void main(String args[]) { 
        Integer opc=0;
        Scanner input = new Scanner(System.in);
        carro carro = new carro();

        System.out.println("Modelo: ");
        String modelo = input.nextLine();
        System.out.println("Capacidade: ");
        Double capacidade = input.nextDouble();
        System.out.println("Velocidade Maxima: ");
        Double velocidadeMaxima = input.nextDouble();
        System.out.println("Potencia do Motor: ");
        Double potencia = input.nextDouble();

        carro.carro(modelo,capacidade,velocidadeMaxima,potencia);

        do{
            System.out.println("---------------------------------------------------------");
            System.out.println(carro.printar());
            System.out.println("\n[1]-Acelerar\n[2]-Frear\n[3]Ligar\n[4]Desligar\n[5]Abastecer");
            opc = input.nextInt();
            switch(opc){
                case 1:
                    carro.acelerar();
                    break;
                //Acelerar
                case 2:
                    carro.frear();
                    break;
                //Frear
                case 3:
                    carro.Ligar();
                    break;
                //Ligar
                case 4:
                    carro.Desligar();
                    break;
                //Desligar
                case 5:
                    carro.Abastecer();
                    break;
                //Abasteecer
                default:
                    System.out.println("Digite um numero correto!!");
                    break;
            }
        }while(opc != 6);
    }
}
//descomto = teste ?v : f   - //.charAt(0)
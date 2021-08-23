package ExercicioInicial.Exercicio3;
import java.util.Scanner;

public class main {
    
    public static void main(String args[]){

        boleto boleto = new boleto();
        Scanner input = new Scanner(System.in); 


        String nome = input.nextLine();
        Integer vencimento = input.nextInt();
        Double valor = input.nextDouble();
        Double desconto = input.nextDouble();
        Boolean pago = input.hasNext();

        boleto.inicializando(vencimento, valor, desconto, pago, nome);

        boleto.pagar();

        System.out.print("Nome: "+boleto.getNome()+
        "\nValor Liquido: " + boleto.getValor() +
        "\nPago: " + boleto.getPago());
    }
}


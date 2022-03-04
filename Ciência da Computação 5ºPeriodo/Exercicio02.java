import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double sFixo = input.nextDouble();
		double tVendas = input.nextDouble();
		
		double total = (tVendas * 0.15) + sFixo;
		
		System.out.println(String.format("TOTAL = R$ %.2f",total));
    }
}
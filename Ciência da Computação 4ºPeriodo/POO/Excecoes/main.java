package Excecoes;
import java.util.Scanner;
class exercicio1 {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in); 


        Contas contas = new Contas();
       
        try{
            System.out.println(contas.Soma(-10, 20));
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
            System.out.println(ex.getMessage());
        }


    }
} 
class Contas{

    public int Soma(int a,int b){
        if(a < 0 || b < 0){
            throw new ArithmeticException("Numero negativo");
        }
        return a + b;
    }

}

class SaldoInsuficiente extends Exception { 
    public SaldoInsuficiente(String message) {
        super(message);
    }
}
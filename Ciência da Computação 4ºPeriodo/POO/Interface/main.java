package Interface;

import java.util.ArrayList;
import java.util.Scanner;

import ExercicioHerançaPolimorfismo.Pessoa;
public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa> array = new ArrayList<Pessoa>();
        array.add(new Cliente("Joao","SP"));
        array.add(new Engenheiro("Luis", "SP", 123));
        array.add(new Gerente("Pedro", "MG", "RH"));
        array.add(new Motorista("Luana", "RJ", 554));
        array.add(new Secretaria("Matheus", "GO", "Ingles"));


        for (Pessoa pessoa : array) {
            System.out.println(pessoa.E);
        }



    }
}

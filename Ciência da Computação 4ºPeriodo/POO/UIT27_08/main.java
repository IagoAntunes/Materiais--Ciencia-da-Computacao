package UIT27_08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in); 
        pessoa pessoa1 = new pessoa();

        pessoa1.setnome(JOptionPane.showInputDialog("Qual seu nome: "));
        
        pessoa1.setAltura(JOptionPane.showInputDialog("Qual sua altura: "));
    
        pessoa1.setSexo(JOptionPane.showInputDialog("Genero: \n[1]-M\n[2]-F"));

        pessoa1.setPeso(JOptionPane.showInputDialog("Peso: "));

        JOptionPane.showMessageDialog(null, pessoa1.imprimir() + pessoa1.CalculoIMC());


    }
}
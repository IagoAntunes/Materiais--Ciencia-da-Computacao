
package teste2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        


        Scanner ler = new Scanner(System.in);


        System.out.println("Nome do arquivo:");
        String nome = ler.nextLine();

        System.out.println("Conteudo");

        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = lerArq.readLine();
            }
            arq.close();
        }catch(IOException ex){
            System.out.println("Erro");
        }

    }
}

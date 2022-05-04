import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String args[]) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int opc =1 ;

        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        ManipulaArq mani = new ManipulaArq();
        

        while(opc == 1){
            System.out.println("Id:");
            int id = entrada.nextInt();

            System.out.println("Nome:");
            String nome = entrada.next();

            System.out.println("Nota:");
            int nota = entrada.nextInt();

            mani.SalvaValores(id, nome, nota);
            
            listaPessoa.add(new Pessoa(id, nome, nota));

            System.out.println("Deseja Continuar?");
            opc = entrada.nextInt();

        }

        for (Pessoa pessoa : listaPessoa) {
            mani.SalvaValores(pessoa.Id,pessoa.Nome,pessoa.Nota);
        }

        DataInputStream leitor = mani.getInputData();

        int Id = leitor.readInt();
        String Nome = leitor.readUTF();
        int Nota = leitor.readInt();

        System.out.println(leitor.readUTF());


    }  
}

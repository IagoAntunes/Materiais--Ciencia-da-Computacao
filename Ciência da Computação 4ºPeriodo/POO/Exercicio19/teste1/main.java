package teste1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        String arquivo = "dados.txt";
        Scanner input = new Scanner(System.in);

        int op ;
        do{
            System.out.println("Oque deseja fazer:");
            op = input.nextInt();
            //0 sair 1 Cadastrar 2Buscar
            switch(op){
                case 0:
                    break;

                case 1:
                    System.out.println("Digite id");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Digite nome");
                    String nome = input.nextLine();
                    try{
                        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));
                        bw.write(id+" ; "+nome+"\n");
                        bw.close();
                    }catch(IOException ex){
                        System.out.println("Erro");
                    }
                    break;
                
                case 2:
                    System.out.println("Qual o ID");
                    int pID = input.nextInt();
                    try{
                        BufferedReader br = new BufferedReader(new FileReader(arquivo));
                        while(br.ready()){
                            String linha = br.readLine();
                            String elemento[] = linha.split(";");
                            if(Integer.parseInt(elemento[0]) == pID){
                                System.out.println(elemento[1]);
                            }
                        }
                    }catch(IOException ex){
                        System.out.println("Erro");
                    }
                    break;


                default:
                    System.out.println("Algo errado");

            }
        }while(op !=0);
        
        
        try{
        BufferedWriter bf = new BufferedWriter(new FileWriter("arquivo.txt"));
        bf.append("Oi , eu consegui");
        bf.close();

        BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
        while(br.ready()){
            System.out.println(br.readLine());
        }
        System.out.println(br.readLine());
        }catch(IOException ex){
            System.out.println("Erro"+ex);
        }










    }

}

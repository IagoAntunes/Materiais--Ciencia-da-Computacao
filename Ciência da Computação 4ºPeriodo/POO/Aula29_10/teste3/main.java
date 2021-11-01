/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula29_10.teste3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String arquivo = "dados.txt";
        Scanner ent = new Scanner(System.in);
        
        int op=0;
        do{
            System.out.println("O que deseja fazer?");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar");
            op = ent.nextInt();
            switch(op){
                case 0:
                    System.out.println("Tchau.");
                    break;
                case 1:
                    System.out.println("Digite o id: ");
                    int id = ent.nextInt();
                    System.out.println("Digite seu nome: ");
                    ent.nextLine();
                    String nome = ent.nextLine();

                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
                        bw.write(id + ";" + nome + "\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    System.out.println("Qual id quer buscar? ");
                    int idbusca = ent.nextInt();
            
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while(br.ready()){
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        if(Integer.parseInt(elemento[0])==idbusca){
                            System.out.println(elemento[1]);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
                    
                    
                default:
                    System.out.println("Invalido.");
                    
            
            }
        }while(op!=0);
        
    }
    
}
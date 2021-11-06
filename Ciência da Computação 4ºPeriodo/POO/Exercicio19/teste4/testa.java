/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

(FEITO)Criar a classe pessoa com os atributos id, nome, altura, peso. Métodos Imc e outros a sua escolha.

(FEITO)Criar a classe testa com o método main com o seguinte menu. Lembrando que os dados devem ser
 manipulados em arquivo texto.

(feito)Cadastrar pessoa
(feito)Mostrar dados da pessoa buscando pelo id
(feito)Mostrar pessoas acima do peso

(Feito)Obs. Os métodos de mostrar deverão buscar os dados do arquivo, instanciar em uma pessoa e
 apresentar os dados pelo método toString.

Bom trabalho.

*/

//Iago Antunes Ferreira
package Exercicio19.teste4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testa {
    public static void main(String[] args) {
        pessoa pessoa1;
        String arquivo = "arquivos.txt";
        Scanner input = new Scanner(System.in);

        ArrayList<pessoa> Pessoasarray = new ArrayList<>();
        
        int opc=0;
        do{
            System.out.println("\nO que deseja fazer?"+
            "\n[0] - Sair"+
            "\n[1] - Cadastrar"+
            "\n[2] - Buscar"+
            "\n[3] - Pessoas acima do peso");
            opc = input.nextInt();
            switch(opc){
                case 0://Sair
                    System.out.println("Saindo...");
                    break;
                case 1://Cadastrar Pessoa
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    System.out.println("Nome: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    System.out.println("Peso: ");
                    Double peso = input.nextDouble();
                    System.out.println("Altura: ");
                    Double altura = input.nextDouble();
                    Pessoasarray.add(new pessoa(id, nome, altura, peso));
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
                        bw.write(id + ";" + nome + ";" + peso + ";" + altura + "\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(testa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2://Buscar por ID
                    System.out.println("Digite o ID para buscar: ");
                    int idbusca= input.nextInt();
                //Iago Antunes Ferreira
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while(br.ready()){
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        if(Integer.parseInt(elemento[0])==idbusca){
                            for(pessoa p : Pessoasarray){
                                if(p.getNome().equals(elemento[1])){
                                    System.out.println(p.toString());
                                }
                            }
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(testa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(testa.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case 3://Pessoas acima do peso
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while(br.ready()){
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        Double formula = Double.parseDouble(elemento[2]) /(Double.parseDouble(elemento[3]) * Double.parseDouble(elemento[3]));
                        if(formula>=25){
                            for(pessoa p : Pessoasarray){
                                if(p.getId() == Integer.parseInt(elemento[0])){
                                    System.out.println(p.toString());
                                }
                            }
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(testa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(testa.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;       
            //Iago Antunes Ferreira
            default:
                System.out.println("Algo de errado aconteceu... :(");
            }
        }while(opc!=0);
    }
}
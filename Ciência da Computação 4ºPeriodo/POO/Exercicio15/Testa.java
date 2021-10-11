package Exercicio15;
import java.util.ArrayList;
import java.util.Scanner;
/*
(feito)Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa
, id autoincremento e também um booleano ativo.

(feiot)Crie uma classe Testa que possui um arrayList de contatos. 

(FEITO)Crie um menu para adicionar, remover, listar, listar inativos,
(FEITO)ativar contato, bloquear contato, buscar por nome, listar por cidade, limpar agenda.

 Obs. Listar, listar por cidade e listar por nome só devem exibir os ativos.
*/
public class Testa {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);

        ArrayList<Contato> contatinhos = new ArrayList<>();//Aqui é a agenda com todos contatos
        Contato[] contatinhos2 = new Contato[100];//Aqui guarda os contatos de forma separada
        int opc = 0, i = 0;
        do{//Iago Antunes Ferreira
            System.out.println("\nOpções");
            opc = input.nextInt();
            switch(opc){
                case 1://Adicionar
                    try{
                        System.out.println("Nome:");
                        String nome = input.next();
                        System.out.println("Telefone:");
                        int telefone = input.nextInt();
                        System.out.println("Cidade:");
                        String cidade = input.next();
                        contatinhos2[i] = new Contato(nome,telefone,cidade);
                        contatinhos.add(contatinhos2[i]);
                        i++;
                        break;
                    }catch(Exception ex){
                        System.out.println("\n\nErro..:"+ex+"Tente novamente!");
                    }

                case 2://Remover
                try{
                    System.out.println("Remover Contato ID:");
                    int removerID = input.nextInt();
                    contatinhos.remove(removerID);
                    System.out.println(contatinhos2[removerID].getNome() + "  removido!!");
                    break;
                }catch(Exception ex){
                    System.out.println("\n\nErro..:"+ex+"Tente novamente!");
                }
                
                case 3://Listar
                    for(int j=0;j<i;j++)
                        if(contatinhos2[j].getAtivo() && contatinhos.contains(contatinhos2[j])){
                            System.out.println(contatinhos2[j].toString());
                        }
                    break;
                
                case 4://Listar Inativos
                    for(int j=0;j<i;j++){
                        if(contatinhos2[j].getAtivo() == false && contatinhos.contains(contatinhos2[j]) ){
                            System.out.println(contatinhos2[j].toString());
                        }
                    }
                    break;

                case 5://Ativar Contato
                    try{
                        System.out.println("ID contato:");
                        contatinhos2[input.nextInt()].ativarContato();
                        break;
                    }catch(Exception ex){
                        System.out.println("\n\nErro..:"+ex+"Tente novamente!");
                    }

                case 6://Bloquear Contato
                    try{System.out.println("ID contato:");
                    int bloquearContato = input.nextInt();
                    contatinhos2[bloquearContato].bloquearContato();
                    System.out.println(contatinhos2[bloquearContato].getNome() + "  Bloqueado!!");
                    break;
                    }catch(Exception ex){
                        System.out.println("\n\nErro..:"+ex+"Tente novamente!");
                    }
                
                case 7://Buscar por nome
                    try{
                        System.out.println("Nome:");
                        String buscaNome  = input.next();
                        for(int j2 =0;j2<i;j2++){
                            if(contatinhos2[j2].getNome().equals(buscaNome)){
                                System.out.println(contatinhos2[j2].toString());
                            }
                        }
                        break;
                    }catch(Exception ex){
                        System.out.println("\n\nErro..:"+ex+"Tente novamente!");
                    }
                
                case 8://Listar por cidade
                    System.out.println("Listar por Cidade:");
                    String buscaCidade = input.next();
                    for(int j3=0;j3<i;j3++){
                        if(contatinhos2[j3].getAtivo() == true && contatinhos2[j3].getCidade().equals(buscaCidade) 
                        && contatinhos.contains(contatinhos2[j3])){
                            System.out.println(contatinhos2[j3].toString());
                        }
                    }
                    break;

                case 9://Limpar agenda
                    contatinhos.clear();
                    limpar(contatinhos2);
                    System.out.println(contatinhos2.length);
                    break;
            }
        }while(opc != 0); 
    }

    public static void limpar(Contato[] contatinhos2){//Limpar caracteristicas usuarios
        for(int i =0;i<contatinhos2.length;i++){
            contatinhos2[i] = null;
        }
    }
}

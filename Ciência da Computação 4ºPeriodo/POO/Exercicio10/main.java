package Exercicio10;
/*
Refazer o exercício do elevador da prova para 
(feito) ele não poder subir ou descer sem pessoas dentro do elevador. 
Modifique as opções para que possa escolher:
(feito)quantos andares subir ou descer
e 
(feito)quantas pessoas irão entrar ou sair 
atravésde sobrecarga.
*/
public class main {
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        int opc;
        System.out.println("Capacidade do Elevador:");
        int capacidadeElevador = input.nextInt();
        System.out.println("Total Andares: ");
        int totalAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeElevador, totalAndares);

        do{
            System.out.println("[1]QtdEntrar\n[2]QtdSair\n[3]QtdSubir\n[4]QtdDescer");
            opc = input.nextInt();
            switch(opc){
                case 1:
                    elevador.Entra();
                    break;
                case 2:
                    elevador.Sai();
                    break;
                case 3:
                    elevador.Sobe();
                    break;
                case 4:
                    elevador.Desce();
                    break;
                default:
                    System.out.println("Algo de Errado :P");
            }
            System.out.println(elevador.Mensagem());
        }while(opc != 5);
    }
}

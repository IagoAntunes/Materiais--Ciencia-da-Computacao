import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        char[] Alfabeto = new char[]
        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int qtd=0;
        int aux=0;

        int casosTeste = input.nextInt();
        while(qtd < casosTeste){
            input.nextLine();
            String palavra = input.nextLine();
            int indexPular = input.nextInt();

            char[] cVetor = palavra.toCharArray();
            char[] resposta = new char[palavra.length()];

            for(int i = 0;i<palavra.length();i++){
                for(int j = 0;j<Alfabeto.length;j++){
                    if(Alfabeto[j] == (cVetor[i])){
                        if((j - indexPular) < 0){
                            aux = indexPular - j;
                            resposta[i] = Alfabeto[Alfabeto.length - aux];
                        }else{
                            resposta[i] = Alfabeto[j-indexPular];
                        }
                    }
                }
            }
            qtd++;
            for(char c : resposta) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
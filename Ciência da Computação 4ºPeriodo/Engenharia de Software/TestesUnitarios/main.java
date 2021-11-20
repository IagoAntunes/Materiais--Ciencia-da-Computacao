





public class main {

    public static void main(String args[]) {
        char[] vetor = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int i=0;
        String palavra;
        String aux;
        char[] palavraChar;
        int qtd;
        char[] arr;
        int n;

        String nome = "IAGO";

        arr = nome.toCharArray();
		palavraChar = nome.toCharArray();
		palavra = nome;
        aux = "";
		qtd = palavra.length();
        for(i=0;i<qtd;i++) {
            System.out.print(palavra.charAt(i) + " ");
            char sla = palavra.charAt(i);
            for(int j=0;j<vetor.length;j++) {
                System.out.print("\n"+vetor[j]+"e igual a"+arr[i]);
            	if(Character.compare(vetor[j],arr[i]) == 0) {
                    System.out.print("ACERTOUUUU");
            		aux = aux + vetor[j+3];
            	}
            }

        }
        System.out.println("\n\n"+aux);


    }

}

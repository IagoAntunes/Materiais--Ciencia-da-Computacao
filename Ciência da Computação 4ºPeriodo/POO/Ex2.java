
class caneta{
    String cor;
    int tamanho;
    int quantidade;
    int escreveu;

    public void inicializando(String cor,int tamanho,int quantidade,int escreveu){
        cor = " ";
        tamanho = 0;
        quantidade = 0;
        escreveu = 0;
    }
    public void printar(String cor,int tamanho,int quantidade){
        System.out.println("Cor = "+cor+"Tamanho= "+tamanho+"Quantidade="+quantidade+"Escreveu: +");
    }
    public void escrever(int escrever){
        escrever ++;
        System.out.println("Escrevendo...");
    }
    public void changeColor(String color){
        this.cor = color;
    }
}

class Ex2 {  
    public static void main(String args[]) {  
        caneta caneta1 = new caneta();

        //Inicializa
        caneta1.inicializando(caneta1.cor,caneta1.tamanho,caneta1.quantidade,caneta1.escreveu);

        //Atribuindo valores
        caneta1.cor = "Azul";
        caneta1.tamanho = 2;
        caneta1.quantidade = 4;
        caneta1.changeColor("teste");

        //Chamando metodos
        caneta1.escrever(caneta1.escreveu);
        caneta1.printar(caneta1.cor,caneta1.tamanho,caneta1.quantidade);

    }  
 } 
package ClassesMetodosAbstratos.Exercicio01;
/*
1 -
(feito)Escreva uma classe abstrata chamada CartaoWeb. Essa classe representa todos os tipos de cartões web
(feito)e conterá apenas um atributo: destinatario (tipo String). Nessa classe você deverá também declarar o método
(feito)public abstract void showMessage(). 
(feito)Crie classes filhas da classe CartaoWeb: DiaDosNamorados, Natal, Aniversario.
(feito)Cada uma dessas classes deve conter um método construtor que receba o nome do destinatário do cartão. 
(feito)Cada classe também deve implementar o método showMessage(), mostrando uma mensagem ao usuário com seu nome
(feito)e que seja específica para a data de comemorativa do cartão. 
(feito)Escreva um programa e no método main crie um array de CartaoWeb. 
(feito)Insira instâncias dos 3 tipos de cartões neste array. 
(feito)Após, use um laço for para exibir as mensagens deste cartão chamando o método showMessage().
(feito)Em que linha(s) acontece polimorfismo nesse código?
*/
public class main {
    public static void main(String args[]) {
        var array = new CartaoWeb[3];

        //Ocorre polimorfismo nessas instancias
        //Ja que o array é do tipo Cartao e as instancias de outros tipos
        array[0] = new Natal("Joao");
        array[1] = new DiaDosNamorados("Maria");
        array[2] = new Aniversario("Luiz");
        //No foreach abaixo , ja que o showMessage é de CartaoWeb mas suas classes filhas a sobrescrevem
        for (var c : array) {
            c.showMessage();
        }
    }
}

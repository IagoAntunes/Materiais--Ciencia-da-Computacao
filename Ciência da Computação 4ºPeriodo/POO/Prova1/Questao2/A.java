/*
Questão 2 – 2 pontos - Considere a classe A abaixo. Implemente o método "m" conforme as 
seguintes regras: o método
retorna true se o valor proposto no parâmetro de m for maior que zero. O método retorna false se o
valor proposto no parâmetro de m for menor ou igual à zero. Se o método retornar true então ele
deve, também, alterar o valor do atributo a para 10 vezes o valor proposto no parâmetro do método
m. 
public class A {
    int a;
    public boolean m(int valor) {
    // ?
    }
}   
*/

package Prova1.Questao2;

public class A {
    int a;
    public boolean m(int valor) {
        if(valor > 0){
            a = valor * 10;
            return true;
        }else{
            return false;
        }
        
    }
}

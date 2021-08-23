/*
- Escreva um código em Java que apresente a classe Pessoa, com atributos nome, 
endereço e telefone e, o método imprimir (Imprime todos os dados da pessoa). O 
método imprimir deve mostrar na tela os valores de todos os atributos. Não esqueça de 
adicionar os métodos Get,s e Set's. Crie a classe TestaPessoa, instancie 2 pessoas e teste 
os métodos. Veja que cada pessoa possui seus próprios atributos.
*/


package ExercicioInicial.Exercicio4;

import java.util.Scanner;
public class main {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //Pessoa1
        pessoa1.setNome(input.nextLine());
        pessoa1.setEndereco(input.nextLine());
        pessoa1.setTelefone(input.nextLine());

        //Pessoa2
        pessoa2.setNome(input.nextLine());
        pessoa2.setEndereco(input.nextLine());
        pessoa2.setTelefone(input.nextLine());

        System.out.println(pessoa1.imprimir());
        System.out.println(pessoa2.imprimir());

    }
}

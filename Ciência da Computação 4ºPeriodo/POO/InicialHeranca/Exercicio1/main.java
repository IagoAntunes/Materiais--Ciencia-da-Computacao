package InicialHeranca.Exercicio1;

import java.util.Scanner;

/*
Crie uma classe Animal que obedeça à seguinte descrição:
(Feito)possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), ambiente (String) 
(feito)e velocidade média (float) 
(feito)Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos
(feito) e atribua-os aos seus respectivos atributos. 
(feito)Crie os métodos get e set para cada um dos atributos. 
(feito)Sobreescreve o metodo toString(), que, quando chamado, 
(feito)imprime na tela uma espécie de relatório informando os dados do animal.
*/
public class main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);


    System.out.println("Nome:");
    String nome = input.nextLine();
    System.out.println("Comprimento:");
    Float comprimento = input.nextFloat();
    input.nextLine();
    System.out.println("Numero de Patas:");
    Integer nPatas = input.nextInt();
    input.nextLine();
    System.out.println("Cor:");
    String cor = input.nextLine();
    input.nextLine();
    System.out.println("Ambiente:");
    String ambiente = input.nextLine();
    System.out.println("Velocidade Media:");
    Float vMedia = input.nextFloat();
    input.nextLine();

    animais animal = new animais(nome, comprimento, nPatas, cor, ambiente, vMedia);

    System.out.println(animal.toString());

  }
}

package Exercicio18;
import java.util.Scanner;
/*
Crie uma classe aluno com atributos e métodos a sua escolha,
mas que um deles seja a nota do aluno no semestre e outro seja o sexo
do aluno, que somente poderá ser Masculino ou Feminino 
(Você deverá utilizar obrigatoriamente tipos enumerados). 
Deverá ter também uma classe sala que possui atributos e métodos
 a sua escolha mas um deles deve ser uma coleção de alunos.

Crie uma classe de testes que deverá conter um menu para trabalhar com salas e alunos. 
  Adicionando, removendo, retornando o melhor aluno por exemplo, etc.

Veja que o método de incluir aluno, mostrar, etc, deve estar em sala e não em testa.
*/
public class main {
  public static void main(String args[]) {
    Sala sala1 = new Sala();
    Scanner input = new Scanner(System.in);
    int opc = 0;
    //classe.adicionarPessoa("Iago");
    // classe.getAluno().se
    sala1.setqtdAlunos(10);
    do {
      System.out.println("\nOpções");
      opc = input.nextInt();
      switch (opc) {
        
        case 1:
          System.out.println("Nome Aluno:");
          String nome = input.nextLine();
          input.nextLine();
          System.out.println("Idade Aluno:");
          int idade = input.nextInt();
          input.nextLine();
          System.out.println("Sexo Aluno:");
          String sexo = input.nextLine();
          System.out.println("Nota Aluno:");
          int nota = input.nextInt();

          sala1.getAluno().getNota().setNota(nota);
          
          input.nextLine();
          sala1.adicionarPessoa(new aluno(nome,idade,sexo));
          //String aluno = input.nextLine();
          break;

        case 2:
          for(aluno x : sala1.getAlunos()){
            System.out.println(x.toString());
          }
          break;





      }

    }while (opc != 0);

  }
}

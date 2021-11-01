package Exercicio18;
import java.util.Scanner;
import java.util.ArrayList;
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
    Scanner input = new Scanner(System.in);
    int opc = 0,idSala;
    
    ArrayList<Sala> salas = new ArrayList<>();
    //Salas ja predefinidas
    salas.add(new Sala(0));
    salas.add(new Sala(1));
    salas.add(new Sala(2));
    salas.add(new Sala(3));

    //Iago Antunes Ferreira
    do {
      menu();
      opc = input.nextInt();
      switch (opc){
        case 1://Adicionar aluno
          System.out.println("Digite a sala :");
          idSala = input.nextInt();
          Sala sala = salas.get(idSala);

          System.out.println("Nome Aluno:");
          String nome = input.nextLine();
          input.nextLine();

          System.out.println("Idade Aluno:");
          int idade = input.nextInt();
          input.nextLine();

          System.out.println("Sexo Aluno:"
          +"\n[1]F"
          +"\n[2]M");
          int sexoOPC;
          do{
            sexoOPC = input.nextInt();
          }while(sexoOPC != 1 && sexoOPC != 2 );

          Sexo sexoAluno = sexoOPC == Sexo.M.getValue() ? Sexo.M : Sexo.F;

          System.out.println("Nota Aluno:");
          int nota = input.nextInt();
          input.nextLine();

          sala.adicionarPessoa(new aluno(nome,idade,sexoAluno,nota));
          break;
        
        case 2://Remover Aluno
          System.out.println("Digite a sala :");
          idSala = input.nextInt();
          sala = salas.get(idSala);

          System.out.println("ID do aluno:");
          int removerA = input.nextInt();

          for(aluno x : sala.getAlunos()){
            if(x.getIdAluno() == removerA)
                sala.removerAluno(x);
          }
        break;
        
        case 3://Imprimir alunos
          System.out.println("Digite a sala :");
          idSala = input.nextInt();
          sala = salas.get(idSala);

          for(aluno x : sala.getAlunos()){
            System.out.println(x.imprimir());
          }
        break;

      case 4://Melhor Aluno
        System.out.println("Digite a sala :");
        idSala = input.nextInt();
        sala = salas.get(idSala);

        aluno alunoNota = sala.getmelhorNota();
        System.out.println("Melhor aluno:\n" + alunoNota.imprimir());
      break;

      }
    }while (opc != 0);
  }
  //Iago Antunes Ferreira
  public static void menu() {
    System.out.print("\n\t--Escola--"
      +"\n[1] Adicionar Aluno:"
      +"\n[2] Remover: "
      +"\n[3] Imprimir alunos:"
      +"\n[4] Melhor Aluno:\nR:"
    );
  }
}
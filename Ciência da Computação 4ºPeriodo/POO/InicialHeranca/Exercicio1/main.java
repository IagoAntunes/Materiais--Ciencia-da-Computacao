package InicialHeranca.Exercicio1;

import java.util.Scanner;

/*
1-
Crie uma classe Animal que obedeça à seguinte descrição:
(Feito)possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), ambiente (String) 
(feito)e velocidade média (float) 
(feito)Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos
(feito) e atribua-os aos seus respectivos atributos. 
(feito)Crie os métodos get e set para cada um dos atributos. 
(feito)Sobreescreve o metodo toString(), que, quando chamado, 
(feito)imprime na tela uma espécie de relatório informando os dados do animal.

2-
(feito)Crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição: 
(feito)possua um atributo caracteristica(String) 
(feito)Crie um método construtor que receba por parâmetro os valores iniciais de cada um
(feito)dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos. 
(feito)Crie ainda os métodos get e set para o atributo caracteristica. 
(feito)Crie um método dadosPeixe sem parâmetro e do tipo void, que, quando chamado, imprime
(feito)na tela uma espécie de relatório informando os dados do peixe (incluindo os dados do Animal e mais a característica).
//iago antunes ferreira
3-
(feito)Crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição:  
(feito)possua um atributo alimento(String) 
(feito)Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos
(feito)(incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos. 
(feito)Crie ainda os métodos get e set para o atributo alimento. 
(feto)Crie um método dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime na tela
(feito)uma espécie de relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).

4-
(feito)Crie uma classe TestarAnimais possua um método main para testar as classes criadas.
(feito)Crie um objeto camelo do tipo Mamífero e atribua os seguintes valores para seus atributos:
(feito) Nome: Camelo  Comprimento: 150 cm  Patas: 4  Cor: Amarelo  Ambiente: Terra  Velocidade: 2.0 m/s
(feito)Crie um objeto tubarao do tipo Peixe e atribua os seguintes valores para seus atributos 
(feito) Nome: Tubarão  Comprimento: 300 cm  Patas: 0  Cor: Cinzento  Ambiente: Mar  Velocidade: 1.5 m/s  Caracteristica: Barbatanas e cauda
(feito)Crie um objeto ursocanada do tipo Mamifero e atribua os seguintes valores para seus atributos: 
(feito) Nome: Urso-do-canadá  Comprimento: 180 cm  Patas: 4  Cor: Vermelho  Ambiente: Terra  Velocidade: 0.5 m/s  Alimento: Mel
(feito)Chame os método para imprimir os dados de cada um dos objetos criados.

5-
Crie na classe animal o método emitirSom() que retorna uma string com o som do animal. 
Este método deve ser sobreescrito em cada animal que herda desta classe.

*/
public class main {//Iago Antunes Ferreira
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    //Inicializando
    Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",2.0);
    Peixe tubarao = new Peixe("Tubarao", 300, 0, "Cinzento", "Mar", 1.5,"Barbatanas e cauda");
    Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5,"Mel");

    //Impressoes
    System.out.println(camelo.dadosMamifero());
    System.out.println(tubarao.dadosPeixe());
    System.out.println(ursocanada.dadosMamifero());

    //Sons animais
    camelo.setSom("30");
    tubarao.setSom("5");
    ursocanada.setSom("60");

    //Emitindo sons 
    System.out.println("\n\nCamelo emitiu "+camelo.emitirSom()+" Som...");
    System.out.println("Tubarao emitiu "+tubarao.emitirSom()+" Som....");
    System.out.println("Urso emitiu "+ursocanada.emitirSom()+" Som...");



  }
}

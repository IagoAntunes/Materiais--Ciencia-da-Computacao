package Exercicio20;
import java.util.Scanner;
/*
Escreva uma classe Produto que contenha os atributos nome, qtdeAtual e qtdeMinima.
Esta classe deve conter, além dos métodos de acesso (get e set, 
nenhum parâmetro pode ser negativo), dois construtores, um que não passa parâmetros
 algum e outro que passe como parâmetros o valor dos 3 atributos. 
---FEITO--------
 
 Também deve conter o método:
- repoe(int qtde) [Este método aumenta o valor da qtdeAtual].(FEITO)
- toString() [Este método mostra as características do Produto].(FEITO)

Crie uma classe Loja que contenha os atributos nome e um arrayList de produtos. (FEITO)
Além dos métodos de acesso, ela deve conter os seguintes métodos:(FEITO)
- mostraQuantidadeProdutos(); //Mostra todos produtos com as respectivas quantidades;
- mostraQuantidadeProdutos(String nome); //Mostra a quantidade de um produto específico;
- mostraProdutosAbaixoDoMinimo(); (Este exibe apenas os produtos que estão
 abaixo da quantidade mínima);
- totalProdutos(); (Este exibe o somatório de todos produtos da lista);(FEITO)
Crie uma classe Testa com um método main e um menu para interagir com a loja. (FEITO)
- Faça testes e boa sorte!!!(FEITO)
*/

public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Loja loja = new Loja();
        int opc = 1;
        String findProduto;
        do{
            System.out.println("\n\tDigite uma opção"
            +"\n[1]Adicionar Produto:"
            +"\n[2]Mostrar Produto:"
            +"\n[3]Mostra ProdutoEspecifico"
            +"\n[4]Quantidade de Produtos"
            +"\n[5]Produtos abaixo da qtd Minima"
            +"\n[6]Aumentar qtd do produto"
            +"\n[7]Diminuir qtd do produto");
            opc = input.nextInt();
            input.nextLine();
            switch(opc){
                //Iago Antunes Ferreira
                case 1://Adiciona os produtos
                    System.out.println("Nome do Produto:");
                    String nome = input.nextLine();
                    input.nextLine();
                    System.out.println("Quantidade Minima:");
                    int qtdMinima = input.nextInt();
                    System.out.println("Quantidade Atual:");
                    int qtdAtual = input.nextInt();
                    input.nextLine();

                    loja.adicionaProdutos(new Produto(nome,qtdMinima,qtdAtual));
                    break;

                case 2://Mostra produtos
                    System.out.println(loja.mostraQuantidadeProdutos());
                    break;
                
                case 3://Mostra produto especifico
                    System.out.println("Nome do produto:");
                    findProduto = input.nextLine();
                    System.out.println(loja.mostraQuantidadeProdutos(findProduto));
                    break;
                
                case 4://Quantidade de Produtos
                    System.out.println("A loja tem um TOTAL de "+loja.totalprodutos()+" produtos somados");
                    System.out.println("A loja tem "+loja.getProdutos().size()+" produtos cadastrados");
                    
                    break;

                case 5://Produtos abaixo da qtd minima
                    System.out.println("Produtos quantidade minima:");
                    System.out.println(loja.mostraProdutosAbaixoDoMinimo());
                    break;
                
                case 6://Aumentar produto
                    System.out.println("Nome do Produto:");
                    findProduto = input.nextLine();
                    for(Produto x : loja.getProdutos()){
                        if(x.getNome().equals(findProduto)){
                            System.out.println("Numero que vai repor:");
                            int repor = input.nextInt();
                            x.repoe(repor);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Nome do Produto:");
                    findProduto = input.nextLine();
                    for(Produto x : loja.getProdutos()){
                        if(x.getNome().equals(findProduto)){
                            System.out.println("Numero que vai diminuir:");
                            int diminuiProduto = input.nextInt();
                            x.diminuiProduto(diminuiProduto);
                        }
                    }
                    break;     
            }
        }while(opc !=0);
    }
}

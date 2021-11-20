package ExercicioHerançaPolimorfismo;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //IAGO ANTUNES FERREIRA
        ArrayList<Empregado> empregados = new ArrayList<>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        int opc = 0;
        do{
            System.out.println(menuOpcoes());
            opc = input.nextInt();
            //IAGO ANTUNES FERREIRA
            switch(opc){
                case 1://Adicionando Empregado
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    input.nextLine();
                    System.out.println("Endereco:");
                    String endereco = input.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = input.nextLine();
                    //---------------------------------
                    System.out.println(menuEmpregos());
                    Integer codigoSetor = input.nextInt();
                    if(codigoSetor==1){
                        empregados.add(new Administrador(nome, endereco, telefone, codigoSetor));
                    }else if(codigoSetor == 2){
                        System.out.println("Valor producao:");
                        int valorProducao = input.nextInt();
                        empregados.add(new Operario(nome, endereco, telefone, codigoSetor,valorProducao));
                    }else if(codigoSetor == 3){
                        System.out.println("Valor vendas:");
                        double valorVendas = input.nextDouble();
                        empregados.add(new Vendedor(nome, endereco, telefone, codigoSetor,valorVendas));
                    }
                    break;
                case 2://Adicionando
                    System.out.println("Nome:");
                    nome = input.nextLine();
                    input.nextLine();
                    System.out.println("Endereco:");
                    endereco = input.nextLine();
                    input.nextLine();
                    System.out.println("Telefone: ");
                    telefone = input.nextLine();
                    input.nextLine();
                    //---------------------------------
                    System.out.println("Limite de Credito:");
                    Integer LimiteCredito = input.nextInt();
                    System.out.println("Valor da divida");
                    Integer valorDivida = input.nextInt();

                    fornecedores.add(new Fornecedor(nome, endereco, telefone, LimiteCredito, valorDivida));
                    break;
    
                case 3://Selecionando todos empregados
                    for (Empregado x : empregados) {
                        System.out.println(x.toString());
                    }
                break;
                case 4://Selecionar por setor
                    System.out.println("Setor a ser procurado:");
                    System.out.println(menuEmpregos());
                    int setorProcura = input.nextInt();
                    for (Empregado x : empregados) {
                        if(x.getCodigoSetor() == setorProcura){
                            System.out.println(x.toString());
                        }
                    }
                    break;
                
                case 5://Seleciona todos os Fornecedores
                    for(Fornecedor x : fornecedores){
                        System.out.println(x.toString());
                    }
                    break;
                case 6://Entrar fornecedor
                    System.out.println("Codigo Fornecedor no List: ");
                    int codigoEntrar = input.nextInt();
                    Fornecedor a = fornecedores.get(codigoEntrar);
                    System.out.println(menuAlteraFornecedor());
                    int opcMenuAlterarFornecedor = input.nextInt();
                    switch(opcMenuAlterarFornecedor){
                        case 1:
                            System.out.println("Novo limite de Credito:");
                            LimiteCredito = input.nextInt();
                            a.setLimiteCredito(LimiteCredito);
                            break;
                        case 2:
                            System.out.println("Novo valor Divida");
                            valorDivida = input.nextInt();
                            a.setvalorDivida(valorDivida);
                            break;
                        case 3:
                            System.out.println("Obter saldo restante");
                            System.out.println(a.ObterSaldoRestante());
                            break;
                    }
                    break;
                case 7://Entrar empregado
                    System.out.println("Codigo Empregado no List");
                    int codigoEntrarEmpregado = input.nextInt();
                    Empregado e = empregados.get(codigoEntrarEmpregado);
                    System.out.println(menuAlterarEmpregado());
                    int opcMenuAlterarEmpregado = input.nextInt();
                    switch(opcMenuAlterarEmpregado){
                        case 1://Alterar Endereco
                            System.out.println("Novo endereco:");
                            input.nextLine();
                            endereco = input.nextLine();
                            e.setEndereco(endereco);
                            break;
                        case 2://Altera Telefone
                            System.out.println("Novo Telefone:");  
                            input.nextLine();
                            telefone = input.nextLine();
                            e.setTelefone(telefone);
                            break;
                        case 3://Aumenta salario
                            System.out.println("Salario Aumentado...");
                            e.aumentarSalario();
                            break;
                        case 4:
                            System.out.println("Novo salario Base:");
                            double newsalariobase = input.nextDouble();
                            e.alterarSalarioBase(newsalariobase);
                            break;
                    }
                    break;
            }
        }while(opc != 9);
    }//IAGO ANTUNES FERREIRA
    public static String menuEmpregos(){
        return "\nSelecione uma Opção:"+
        "\n[1]Administrador"+
        "\n[2]Operario"+
        "\n[3]Vendedor";
    }
    public static String menuOpcoes(){
        return "\n\nSelecione uma Opcao: "+
        "\n[1]Adicionar Empregado: "+
        "\n[2]Adicionar Fornecedor"+
        "\n[3]Selecionar todos empregados "+
        "\n[4]Selecionar empregados por setor "+
        "\n[5]Selecionar todos fornecedores "+
        "\n[6]Entrar fornecedor "+
        "\n[7]Entrar empregado ";
    }
    public static String menuAlteraFornecedor(){
        return "\nSelecione uma opcao"+
        "\n[1]Alterar limiteCredito"+
        "\n[2]Alterar valorDivida"+
        "\n[3]Obter saldo restante";
    }
    public static String menuAlterarEmpregado(){
        return "\nSeleciona uma opcao"+
        "\n[1]Alterar Endereco"+
        "\n[2]Alterar Telefone"+
        "\n[3]Aumentar Salario"+
        "\n[4]Alterar SalarioBase";
    }
}
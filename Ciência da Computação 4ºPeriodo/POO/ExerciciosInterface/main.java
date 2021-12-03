package ExerciciosInterface;

import java.util.ArrayList;

public class main {
    public static void main(String args[]){

        var prioridades = new ArrayList<IPrioridade>();
        var lista = new ArrayList<Pessoa>();
        //Iago Antunes Ferreira
        //Cliente
        var cliente = new Cliente("Joao","SP");
        cliente.AdicionaProdutos(new Produto("Celular", 4000));
        cliente.AdicionaProdutos(new Produto("Notebook", 10000));
        //Funcionarios
        var engenheiro = new Engenheiro("Luis", "SP", "123",2000d,200);
        var gerente = new Gerente("Pedro", "MG","256",10000d,"RH");
        var motorista = new Motorista("Luana", "RJ", "354",2000d, 365);
        var secretaria = new Secretaria("Matheus", "GO","487",1000d, "Ingles");
        
        lista.add(cliente);
        lista.add(engenheiro);
        lista.add(gerente);
        lista.add(motorista);
        lista.add(secretaria);

        for(var pessoa : lista){
            System.out.println(pessoa.Escrever());
            if(pessoa instanceof Cliente cl){
                for(Produto produto : cl.getProdutos()){
                    System.out.println("Nome:"+produto.nomeProduto);
                }
            }
        }
        //Iago Antunes Ferreira
        //------Prioridades
        prioridades.add(cliente);
        prioridades.add(secretaria);
        prioridades.add(gerente);

        System.out.println("\n\n");

        for(var pessoa : prioridades){
            System.out.println(pessoa.autentica()?"Autenticado":"Nao Autenticado");
        }
    }
}

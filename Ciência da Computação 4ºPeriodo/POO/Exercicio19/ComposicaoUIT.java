/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20211015.composicaouit;

/**
 *
 * @author danie
 */
public class ComposicaoUIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Carro gol = new Carro();
        gol.setModelo("Quadrado");
        gol.setNumPortas(2);
        gol.setMotor(new Motor());
        
        
        gol.getMotor().setCombustivel("Alcool");
        gol.getMotor().setPotencia(1.8);
        
        gol.adicionaPassageiro(new Pessoa("Lucas", 80.5));
        gol.adicionaPassageiro(new Pessoa("Edmilson", 65));
        
        
       for(Pessoa x : gol.getPassageiros()){
            System.out.println(x.getNome());
        }
        
        String nome = "Lucas";
        
        for(Pessoa x : gol.getPassageiros()){
            if(x.getNome().equals(nome))
            gol.removePassageiro(x);
        }
        
        System.out.println("Após remover");
        for(Pessoa x : gol.getPassageiros()){
            System.out.println(x.getNome());
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

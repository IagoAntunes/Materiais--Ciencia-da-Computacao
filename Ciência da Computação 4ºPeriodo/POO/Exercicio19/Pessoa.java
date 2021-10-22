/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio19;

/**
 *
 * @author danie
 */
public class Pessoa {
    
    private String nome;
    private double peso;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", peso=" + peso + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}

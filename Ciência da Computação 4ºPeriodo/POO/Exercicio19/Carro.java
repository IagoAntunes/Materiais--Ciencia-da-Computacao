/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio19;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Carro {
    private double capacidadeTanque;
    private double litrosNoTanque;
    private double velocidadeAtual;
    private boolean ligado = false;
    private String modelo;
    private int numPortas;
    private Motor motor;
    ArrayList<Pessoa> passageiros = new ArrayList<>();
    
    
    public void adicionaPassageiro(Pessoa pessoa){
        passageiros.add(pessoa);
    }

    public ArrayList<Pessoa> getPassageiros() {
        return passageiros;
    }
    
    
    public void removePassageiro(Pessoa pessoa){
        passageiros.remove(pessoa);
    }   
    
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public void abastecer(double litros){
        this.litrosNoTanque+=litros;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" + "capacidadeTanque=" + capacidadeTanque + ", litrosNoTanque=" + litrosNoTanque + ", velocidadeAtual=" + velocidadeAtual + ", ligado=" + ligado + ", modelo=" + modelo + ", numPortas=" + numPortas + ", motor=" + motor + '}';
    }
    
    
    
}

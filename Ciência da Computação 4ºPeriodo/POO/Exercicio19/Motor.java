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
public class Motor {
    private String combustivel;
    private int valvulas;
    private double potencia;

    @Override
    public String toString() {
        return "Motor{" + "combustivel=" + combustivel + ", valvulas=" + valvulas + ", potencia=" + potencia + '}';
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    
}

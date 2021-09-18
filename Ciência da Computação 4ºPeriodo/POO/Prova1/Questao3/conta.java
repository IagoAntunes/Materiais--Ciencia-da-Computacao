package Prova1.Questao3;
public class conta {
    private String titular;
    private int numero;
    private double saldo;

    //Set
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    //Get
    public String getTitular(){
        return this.titular;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
}

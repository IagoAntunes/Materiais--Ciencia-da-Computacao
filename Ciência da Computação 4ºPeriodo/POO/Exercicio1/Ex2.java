package Exercicio1;
//Criar a classe caneta com pelo menos 3 atributos e 3 métodos... Instanciar uma caneta no método main

import java.util.Scanner;

class caneta{
    String cor;
    String marca;
    int quantidade;
    int escreveu;

    public void inicializando(){
        this.cor = " ";
        this.marca = " ";
        this.quantidade = 0;
    }
    public void setColor(String cor){
        this.cor = cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setQtd(int qtd){
        this.quantidade = qtd;
    }
    public String getColor(){
        return cor;
    }
    public String getTam(){
        return marca;
    }
    public int getQtd(){
        return quantidade;
    }
    public int getEsscreveu(){
        return escreveu;
    }


    public void printar(){
        System.out.println("Cor = "+getColor()+
        "\nTamanho= "+getTam()+
        "\nQuantidade="+getQtd()+
        "\nEscreveu: +");
    }
    public void escrever(){
        this.escreveu = getEsscreveu() + 1;
    }
    public void changeColor(String color){
        this.cor = color;
    }
}
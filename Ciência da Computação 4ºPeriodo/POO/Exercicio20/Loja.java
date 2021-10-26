package Exercicio20;

import java.util.ArrayList;

public class Loja {
    
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private String nome;

    String produtosStr = "";
    String produtosQTD1 = "";
    String produtosQTD = "";
    int produtoTotal;
    //iago Antunes Ferreira
    public String getNome() {
        return nome;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionaProdutos(Produto produto){
        produtos.add(produto);
    }
    public String mostraQuantidadeProdutos(){
        produtosQTD = "";
        for(Produto x : getProdutos()){
            produtosQTD += x.toString() + "\n";
        }
        return produtosQTD;
    }
    public String mostraQuantidadeProdutos(String nome){
        produtosQTD1 = "";
        for(Produto x : getProdutos()){
            if(x.getNome().equals(nome)){
                produtosQTD1 += x.toString() + "\n";
            }
        }
        return produtosQTD1;
    }
    //Iago Antunes Ferreira
    public String mostraProdutosAbaixoDoMinimo(){
        produtosStr = "";
        for(Produto x : getProdutos()){
            if(x.getQtdeAtual() < x.getQtdeMinima())
                produtosStr += x.toString() + "\n";
        }
        return produtosStr;
    }

    public int totalprodutos(){
        for(Produto x : getProdutos()){
            produtoTotal = produtoTotal + x.getQtdeAtual();
        }
        return produtoTotal;
    }

}

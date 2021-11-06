package Exercicio19.teste4;

public class pessoa {
    
    private int id;
    private String nome;
    private Double altura;
    private Double peso;
    private Double imc;

    public pessoa(int id,String nome,Double altura,Double peso){
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    //Iago Antunes Ferreira
    public String calculoIMC(){
        String imcString = "";
        if(getIMC() < 18.5){
            imcString = "Abaixo do Peso";
        }else if(getIMC() <= 24.9){
            imcString = "Peso normal";
        }else if(getIMC() <= 34.9){
            imcString = "Obesidade grau 1";
        }else if(getIMC() <= 39.9){
            imcString = "Obesidade grau 2";
        }else{
            imcString = "Obesidade grau III ou Morbida";
        }
        return imcString;
    }
    public Double getIMC(){
        this.imc = (peso/(altura*altura));
        return imc;
    }
    public Double getIMC(Double peso,Double altura){
        this.imc = (peso/(altura*altura));
        return imc;
    }

    //Iago Antunes Ferreira
    @Override
    public String toString() {
        return "\n\nId:"+getId()+"\nNome:"+getNome()+"\nPeso: "+getPeso()+"\nImc Situacao: "+calculoIMC();
    }



    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }

    //Iago Antunes Ferreira
    public Double getAltura() {
        return altura;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Double getPeso() {
        return peso;
    }

    
}

package Exercicio4;

public class pessoa {
    //IMC = peso/ (altura x altura),
    private String nome;
    private int sexo;
    private double peso;
    private double altura;
    private double imc;

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = Integer.parseInt(sexo);
    }
    public void setPeso(String peso){
        this.peso = Integer.parseInt(peso);
    }
    public void setAltura(String altura){
        this.altura = Integer.parseInt(altura);
    }
    public String getNome(){
        return this.nome;
    }
    public int getSexo(){
        return this.sexo;
    }
    public Double getPeso(){
        return this.peso;
    }
    public Double getAltura(){
        return this.altura;
    }
    public Double getImc(){
        return this.imc;
    }
    public String CalculoIMC(){
        imc = (getPeso()/((getAltura()/100) * (getAltura()/100)));
        if(imc < 18.5){
            return("MAGREZA" +" IMC = " + imc);
        }else if(imc < 24.9){
            return ("NORMAL" +" IMC = "+ imc);
        }else if(imc < 29.9){
            return ("SOBREPESO"+" IMC = "+ imc);
        }else if(imc < 39.9){
            return ("OBESIDADE"+" IMC = "+ imc);
        }else{
            return ("OBESIDADE GRAVE"+" IMC = "+ imc);
        }
    }
    public String imprimir(){
        return ("Nome: "+ getNome() + "\nSexo: " + getSexo() + "\nAltura: "+(getAltura()/100) + "\nPeso: "+ getPeso() + "\n");
    }
}

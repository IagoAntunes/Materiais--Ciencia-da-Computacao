
package Exercicio4;
import java.text.DecimalFormat;

public class pessoa {
    //IMC = peso/ (altura x altura),
    private String nome;
    private String sexo;
    private double peso;
    private double altura;
    private double imc;

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        
        if(Integer.parseInt(sexo) == 1){
            this.sexo = "Masculino";
        }else if(Integer.parseInt(sexo)== 2){
            this.sexo = "Feminino";
        }else{
            this.sexo = sexo;
        }

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
    public String getSexo(){
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
        DecimalFormat df = new DecimalFormat("###,##0.00");
        imc = (getPeso()/((getAltura()/100) * (getAltura()/100)));
        if(imc < 18.5){
            return("MAGREZA" +"\nIMC = " + df.format(imc));
        }else if(imc < 24.9){
            return ("NORMAL" +"\nIMC = "+ df.format(imc));
        }else if(imc < 29.9){
            return ("SOBREPESO"+"\nIMC = "+ df.format(imc));
        }else if(imc < 39.9){
            return ("OBESIDADE"+"\nIMC = "+ df.format(imc));
        }else{
            return ("OBESIDADE GRAVE"+"\nIMC = "+ df.format(imc));
        }
    }
    public String imprimir(){
        return ("Nome: "+ getNome() + "\nSexo: " + getSexo() + "\nAltura: "+(getAltura()/100) + "\nPeso: "+ getPeso() + "\n");
    }
}
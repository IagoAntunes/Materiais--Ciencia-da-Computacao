package InicialHeranca.Exercicio1;

import java.util.Set;

public class Animal {
    private String nome;
    private float comprimento;
    private Integer nPatas;
    private String cor;
    private String ambiente;
    private Double vMedia;
    private String som;
  
    public Animal(String nome, float comprimento, Integer nPatas, String cor, String ambiente, Double vMedia) {
      this.nome = nome;
      this.comprimento = comprimento;
      this.nPatas = nPatas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.vMedia = vMedia;
    }
    
    public String emitirSom(){
      return getSom();
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som){
      this.som = som;
    }

    public String getAmbiente() {
      return ambiente;
    }
    public float getComprimento() {
      return comprimento;
    }
    public String getCor() {
      return cor;
    }
    public String getNome() {
      return nome;
    }
    public Integer getnPatas() {
      return nPatas;
    }
    public Double getvMedia() {
      return vMedia;
    }
  
    public void setAmbiente(String ambiente) {
      this.ambiente = ambiente;
    }
    public void setComprimento(float comprimento) {
      this.comprimento = comprimento;
    }
    public void setCor(String cor) {
      this.cor = cor;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public void setnPatas(Integer nPatas) {
      this.nPatas = nPatas;
    }
    public void setvMedia(Double vMedia) {
      this.vMedia = vMedia;
    }

    @Override
    public String toString() {
      return "\nNome: "+getNome()+
      "\nComprimento: "+getComprimento()+
      "\nNumero de Patas: "+getnPatas()+
      "\nCor: "+getCor()+
      "\nAmbiente: "+getAmbiente()+
      "\nVelocidade Media: "+getvMedia();
    }
}

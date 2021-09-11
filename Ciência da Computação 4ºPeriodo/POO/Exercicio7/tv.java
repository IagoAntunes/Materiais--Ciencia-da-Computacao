package Exercicio7;

public class tv {
    
    private int canal;
    private int volume;
    private String marca;
    private int qtdCanais;
    private int volumeMaximo;
    private Boolean ligado;

    public tv(String marca){
        this.marca = marca;
    }
    public tv(String marca,int qtdCanais,int volumeMaximo){
        this.marca = marca;
        this.qtdCanais = qtdCanais;
        this.volumeMaximo = volumeMaximo;
    }
    //get
    public int getVolume(){
        return this.volume;
    }
    public int getCanal(){
        return this.canal;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    //set
    public void setCanal(int canal){
        this.canal = canal;
    }
    //Funções
    public void aumentaVolume(){
        if(isLigado() && volumeMaximo < 100)
            this.volume = getVolume() + 1;
    }
    public void diminuiVolume(){
        if(isLigado() && volumeMaximo > 0)
            this.volume = getVolume() - 1;
    }
    public void aumentaCanal(){
        if(isLigado() == true && getCanal() < qtdCanais){
            this.canal = getCanal() + 1;
        }else{
            this.canal = 0;
        }
    }
    public void aumentaCanal(int aumenta){
        if(isLigado() == true){
            this.canal = getCanal() + aumenta;
        }
    }
    public void diminuiCanal(){
        if(isLigado() == true){
            this.canal = getCanal() - 1;
        }
    }
    public void diminuiCanal(int diminui){
        if(isLigado() == true){
            this.canal = getCanal() - diminui;
        }
    }
    public void escolheCanal(int escolha){
        if(isLigado() == true){
            setCanal(escolha);
        }
    }
    public String consulta(){
        return "Volume: "+getVolume()+" Canal: "+getCanal();
    }
    public Boolean isLigado(){
        if(getLigado() == true){
            return true;
        }else{
            return false;
        }
    }



    


}

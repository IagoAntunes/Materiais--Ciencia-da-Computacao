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
        this.ligado = false;
    }
    public tv(String marca,int qtdCanais,int volumeMaximo){
        this.marca = marca;
        this.qtdCanais = qtdCanais;
        this.volumeMaximo = volumeMaximo;
        this.ligado = false;
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
    public void setLigado(){

        if(getLigado() == false){
            this.ligado = true;
        }else if(getLigado() == true){
            this.ligado = false;
        }
    }
    //Funções
    public void aumentaVolume(){
        if(isLigado() == true && getVolume() < this.volumeMaximo)
            this.volume = getVolume() + 1;
    }
    public void diminuiVolume(){
        if(isLigado() && getVolume() > 0)
            this.volume = getVolume() - 1;
    }
    public void aumentaCanal(){
        if(isLigado() == true && getCanal() < qtdCanais){
            this.canal = getCanal() + 1;
        }else{
            this.canal = 0;
        }
    }
    public void aumentaCanal(int canal){
        if(isLigado() == true && canal < qtdCanais && canal > 0){
            this.canal = canal;
        }
    }
    public void diminuiCanal(){
        if(isLigado() == true && getCanal() > 0){
            this.canal = getCanal() - 1;
        }
    }
    public void escolheCanal(int escolha){
        if(isLigado() == true && escolha> 0 && escolha < this.qtdCanais){
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


    public String toString(){
        return  "\nMarca:"+this.marca+ "\nVolume: "+getVolume()+"\nCanal: "+getCanal()+"\nLigado: "+getLigado();
    }

    


}

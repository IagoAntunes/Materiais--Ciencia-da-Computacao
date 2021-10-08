package Exercicio13;

import javax.swing.text.StyledEditorKit.BoldAction;

public class computador {
    

    private int tamanhoHD;
    private int tamanhoRAM;
    private int nProcessadores;
    private String Fabricante;
    public static int RAMestatica = 512;
    private boolean ligado;

    public computador(int tamanhoHD,int tamanhoRAM,int nProcessadores,String Fabricante){
        this.tamanhoHD = tamanhoHD;
        this.tamanhoRAM = tamanhoRAM;
        this.nProcessadores = nProcessadores;
        this.Fabricante = Fabricante;

        this.ligado = false;
    }

    public void ligarComputador(){
        if(getEstadoComputador() == false){
            this.ligado = true;
        }
    }
    public void desligarComputador(){
        if(getEstadoComputador() == true){
            this.ligado = false;
        }
    }

    public void setTamanhoHD(int tamanhoHD) {
        if(tamanhoHD > 0)
            this.tamanhoHD = tamanhoHD;
    }
    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }
    public void setnProcessadores(int nProcessadores) {
        if(nProcessadores > 0)
            this.nProcessadores = nProcessadores;
    }
    public void setTamanhoRAM(int tamanhoRAM) {
        if(tamanhoRAM > 0)
            this.tamanhoRAM = tamanhoRAM;
    }

    public int getTamanhoHD() {
        return tamanhoHD;
    }
    public String getFabricante() {
        return Fabricante;
    }
    public int getnProcessadores() {
        return nProcessadores;
    }
    public int getTamanhoRAM() {
        return tamanhoRAM;
    }
    public Boolean getEstadoComputador(){
        return this.ligado;
    }

    @Override
    public String toString() {
        return "\nComputador: "+Fabricante+"\nLigado: "+ligado+"\nTamanhoHD: "+tamanhoHD+
        "\nTamanhoRAM: "+tamanhoRAM+"\nNumero de Processadores: "+nProcessadores;
    }
}

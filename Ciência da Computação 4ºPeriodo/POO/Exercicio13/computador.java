package Exercicio13;

import javax.swing.text.StyledEditorKit.BoldAction;

public class computador {
    

    private int tamanhoHD;
    private int tamanhoRAM;
    private int nProcessadores;
    private int nFabricantes;

    private boolean ligado;

    public computador(int tamanhoHD,int tamanhoRAM,int nProcessadores,int nFabricantes){
        this.tamanhoHD = tamanhoHD;
        this.tamanhoRAM = tamanhoRAM;
        this.nProcessadores = nProcessadores;
        this.nFabricantes = nFabricantes;

        this.ligado = false;
    }

    public void ligarComputador(){
        if(estadoComputador() == false){
            this.ligado = true;
        }
    }
    public void desligarComputador(){
        if(estadoComputador() == true){
            this.ligado = false;
        }
    }


    public void setTamanhoHD(int tamanhoHD) {
        this.tamanhoHD = tamanhoHD;
    }
    public void setnFabricantes(int nFabricantes) {
        this.nFabricantes = nFabricantes;
    }
    public void setnProcessadores(int nProcessadores) {
        this.nProcessadores = nProcessadores;
    }
    public void setTamanhoRAM(int tamanhoRAM) {
        this.tamanhoRAM = tamanhoRAM;
    }

    public int getTamanhoHD() {
        return tamanhoHD;
    }
    public int getnFabricantes() {
        return nFabricantes;
    }
    public int getnProcessadores() {
        return nProcessadores;
    }
    public int getTamanhoRAM() {
        return tamanhoRAM;
    }
    public Boolean estadoComputador(){
        return this.ligado;
    }

    @Override
    public String toString() {
        return "";
    }


}

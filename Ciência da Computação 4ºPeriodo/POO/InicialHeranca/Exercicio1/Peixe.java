package InicialHeranca.Exercicio1;

public class Peixe extends animais {
    
    private String caracteristicas;

    public Peixe(String nome, float comprimento, Integer nPatas, String cor, String ambiente, float vMedia) {
        super(nome, comprimento, nPatas, cor, ambiente, vMedia);
        this.caracteristicas = caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }


    public String dadosPeixe(){
        return "Nome:"+getNome()+
        "Comprimento:"+getnPatas()+
        "Cor:"+getCor()+
        "Ambiente:"+getAmbiente()+
        "vMedia:"+getvMedia()+
        "Caracteristica:"+getCaracteristicas();
    }
}

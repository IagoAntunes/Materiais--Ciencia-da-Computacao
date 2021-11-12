package InicialHeranca.Exercicio1;

public class Peixe extends Animal {
    
    private String caracteristicas;//Atributo caracteristica

    //Construtor
    public Peixe(String nome, float comprimento, Integer nPatas, String cor, String ambiente, Double vMedia,String caracteristicas) {
        super(nome, comprimento, nPatas, cor, ambiente, vMedia);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String emitirSom(){
        return getSom();
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String dadosPeixe(){
        return "\nNome: "+getNome()+
        "\nComprimento: "+getComprimento()+
        "\nCor: "+getCor()+
        "\nAmbiente: "+getAmbiente()+
        "\nvMedia: "+getvMedia()+
        "\nnPatas: "+getnPatas()+
        "\nCaracteristica: "+getCaracteristicas();
        
    }
}

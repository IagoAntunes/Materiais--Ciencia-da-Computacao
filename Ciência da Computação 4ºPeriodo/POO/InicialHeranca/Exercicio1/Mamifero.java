package InicialHeranca.Exercicio1;

public class Mamifero extends Animal {

    private String alimento = "Nao Informado";//Atributo alimento

    public Mamifero(String nome, float comprimento, Integer nPatas, String cor, String ambiente, Double vMedia,String alimento) {
        super(nome, comprimento, nPatas, cor, ambiente, vMedia);
        this.alimento = alimento;
    }
    public Mamifero(String nome, float comprimento, Integer nPatas, String cor, String ambiente, Double vMedia) {
        super(nome, comprimento, nPatas, cor, ambiente, vMedia);
    }
    @Override
    public String emitirSom(){
        return getSom();
    }
    public void setAlimento(String Alimento) {
        this.alimento = Alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    
    public String dadosMamifero(){
        return "\nNome: "+getNome()+
        "\nComprimento: "+getnPatas()+
        "\nCor: "+getCor()+
        "\nAmbiente: "+getAmbiente()+
        "\nvMedia: "+getvMedia()+
        "\nnPatas: "+getnPatas()+
        "\nAlimento: "+getAlimento();
    }
}

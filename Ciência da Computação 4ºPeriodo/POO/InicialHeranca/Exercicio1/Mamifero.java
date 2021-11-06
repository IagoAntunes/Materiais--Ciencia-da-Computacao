public class mamifero extends animal {
    
    private String alimento;

    public mamifero(String nome, float comprimento, Integer nPatas, String cor, String ambiente, float vMedia) {
        super(nome, comprimento, nPatas, cor, ambiente, vMedia);
        this.caracteristicas = caracteristicas;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    
    public String dadosMamifero(){
        return "Nome:"+getNome()+
        "Comprimento:"+getnPatas()+
        "Cor:"+getCor()+
        "Ambiente:"+getAmbiente()+
        "vMedia:"+getvMedia()+
        "Caracteristica:"+getCaracteristicas();
    }


}

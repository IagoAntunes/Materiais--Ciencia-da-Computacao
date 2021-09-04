package Exercicio5;
import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class carro {
    DecimalFormat df = new DecimalFormat("###,##0.00");
    private String modelo;
    private Double capacidade;
    private Double velocidadeMaxima;
    private Double velocidade;
    private Double potencia;

    private Double tanque;
    private Integer situacao;

    //Construtor
    public void carro(String modelo ,Double capacidade, Double velocidadeMaxima,Double potencia){
        setModelo(modelo);
        setCapacidade(capacidade);
        setVelocidadeMaxima(velocidadeMaxima);
        setPotencia(potencia);
        
        setSituacao(0);//Desligado

        this.velocidade = 0.0;
        this.tanque = 0.0;

    }
    //Set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCapacidade(Double capacidade){
        this.capacidade = capacidade;
    }
    public void setVelocidadeMaxima(Double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void setPotencia(Double potencia){
        this.potencia = potencia;
    }
    public void setTanque(Double tanque){
        this.tanque = tanque;
    }
    public void setSituacao(Integer situacao){
        this.situacao = situacao;
    }
    //get
    public Double getCapacidade(){
        return this.capacidade;
    }
    public Double getTanque(){
        return this.tanque;
    }
    public Double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public Double getVelocidade(){
        return this.velocidade;
    }
    public Double getPotencia(){
        return this.potencia;
    }
    public Integer getSituacao(){
        return this.situacao;
    }
    //Funções
    public void Ligar(){
        if(getSituacao() == 0){
            this.situacao = 1;
        }else{
            System.out.print("Ja esta Ligado!!");
        }
        
    }
    public void Desligar(){
        if(getSituacao() == 1){
            this.situacao = 0;
        }else{
            System.out.println("Ja esta Desligado!!");
        }
    }
    public void Abastecer(){
        if(getTanque() == getCapacidade()){
            System.out.println("Capacidade Maxima!!");
        }else{
            this.tanque = this.capacidade;
        }

    }
    public void acelerar(){
        if(getSituacao() == 0){
            System.out.println("Carro Desligado!!");
        }
        else if(getTanque() == 0){
            System.out.println("Carro sem Gasolina!!");
        }else{
            reserva();
            if(this.velocidade >= getVelocidadeMaxima()){
                System.out.println("Velocidade Maxima!!");
            }else{
                if(getPotencia() == 1.0){
                    this.velocidade += 5;
                    this.tanque -= 2;
                }else if(getPotencia() == 1.5){
                    this.velocidade += 10;
                    this.tanque -= 4;
                }else if(getPotencia() == 2.5){
                    this.velocidade += 15;
                    this.tanque -= 8;
                }
                
            }
                
        }
    }
    public void frear(){
        reserva();
        this.velocidade = getVelocidade()/2.0;
        if(getTanque() - 10 < 0){
            this.tanque = 0.0;
        }else{
            this.tanque -= 10.0;
        }
    }
    //Imprimir
    public String printar(){
        return "\n\n"+this.modelo+
        "\nSituacao: "+getSituacao()+
        "\nTanque: "+getTanque()+
        "\nVelocidade: "+df.format(getVelocidade());
    }
    //Outros
    public void reserva(){
        if((getTanque() * 100)/getCapacidade() <= 10){
            System.out.println("CARRO ESTA NA RESERVA!!");
        }
    }

}
    

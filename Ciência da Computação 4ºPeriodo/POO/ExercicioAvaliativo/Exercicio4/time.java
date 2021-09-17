package ExercicioAvaliativo.Exercicio4;

public class time{
    
    private String nome;
    private String serie;
    private Integer nJogadores;

    public time(String nome,String serie,Integer nJogadores){
        this.nome = nome;
        setSerie(serie);
        setNJogadores(nJogadores);
    }
    public void setNJogadores(Integer nJogadores){
        if(nJogadores < 22){
            this.nJogadores = nJogadores;
        }else{
            System.out.println("Numero jogadores maximo!!");
        }
    }
    public void setSerie(String serie){
        if(serie.equals("A") || serie.equals("B") || serie.equals("C") || serie.equals("D") || serie.equals("E")){
            this.serie = serie;
        }else{
            System.out.println("Serie não encontrada!!");
        }
    }
    public String getNome(){
        return this.nome;
    }
    public String getSerie(){
        return this.serie;
    }
    public Integer getnJogadores(){
        return this.nJogadores;
    }

    public String mensagem(){
        return ("\nNome:"+getNome()+"\nSerie:"+getSerie()+"\nNjogadores:"+getnJogadores());
    }



    ///aaaa
}

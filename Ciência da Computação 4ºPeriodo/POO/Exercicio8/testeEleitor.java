package Exercicio8;

public class testeEleitor {
    
    Eleitor eleitor = new Eleitor();

    public String Sistema(){
        if(eleitor.getIdade() < 16){
            return "Não pode votar";
        }else if(eleitor.getIdade() <=17){
            return "Voto opcional";
        }else{
            return "Voto obrigatório";
        }
    }





}

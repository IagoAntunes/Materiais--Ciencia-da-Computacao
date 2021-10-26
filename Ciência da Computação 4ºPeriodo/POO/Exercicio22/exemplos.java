package Exercicio22;

public class exemplos {
    
    //Atributos ESTATICOS
    static int contador = 0;
    private static String nome = "Joao";

    public exemplos(){

        contador++;
    }
    //Iago Antunes Ferreira
    public static int getContador() {
        return contador;
    }
    //Metodo Estaticos
    static String getNome(){
        return nome;
    }
}

import java.io.FileOutputStream;
import java.io.IOException;

public class Arquivo {

    private static String nomeArquivo =
    "C:\\Users\\iagoa\\OneDrive\\Documentos\\Github_P\\Materiais--Ciencia-da-Computacao\\Ciência da Computação 5ºPeriodo\\Projeto e Analise de Algoritmo\\TrabalhoBinario\\cadastro.dat";

    public FileOutputStream getArquivo(){
        try (FileOutputStream arquivo = new FileOutputStream(nomeArquivo)) {
            return arquivo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}

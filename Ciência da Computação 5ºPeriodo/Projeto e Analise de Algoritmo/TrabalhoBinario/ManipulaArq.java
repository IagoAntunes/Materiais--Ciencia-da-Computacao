import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ManipulaArq  {
    
    private static String nameFile =
    "C:\\Users\\iagoa\\OneDrive\\Documentos\\Github_P\\Materiais--Ciencia-da-Computacao\\Ciência da Computação 5ºPeriodo\\Projeto e Analise de Algoritmo\\TrabalhoBinario\\cadastro.dat";

    //#region Gravar
    public DataOutputStream getRecorder() throws FileNotFoundException{
        DataOutputStream recorder = 
            new DataOutputStream(getFile());

        return recorder;
    }
    public FileOutputStream getFile() throws FileNotFoundException{
        FileOutputStream arquivo = new FileOutputStream(nameFile);
        return arquivo;
       
    }
    //#endregion
    
    //#region Ler
    public FileInputStream getInputFile() throws FileNotFoundException{
        FileInputStream arquivo = new FileInputStream(nameFile);
        return arquivo;
    }
    public DataInputStream getInputData() throws FileNotFoundException{
        DataInputStream recorder = new DataInputStream(getInputFile());

        return recorder;
    }
    //#endregion

    public void SalvaValores(int id,String nome,int nota) throws IOException{
        DataOutputStream recorder = getRecorder();
        recorder.writeInt(id);
        recorder.writeUTF(nome);
        recorder.writeInt(nota);
        
    }
}

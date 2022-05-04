
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
class Main
{
    public static void main(String[] args)
    {
        try {
            String nomeArquivo =
            "C:\\Users\\iagoa\\OneDrive\\Documentos\\Github_P\\Materiais--Ciencia-da-Computacao\\Ciência da Computação 5ºPeriodo\\Projeto e Analise de Algoritmo\\testes\\cadastroA.dat";
            // custom buffer size
            try {
                // create a writer
                int BUFFER_SIZE = 16 * 1024; // 16KB

                // create a writer
                FileOutputStream fos = new FileOutputStream(new File(nomeArquivo));
                BufferedOutputStream writer = new BufferedOutputStream(fos, BUFFER_SIZE);
            
                // write data to file
                writer.write("Hey, there!".getBytes());
                writer.write("\n".getBytes());
                writer.write("How are you doing?".getBytes());
            
                // flush remaining bytes
                writer.flush();
                
                // close the writer
                writer.close();
            
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                // create a writer
                int BUFFER_SIZE = 80 * 1024; // 16KB

                // create a writer
                FileOutputStream fos = new FileOutputStream(new File(nomeArquivo));
                BufferedOutputStream writer = new BufferedOutputStream(fos, BUFFER_SIZE);
            
                // write data to file
                writer.write("Opa eai!".getBytes());
                writer.write("\n".getBytes());
                writer.write("Sei la em?".getBytes());
            
                // flush remaining bytes
                writer.flush();
                
                // close the writer
                writer.close();
            
            } catch (IOException ex) {
                ex.printStackTrace();
            }




        }catch(Exception e){

        }
    }
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TrabalhoBinario {
    public static void main(String args[]) {
        
        String fileName = "out.bin";
        try{
            FileOutputStream fileOs = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fileOs);
            os.write(2038);
            os.writeDouble(3.1415);
            os.close();
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("DONE WRITTING");

        try{
            FileInputStream fileIS = new FileInputStream(fileName);
            ObjectInputStream is = new ObjectInputStream(fileIS);
            int x = is.readInt();
            System.out.println(x);
            double d = is.readDouble();
            System.out.println(d);
            is.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
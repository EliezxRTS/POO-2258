import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDocumentE21 {
    public  void leer1(String ruta){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while ((line = reader.readLine()) != null){
                System.out.println("Info: " + line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDocumentE22 {
    public  void leer2(String ruta) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(ruta));
        String line = "";
        while ((line = reader.readLine()) != null){
            System.out.println("Info: " + line);
        }
    }

    public void metodoLecturaUno(String ruta) throws IOException{
        this.metodoLecturaDos(ruta);
    }

    public void metodoLecturaDos(String ruta) throws IOException{
        this.leer2(ruta);
    }
}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDocumentE1 {
    public static void main(String[] args) {
        String ruta = "datos.txt";

        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe...");
            System.out.println(e.getMessage());
        }
    }
}

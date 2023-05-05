import java.io.IOException;

public class MainExtra2 {
    public static void main(String[] args) {
        ReadDocumentE21 readDocumentE21 = new ReadDocumentE21();
        readDocumentE21.leer1("datos.txt");

        System.out.println("---Cambio de manejo de excepcion---");

        ReadDocumentE22 readDocumentE22 = new ReadDocumentE22();
        try{
            readDocumentE22.leer2("datos.txt");
        } catch (IOException e2){
            e2.printStackTrace();
        }

        System.out.println("---Cambio de manejo de excepcion---");

        try{
            readDocumentE22.metodoLecturaUno("daos.txt");
        } catch (IOException e2){
            e2.printStackTrace();
        }
    }
}

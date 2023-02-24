import java.util.Scanner;
public class Tarea1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu Nombre, Profesion y Pais de origen: ");
        String[] entrada = teclado.nextLine().replace("," , "").split(" " );

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Nombre: " + entrada[i].toUpperCase());
            }
            if (i == 1){
                System.out.println("Profesion: " + entrada[i].toUpperCase());
            }
            if (i == 2){
                System.out.println("Pais: " + entrada[i].toUpperCase());
            }
        }
    }
}
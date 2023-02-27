import java.util.Scanner;

public class Tarea3 {
    
    public static void main (String[] args) {
        
        System.out.print("Introduce las jugadas: ");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine().trim().toUpperCase();
        
        String caracteresValidos = "_XO";
        
        while (true){
            int validacionDeCadena = 0;
            for (int i = 0; i < entrada.length() ; i ++){
                if (caracteresValidos.contains(String.valueOf(entrada.charAt(i)))){
                    validacionDeCadena ++;
                }
            }
            if (validacionDeCadena == 9 && entrada.length() == 9){
                break;
            }
            teclado = new Scanner(System.in);
            System.out.print("La cadena no tiene los caracteres correctos \nIntroduce las jugadas: ");
            entrada = teclado.nextLine().trim().toUpperCase();
        }

        System.out.println("-----");
        System.out.println("|" + entrada.charAt(0) + entrada.charAt(1) + entrada.charAt(2) + "|");
        System.out.println("|" + entrada.charAt(3) + entrada.charAt(4) + entrada.charAt(5) + "|");
        System.out.println("|" + entrada.charAt(6) + entrada.charAt(7) + entrada.charAt(8) + "|");
        System.out.println("-----");
    }
}
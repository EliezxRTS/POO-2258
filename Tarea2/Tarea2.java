import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String entrada = teclado.nextLine().trim();
        
        int[] lista_num = new int[entrada.length() + 1];
        
        boolean resultado = false;
        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            int conversor = entrada.charAt(i);
            lista_num[i] = conversor;
        }
        lista_num[lista_num.length - 1] = lista_num[lista_num.length - 2] + 1;
        for (int i = 0; i < lista_num.length - 1; i++) {
            int comparar = lista_num[i];
            if (comparar + 1 == (lista_num[i + 1])){
                contador += 1;
            }
        }
        if (contador == (lista_num.length - 1)){ 
            resultado = true;
        }
        if (resultado == true){
            System.out.println("Resultado: " + resultado);
            System.out.println("Es una cadena conseecutiva de caracteres.");
        }
        else {
            System.out.println("Resultado: " + resultado);
            System.out.println("No es una cadena conseecutiva de caracteres.");
        }
    }
}
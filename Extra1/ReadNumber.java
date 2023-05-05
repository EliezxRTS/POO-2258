import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println("Inicio del programa!");
        Scanner entrada = new Scanner(System.in);

        try {
            int number1 = 10;
            int number2 = Integer.parseInt(entrada.nextLine());
            System.out.println("Division de " + number1 + " entre " + number2 + " es: " + (number1/number2));
        } catch (ArithmeticException arithmeticException){
            System.out.println("No es posible realizar la division entre 0 :(");
        } catch (NumberFormatException numberFormatException){
            System.out.println("El dato ingresado no era un numero >:(");
        } finally {
            System.out.println("Esta instruccion siempre se ejecuta :D");
        }

        System.out.println("Fin del programa!");
    }
}

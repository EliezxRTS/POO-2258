import java.util.Scanner;
public class MainMaquinaDeCafe {
    public static void main(String[] args){
        MaquinaDeCafe maquinaDeCafe1 = new MaquinaDeCafe((short) 5000, (short) 1000, (short) 1500, (short) 50);
        String salir;
        MainMaquinaDeCafe.menu();
        do {
            String opcion;
            Scanner scannerOpcion = new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");
            opcion = scannerOpcion.nextLine();
            while (!MainMaquinaDeCafe.opcionUser(opcion)){
                System.out.println("Opcion no valida, por favor introduce una entre el 1 al 4: ");
                opcion = scannerOpcion.nextLine();
            }
            switch (opcion) {
                case "1" -> {
                    if (maquinaDeCafe1.comprobarIngredientes()) {
                        maquinaDeCafe1.americano();
                        if (maquinaDeCafe1.comprobarSigCafe("americano")){
                            System.out.println("Ya no es posible servir otro cafe americano.");
                        }else{
                            System.out.println("Aun es posible servir otro cafe americano.");
                        }
                    } else {
                        System.out.println("Sin ingredientes para preparar mas cafe...");
                    }
                }
                case "2" -> {
                    if (maquinaDeCafe1.comprobarIngredientes()) {
                        maquinaDeCafe1.expreso();
                        if (maquinaDeCafe1.comprobarSigCafe("expreso")){
                            System.out.println("Ya no es posible servir otro cafe expreso.");
                        }else {
                            System.out.println("Aun es posible servir otro cafe expreso.");
                        }
                    } else {
                        System.out.println("Sin ingredientes para preparar mas cafe...");
                    }
                }
                case "3" -> {
                    if (maquinaDeCafe1.comprobarIngredientes()) {
                        maquinaDeCafe1.capuchino();
                        if (maquinaDeCafe1.comprobarSigCafe("capuchino")){
                            System.out.println("Ya no es posible servir otro cafe capuchino.");
                        }else {
                            System.out.println("Aun es posible servir otro cafe capuchino.");
                        }
                    } else {
                        System.out.println("Sin ingredientes para preparar mas cafe...");
                    }
                }
                case "4" -> System.out.println(maquinaDeCafe1);
            }
            if (maquinaDeCafe1.comprobarIngredientesGeneral()){
                System.out.println("Sin ingredientes para preparar mas cafe...");
                break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa E para salir, o cualquier otra para continuar: ");
            salir = sc.nextLine().toUpperCase();
        } while (!salir.equals("E"));
        System.out.println(maquinaDeCafe1);
        System.out.println("Gracias por consumir con nosotros.");
    }
    public static void menu(){
        System.out.println("""
                Acciones diponibles:
                1) Servir Americano
                2) Servir Expreso
                3) Servir Capuchino
                4) Ver estado de la cafetera
               """);
    }
    public static boolean opcionUser(String opcion) {
        return opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4");
    }
}
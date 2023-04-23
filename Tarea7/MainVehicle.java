public class MainVehicle {
    public static void main(String[] args){
        System.out.println("--- Camion ---");
        Camion camion1 = new Camion("Diesel",18);
        System.out.println(camion1);
        System.out.println(camion1.encender());
        camion1.avanzar();
        camion1.transportar();
        camion1.frenar();
        System.out.println(camion1.apagar());
        System.out.println("--- Motocicleta ---");
        Motorcycle moto1 = new Motorcycle(310,"Roadster");
        System.out.println(moto1);
        System.out.println(moto1.encender());
        moto1.avanzar();
        moto1.wheelie();
        moto1.frenar();
        System.out.println(moto1.apagar());
    }
}
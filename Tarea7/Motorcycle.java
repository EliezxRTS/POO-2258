public class Motorcycle implements Vehicle {
    private int centimetrosCubicos;
    private String clasificacion;

    public Motorcycle() {
    }

    public Motorcycle(int centimetrosCubicos, String clasificacion) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.clasificacion = clasificacion;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", clasificacion='" + clasificacion + '\'' +
                '}';
    }

    public void wheelie() {
        System.out.println("Levantando la moto para levantar miradas...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta tipo " + this.clasificacion);
        return Math.random() > 0.0009;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta tipo " + this.clasificacion);
        return Math.random() > 0.00009;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de " + this.centimetrosCubicos + " CC");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando la motocicleta de " + this.centimetrosCubicos + " CC");
    }
}

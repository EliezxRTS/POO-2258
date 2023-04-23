public class Camion implements Vehicle{
    private String tipoCombustible;
    private double pesoToneladas;

    public Camion() {
    }

    public Camion(String tipoCombustible, double pesoToneladas) {
        this.tipoCombustible = tipoCombustible;
        this.pesoToneladas = pesoToneladas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPesoToneladas() {
        return pesoToneladas;
    }

    public void setPesoToneladas(double pesoToneladas) {
        this.pesoToneladas = pesoToneladas;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", pesoToneladas=" + pesoToneladas +
                '}';
    }

    public void transportar() {
        System.out.println("Transportando la carga al destino...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camion de combustible " + this.tipoCombustible);
        return Math.random() > 0.09;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camion de combustible " + this.tipoCombustible);
        return Math.random() > 0.009;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando el camion de " + this.pesoToneladas + " t");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el camion de " + this.pesoToneladas + " t");
    }
}
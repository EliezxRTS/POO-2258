public interface Vehicle {
    public static final int VELOCIDAD_MAXIMA = 220;
    public static final char CLASIFICACION_EFICIENCIA = 'B';
    public abstract boolean encender();
    public abstract boolean apagar();
    public abstract void avanzar();
    public abstract void frenar();
}
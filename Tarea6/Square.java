public class Square implements Figure{
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.size * this.size;
    }
}
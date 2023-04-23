public class Circle implements Figure{
    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow((this.diameter)/2,2);
    }
}

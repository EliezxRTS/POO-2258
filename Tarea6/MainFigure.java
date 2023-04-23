public class MainFigure {
    public static void main(String[] args){
        Square cuadrado1 = new Square();
        cuadrado1.setSize(8);
        System.out.println("El area del cuadrado es: " + cuadrado1.calcularArea());
        Circle circulo1 = new Circle();
        circulo1.setDiameter(8);
        System.out.println("El area del circulo es: " + circulo1.calcularArea());
    }
}
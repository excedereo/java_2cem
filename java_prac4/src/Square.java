public class Square extends GeometricObject implements Colorable {
    private double side = 0;

    public Square() {super();}

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    // Геттеры
    public double getSide() {return side;}

    // Сеттеры
    public void setSide(double side) {this.side = side;}

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side + ", " + super.toString();
    }
}
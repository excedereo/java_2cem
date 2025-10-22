import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return obj1.compareTo(obj2) >= 0 ? obj1 : obj2;
    }

    // Геттеры
    public Date getDateCreated() { return dateCreated; }
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }

    // Сеттеры
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }


    @Override
    public String toString() {
        return "Цвет: " + color + ", Закрашен: " + filled + ", Площадь: " + getArea();
    }
}
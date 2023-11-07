package tema7.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(int width, int length, int radius) {
        super(width, length);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        double area = Math.PI * radius * radius; // Use Math.PI for a more accurate value of π
        return area;
    }


    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius; // Use Math.PI for a more accurate value of π
        return perimeter;
    }
}

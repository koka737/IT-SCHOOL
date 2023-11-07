package tema7;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);

        circle.calculateArea();

        circle.calculatePerimeter();
    }
}

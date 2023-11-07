package tema7.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0,0,10);
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("circle area: " + circle.calculateArea());
        System.out.println("circle perimeter: " + circle.calculatePerimeter());
        System.out.println("triangle area: " + triangle.calculateArea());
        System.out.println("triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("rectangle area: " + rectangle.calculateArea());
        System.out.println("rectangle perimeter: " + rectangle.calculatePerimeter());

    }
}

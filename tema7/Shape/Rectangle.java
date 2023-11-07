package tema7.Shape;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        super(width, length);
        this.width = width;
        this.length = length;
    }

    public int calculateArea() {
        int area = width * length;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (width + length);
        return perimeter;
    }
}

package tema7.Shape;

public class Shape {

    public int width;
    public int length;

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area(){
        return width * length;
    }
    public int perimeter(){
        return 2 * (width + length);
    }

}

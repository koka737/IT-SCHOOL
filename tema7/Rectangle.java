package tema7;


public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo(){
        System.out.println("Length: " + length);
        System.out.println("Width: "+ width);

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30, 10);


        System.out.println("Information:");
        rectangle.displayInfo();
    }
}

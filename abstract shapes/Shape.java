//example of abstraction where the shape class is a blue print for any shape class you create, all shapes will inherit these methods
public abstract class Shape {
    protected double length = 0;
    protected double width = 0;
    protected double pi = 3.14;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // example of method overloading, 2 different methods for area calculating where
    // 1 is for rectangles and the other is for circles
    public double calculateArea(double length, double width) {
        return length + width;
    }

    public double calculateArea(double length) {
        return 3.14 * (length / 2 * length / 2);
    }

    public void getDescription() {
        System.out.println("This is a shape");
    }

}

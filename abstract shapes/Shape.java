public abstract class Shape {
    private double length = 0;
    private double width = 0;
    private double radius = 0;
    private double pi = 3.14;

    public Shape(double length, double width, double radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getRadius() {
        return radius;
    }
    public double calculateArea() {
        return length + width
    }
    public String getDescription() {
        System.out.println("This is a shape");
    }

}

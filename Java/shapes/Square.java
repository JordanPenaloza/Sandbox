package Java.shapes;

public class Square implements shapes{

    private double base;
    private double height;

    public Square(double base, double height) {
        this.base = base;
        this.height = height;

    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return base * height;
    }
    public String getDescription() {
        return "This is a square";
    }

}

package shapes;



public class Circle implements shapes {

    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return pi * (radius * radius);
    }

    @Override
    public String getDescription() {
        return "This is a circle";
    }
}

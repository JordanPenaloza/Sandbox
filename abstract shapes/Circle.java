public class Circle extends Shape {

    public Circle(double diameter, double pi) {
        super(diameter, pi);
    }

    @Override
    public void getDescription() {
        System.out.println("This is a circle");
    }

    // example of method overriding where we override the calculateArea method and
    // change it's functionality
    @Override
    public double calculateArea(double diameter, double pi) {
        return pi * (diameter / 2 * diameter / 2);
    }

}

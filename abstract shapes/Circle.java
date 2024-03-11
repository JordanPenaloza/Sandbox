public class Circle extends Shape{

    public Circle(double diameter, double pi) {
        super(diameter, pi);
    }
    @Override
    public void getDescription() {
        System.out.println("This is a shape");
    }
    @Override
    public double calculateArea(double diameter, double pi) {
        return pi * (diameter/2 * diameter/2);
    }


}

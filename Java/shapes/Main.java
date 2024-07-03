package Java.shapes;

public class Main {

    public static double radius;
    public static double height;
    public static double base;
    public static void main(String[] args) {
        base = 2;
        height = 2;
        Square square = new Square(base, height);
        System.out.println(square.getDescription());
        System.out.println(square.calculateArea());
        square.setBase(3);
        square.setHeight(3);
        System.out.println(square.calculateArea());

        radius = 3;
        Circle circle = new Circle(radius);
        System.out.println(circle.getDescription());
        System.out.println(circle.calculateArea());
        circle.setRadius(5);
        System.out.println(circle.calculateArea());
    }
}

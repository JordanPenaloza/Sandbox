public class Main {

    public static double squareLength = 0;
    public static double squareWidth = 0;
    public static double pi = 3.14;
    public static double circleDiameter = 0;
    public static void main(String[] args) {
        Square square = new Square(squareLength, squareWidth);
        square.setLength(2);
        square.setWidth(2);
        squareLength = square.getLength();
        squareWidth = square.getWidth();
        System.out.println("The area of the square is " + square.calculateArea(squareLength, squareWidth));
        square.getDescription();
        
        Circle circle = new Circle(circleDiameter, pi);
        circle.setLength(3);
        circleDiameter = circle.getLength();
        System.out.println("The area of the circle is " + circle.calculateArea(circleDiameter, pi));
        circle.getDescription();


        

    }
}

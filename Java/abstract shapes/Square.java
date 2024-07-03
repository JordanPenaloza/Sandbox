public class Square extends Shape {

    public Square(double length, double width) {
        super(length, width);
    }
    @Override
    public void getDescription() {
        System.out.println("This is a square");
    }
}

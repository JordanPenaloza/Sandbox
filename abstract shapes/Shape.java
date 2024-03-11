public abstract class Shape {
    protected double length = 0;
    protected double width = 0;


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
    public double calculateArea(double length, double width) {
        return length + width;
    }
    public void getDescription() {
        System.out.println("This is a shape");
    }

}

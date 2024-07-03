package Java.cars;

public class Car extends Vehicle{

    public Car() {
        
    }
    public void breaks() {
        System.out.println("The car is breaking");
    }
    @Override
    public void move() {
        System.out.println("The car is moving on all 4 wheels");
    }
}

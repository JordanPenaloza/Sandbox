package Java.cars;

public class Vehicle {

    private int wheels;

    public Vehicle () {
        this.wheels = 0;
    }
    public void move() {
        System.out.println("Moving");
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getWheels() {
        return wheels;
    }
   
}

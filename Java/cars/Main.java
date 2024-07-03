package cars;


public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.setWheels(4);
        System.out.println(car.getWheels());
        car.breaks();
    }
}

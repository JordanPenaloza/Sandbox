package animals;
public class main {

    public static String sound;
    public static String breathe;
    public static int legs;

    public static void main(String[] args) {
        Dog dog = new Dog(sound, breathe, legs);
        dog.setWagTail("Wagging tail");

        System.out.println(dog.getWagTail());

        dog.setLegs(4);
        System.out.println(dog.getLegs());



        dog.move();
        
    }

}

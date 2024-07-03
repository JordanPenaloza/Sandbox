package Java.abstractanimals;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(4);
        cat.makeSound();
        cat.eat();
        System.out.println(cat.getLegs());
    }
}

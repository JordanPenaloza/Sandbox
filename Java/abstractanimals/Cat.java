package abstractanimals;

class Cat extends Animals {

    Cat(int legs) {
        super(legs);
    }

    void eat() {
        System.out.println("cat eating");
    }

    void makeSound() {
        System.out.println("meow");
    }

}

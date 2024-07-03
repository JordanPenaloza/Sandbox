package Java.abstractanimals;

abstract class Animals {
    private int legs;

    abstract void eat();

    abstract void makeSound();

    Animals(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

}

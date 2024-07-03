package Java.animals;
public abstract class Animal {

    protected String sound;
    protected String breathe;
    protected int legs;


    public Animal(String sound, String breathe, int legs) {
        this.sound = sound;
        this.breathe = breathe;
        this.legs = legs;
    }
    public void makeSound(String sound) {
        this.sound = sound;
    }
    public void breathe(String breathe) {
        this.breathe = breathe;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}
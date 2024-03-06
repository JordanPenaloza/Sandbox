package animals;

public class Dog extends Animal implements MoveableCreatures {

    private String wagTail;

    public Dog(String sound, String breathe, int legs) {
        super(sound, breathe, legs);
        this.wagTail = " ";
    }
    public void setWagTail(String wagTail) {
        this.wagTail = wagTail;
    }
    public String getWagTail() {
        return wagTail;
    }
    @Override
    public void move() {
        System.out.println("The dog walks on all 4's");
    }
    
    public void makeSound() {
        this.sound = "bark";
        super.makeSound(sound);
    }
}

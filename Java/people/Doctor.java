package people;

public class Doctor extends Person {

    protected int yearsExperience = 0;

    public Doctor(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public void getDesc() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old, I am a doctor with "
                + yearsExperience + " years of experience");
    }

}

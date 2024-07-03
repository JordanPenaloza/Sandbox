package Java.people;

public class DoctorAssistant extends Doctor {

    public DoctorAssistant(int yearsExeprience) {
        super(yearsExeprience);
    }

    @Override
    public void getDesc() {
        System.out.println("My name is " + name + " and I am " + age + " years old, I am a doctor assistant with "
                + yearsExperience + " years of experience");
    }
}
